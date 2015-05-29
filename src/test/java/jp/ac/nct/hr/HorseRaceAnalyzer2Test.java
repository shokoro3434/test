package jp.ac.nct.hr;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.math3.stat.correlation.SpearmansCorrelation;

import com.opencsv.CSVWriter;

import junit.framework.TestCase;

public class HorseRaceAnalyzer2Test extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	private int x(int jiku, int himo) {
		if (jiku == 1) {
			return himo * 2;
		} else {
			return (himo + jiku - 1) * jiku + himo * jiku;
		}

	}
	public void testxx() throws Exception{
		FileInputStream fis = null;
		List<String> lst = new ArrayList();
		try{
			fis = new FileInputStream("bin.lst");
			byte [] data = readAll(fis);
			Object a = uncompress(data);
			List<String> t = (List<String>)a;
			System.out.println(t);
		}
		finally{
			fis.close();
		}
	}
	public byte[] readAll(InputStream inputStream) throws IOException {
	    ByteArrayOutputStream bout = new ByteArrayOutputStream();
	    byte [] buffer = new byte[1024];
	    while(true) {
	        int len = inputStream.read(buffer);
	        if(len < 0) {
	            break;
	        }
	        bout.write(buffer, 0, len);
	    }
	    return bout.toByteArray();
	}
	public void testx() throws Exception{
		
		File log = new File("D:/ICF_AUtoCapsule_Disabled/home/takahiro/projects/vmob/target/bdhcrm/log/bdhcrm.log.old2");
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(log)));
		BufferedOutputStream writer = null;
		List<String> lst = new ArrayList();
		try{
			writer = new BufferedOutputStream(
					new FileOutputStream("bin.lst"));
			int cnt = 0;
			for (;;){
				if (cnt>=30000){
					break;
				}
				String line = br.readLine();
				if (line == null){
					return;
				}
				if (line.indexOf("json:") == -1){
					continue;
				}
				String json = line.substring(line.lastIndexOf("json:")+"json: ".length(),line.length());
				
				//System.out.println (json);
				JSONObject root = JSONObject.fromObject(json);
				JSONArray values = root.getJSONArray("value");
				for (int i = 0 ; i < values.size() ; i ++){
					JSONObject value = values.getJSONObject(i);
					if (value.has("ExtendedData")){
						String ex = value.getString("ExtendedData");
						if (ex.isEmpty()){
							continue;
						}
						//System.out.println (ex);
						JSONObject ex2 = JSONObject.fromObject(ex);
						//System.out.println (ex2);
						if (value.has("EmailAddress")){
							String email = value.getString("EmailAddress");
							if (ex2.has("password") && !email.isEmpty()){
								if (ex2.getString("password").endsWith("=")){
									continue;
								}
//								System.err.print (email);
//								System.err.print (",");
//								System.err.println (ex2.get("password"));
								String data = email+","+ex2.get("password)"+",");
//								writer.writeNext(new String[]{compress()});
								writer.write(data.getBytes());
//								lst.add(data);
								++cnt;
							}
						}
					}
					else{
						//System.err.println("no ex found");
					}
//					resultset.has(key)
				}
//				writer.write(lst);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			writer.close();
			if (br != null) {
				br.close();
			}

		}
	}

	/**
	 * オブジェクトをシリアライズ後、ZIP圧縮。
	 * 
	 * @param obj
	 *            　圧縮対象オブジェクト
	 * @return 圧縮したバイナリデータ
	 * @throws IOException
	 *             圧縮処理に失敗した場合。
	 */
	public byte[] compress(Object obj) throws IOException {
		ByteArrayOutputStream bos = null;
		GZIPOutputStream gos = null;
		try {
			bos = new ByteArrayOutputStream();
			gos = new GZIPOutputStream(bos);

			ObjectOutputStream oos;
			oos = new ObjectOutputStream(gos);
			oos.writeObject(obj);
			gos.finish();
			return bos.toByteArray();
		} finally {
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					throw e;
				}
			}

			if (gos != null) {
				try {
					gos.close();
				} catch (IOException e) {
					throw e;
				}
			}
		}
	}

	/**
	 * バイナリデータをZIP展開後、デシリアイズ。
	 * 
	 * @param src
	 *            　compressで圧縮したバイナリデータ
	 * @return 復元したObject
	 * @throws IOException
	 *             展開処理に失敗した場合。
	 * @throws ClassNotFoundException
	 *             デシリアイズに失敗した場合。
	 * 
	 */
	public Object uncompress(byte[] src) throws IOException, ClassNotFoundException {

		ByteArrayInputStream bis = null;
		ByteArrayOutputStream bos = null;
		GZIPInputStream gis = null;

		try {

			bis = new ByteArrayInputStream(src);
			gis = new GZIPInputStream(bis);
			bos = new ByteArrayOutputStream();

			int length = 0;
			byte[] tmp = new byte[4096];
			while ((length = gis.read(tmp, 0, tmp.length)) != -1) {
				bos.write(tmp, 0, length);
			}

			byte[] bobj = bos.toByteArray();

			ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bobj));
			return ois.readObject();
		} finally {
			if (bis != null) {
				try {
					bis.close();
				} catch (Exception e) {
				}
			}

			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					throw e;
				}
			}

			if (gis != null) {
				try {
					gis.close();
				} catch (IOException e) {
					throw e;
				}
			}
		}
	}

	public void testA() {
		try {
			HorseRaceAnalyzer2.main(new String[] { "./c5/12.csv.out" });
			HorseRaceAnalyzer2.main(new String[] { "./h3/10.csv.out" });
			HorseRaceAnalyzer2.main(new String[] { "./h3/11.csv.out" });
			HorseRaceAnalyzer2.main(new String[] { "./h3/12.csv.out" });
			HorseRaceAnalyzer2.main(new String[] { "./n3/10.csv.out" });
			HorseRaceAnalyzer2.main(new String[] { "./n3/11.csv.out" });
			HorseRaceAnalyzer2.main(new String[] { "./n3/12.csv.out" });
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void testB() {
		double[] data1 = { 20, 17, 30, 42.3, 17, 50 };
		double[] data2 = { 15, 32, 18, 9.3, 7, 5 };

		SpearmansCorrelation cor = new SpearmansCorrelation();
		System.out.println(cor.correlation(data1, data2));
	}

	public void testC5() {
		try {
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/c5/10.csv.out" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/c5/11.csv.out" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/c5/12.csv.out" });
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void testN1() {
		try {
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/n1/10.csv.out" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/n1/11.csv.out" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/n1/12.csv.out" });
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void testH1() {
		try {
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/h1/10.csv.out" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/h1/11.csv.out" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/h1/12.csv.out" });
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void testN3_5() throws Exception {
		try {
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/n/3/5/6.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/n/3/5/7.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/n/3/5/8.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/n/3/5/9.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/n/3/5/10.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/n/3/5/11.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/n/3/5/12.csv.out", "-1" });
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testN3_6() throws Exception {
		try {
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/n/3/6/10.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/n/3/6/11.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/n/3/6/12.csv.out", "-1" });
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testH2_5() throws Exception {
		try {
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/h/2/5/5.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/h/2/5/6.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/h/2/5/7.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/h/2/5/8.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/h/2/5/9.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/h/2/5/10.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/h/2/5/11.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/h/2/5/12.csv.out", "-1" });
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testH2_6() throws Exception {
		try {
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/h/2/6/7.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/h/2/6/8.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/h/2/6/9.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/h/2/6/10.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/h/2/6/11.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/h/2/6/12.csv.out", "-1" });
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testF1() throws Exception {
		try {
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/f/1/1/6.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/f/1/1/10.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/f/1/1/11.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/f/1/1/12.csv.out", "-1" });

			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/f/1/2/8.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/f/1/2/9.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/f/1/2/10.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/f/1/2/11.csv.out", "-1" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/f/1/2/12.csv.out", "-1" });

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
