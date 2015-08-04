package jp.ac.nct.hr;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;


public class Application {
	public static void main(String[] args) throws Exception {
		new Application().methodx();
	}
	@TargetDirectories(targetDirectories = { 
//			"./src/main/resources/2015/kyoto/3/5" ,
//			"./src/main/resources/2015/kyoto/3/10" ,
//			"./src/main/resources/2015/niigata/1/8" ,
//			"./src/main/resources/2015/kyoto/3/12x" ,
//			"./src/main/resources/2015/tokyo/2/12" ,
//			"./src/main/resources/2015/niigata/1/5" ,
//			"./src/main/resources/2015/tokyo/3/2" ,
//			"./src/main/resources/2015/hanshin/3/2" ,
//			"./src/main/resources/2015/kyoto/3/12" ,
//			"./src/main/resources/2015a/tokyo/1/1" ,
//			"./src/main/resources/2015a/hanshin/1/5" ,
//			"./src/main/resources/2015a/hanshin/1/6" ,
//			"./src/main/resources/2015a/hanshin/1/7" ,
//			"./src/main/resources/2015a/tokyo/3/7" ,
//			"./src/main/resources/2015a/tokyo/3/6" ,
//			"./src/main/resources/2015a/hakodate/1/3" ,
//			"./src/main/resources/2015a/nakayama/3/1" ,
//			"./src/main/resources/2015a/nakayama/3/2" ,
//			"./src/main/resources/2015a/nakayama/3/3" ,
//			"./src/main/resources/2015a/nakayama/3/4" ,
//			"./src/main/resources/2015a/nakayama/3/5" ,
//			"./src/main/resources/2015a/nakayama/3/6" ,
//			"./src/main/resources/2015a/nakayama/3/7" ,
//			"./src/main/resources/2015a/nakayama/3/8" ,
//			"./src/main/resources/2015a/hanshin/3/5" ,
//			"./src/main/resources/2015a/hanshin/3/6" ,
//			"./src/main/resources/2015a/hanshin/3/8" ,
//			"./src/main/resources/2015a/tokyo/3/8" ,
			"./src/main/resources/2015a/hakodate/1/5" ,
//			"./src/main/resources/2015a/kyoto/1/1" ,
//			"./src/main/resources/2015a/chukyo/1/2" ,
//			"./src/main/resources/2015a/chukyo/1/3" ,
//			"./src/main/resources/2015a/chukyo/1/4" ,
//			"./src/main/resources/2015a/chukyo/2/1" ,
//			"./src/main/resources/2015a/chukyo/2/2" ,
//			"./src/main/resources/2015a/chukyo/2/3" ,
//			"./src/main/resources/2015a/chukyo/2/4" ,
//			"./src/main/resources/2015a/chukyo/2/5" ,
			"./src/main/resources/2015a/chukyo/3/1" ,
//			"./src/main/resources/2015a/kyoto/1/1" ,
//			"./src/main/resources/2015a/kyoto/1/2" ,
//			"./src/main/resources/2015a/kyoto/1/3" ,
//			"./src/main/resources/2015a/kyoto/1/4" ,
//			"./src/main/resources/2015a/kyoto/1/5" ,
//			"./src/main/resources/2015a/kyoto/1/6" ,
//			"./src/main/resources/2015a/kyoto/1/7" ,
//			"./src/main/resources/2015a/kyoto/1/8" ,
//			"./src/main/resources/2015a/kyoto/1/9" ,
//			"./src/main/resources/2015a/kyoto/2/1" ,
//			"./src/main/resources/2015a/kyoto/2/2" ,
//			"./src/main/resources/2015a/kyoto/2/3" ,
//			"./src/main/resources/2015a/kyoto/2/4" ,
//			"./src/main/resources/2015a/kyoto/2/5" ,
//			"./src/main/resources/2015a/kyoto/2/6" ,
//			"./src/main/resources/2015a/kyoto/2/7" ,
//			"./src/main/resources/2015a/kyoto/2/8" ,
//			"./src/main/resources/2015a/kyoto/3/1" ,
//			"./src/main/resources/2015a/kyoto/3/2" ,
//			"./src/main/resources/2015a/kyoto/3/3" ,
//			"./src/main/resources/2015a/kyoto/3/4" ,
//			"./src/main/resources/2015a/kyoto/3/5" ,
//			"./src/main/resources/2015a/kyoto/3/6" ,
//			"./src/main/resources/2015a/kyoto/3/7" ,
//			"./src/main/resources/2015a/kyoto/3/8" ,
//			"./src/main/resources/2015a/kyoto/3/9" ,
//			"./src/main/resources/2015a/kyoto/3/10" ,
//			"./src/main/resources/2015a/kyoto/3/11" ,
//			"./src/main/resources/2015a/kyoto/3/12" ,
//			"./src/main/resources/2015a/tokyo/1/1" ,
//			"./src/main/resources/2015a/tokyo/1/2" ,
//			"./src/main/resources/2015a/tokyo/1/3" ,
//			"./src/main/resources/2015a/tokyo/1/4" ,
//			"./src/main/resources/2015a/tokyo/1/5" ,
//			"./src/main/resources/2015a/tokyo/1/6" ,
//			"./src/main/resources/2015a/tokyo/1/7" ,
//			"./src/main/resources/2015a/tokyo/1/8" ,
//			"./src/main/resources/2015a/tokyo/2/1" ,
//			"./src/main/resources/2015a/tokyo/2/2" ,
//			"./src/main/resources/2015a/tokyo/2/3" ,
//			"./src/main/resources/2015a/tokyo/2/4" ,
//			"./src/main/resources/2015a/tokyo/2/5" ,
//			"./src/main/resources/2015a/tokyo/2/6" ,
//			"./src/main/resources/2015a/tokyo/2/7" ,
//			"./src/main/resources/2015a/tokyo/2/8" ,
//			"./src/main/resources/2015a/tokyo/2/9" ,
//			"./src/main/resources/2015a/tokyo/2/10" ,
//			"./src/main/resources/2015a/tokyo/2/11" ,
//			"./src/main/resources/2015a/tokyo/2/12" ,
//			"./src/main/resources/2015a/tokyo/3/1" ,
//			"./src/main/resources/2015a/tokyo/3/2" ,
//			"./src/main/resources/2015a/tokyo/3/3" ,
//			"./src/main/resources/2015a/tokyo/3/4" ,
//			"./src/main/resources/2015a/tokyo/3/5" ,
//			"./src/main/resources/2015a/tokyo/3/6" ,
//			"./src/main/resources/2015a/kokura/1/1" ,
//			"./src/main/resources/2015a/kokura/1/2" ,
//			"./src/main/resources/2015a/kokura/1/3" ,
//			"./src/main/resources/2015a/kokura/1/4" ,
//			"./src/main/resources/2015a/kokura/1/5" ,
//			"./src/main/resources/2015a/kokura/1/6" ,
//			"./src/main/resources/2015a/kokura/1/7" ,
//			"./src/main/resources/2015a/kokura/1/8" ,
//			"./src/main/resources/2015a/fukushima/1/1" ,
//			"./src/main/resources/2015a/fukushima/1/2" ,
//			"./src/main/resources/2015a/fukushima/1/3" ,
//			"./src/main/resources/2015a/fukushima/1/4" ,
//			"./src/main/resources/2015a/fukushima/1/5" ,
//			"./src/main/resources/2015a/fukushima/1/6" ,
			"./src/main/resources/2015a/fukushima/2/1" ,
//			"./src/main/resources/2015a/nigata/1/1" ,
//			"./src/main/resources/2015a/nigata/1/2" ,
//			"./src/main/resources/2015a/nigata/1/3" ,
//			"./src/main/resources/2015a/nigata/1/4" ,
//			"./src/main/resources/2015a/nigata/1/5" ,
//			"./src/main/resources/2015a/nigata/1/6" ,
//			"./src/main/resources/2015a/nigata/1/7" ,
//			"./src/main/resources/2015a/nigata/1/8" ,
		}, tokenOrigin = "21")
	private void methodx() throws Exception {
		Method m = Application.class.getDeclaredMethod("methodx", new Class[] {});
		TargetDirectories td = m.getAnnotation(TargetDirectories.class);

		for (String r : td.targetDirectories()) {
			File rootPath = new File(r);
			File[] directories = rootPath.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					// TODO Auto-generated method stub
					return new File(dir.getPath() + "/" + name).isDirectory();
				}

			});
			if (directories.length != 0) {
				for (File directory : directories) {
					invoke(directory, td.tokenOrigin());
				}
			} else {
				invoke(rootPath, td.tokenOrigin());
			}

		}
	}

	private void invoke(File rootPath, String tokenOrigin) throws Exception {
		File[] csvFiles = rootPath.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".csv") && !name.endsWith("r.csv");
			}
		});
		for (File csv : csvFiles) {
			TargetCleaner.main(new String[] { csv.getPath(), csv.getPath() + ".in", tokenOrigin });
		}
		File[] inFiles = rootPath.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".in");
			}
		});
		for (File in : inFiles) {
			HorseRaceAnalyzer.main(new String[] { in.getPath(), in.getPath() + ".out", "-1" });
		}
		File[] outFiles = rootPath.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".out");
			}
		});
		for (File out : outFiles) {
			HorseRaceAnalyzer2.main(new String[] { out.getPath() });
			SVGBuilder.main(new String[] { out.getPath() });
		}
		File[] files = rootPath.listFiles(new FilenameFilter(){
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".tsv");
			}
		});
		Arrays.sort(files,new Comparator(){

			@Override
			public int compare(Object arg0, Object arg1) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});
		CSVPrinter printer = CSVFormat.RFC4180
				.withQuoteMode(QuoteMode.ALL)
//				.withHeader(
//						"R1"
//						,"R2"
//						,"R3"
//						,"S1"
//						,"S2"
//						,"S3"
//						)
						.withDelimiter('\t')
						.withQuote(null)
				.print(new PrintWriter(new OutputStreamWriter(new FileOutputStream(rootPath+"/rank.all.tsv"), "UTF-8")));
		for(File tsv : files) {
			CSVParser parser = null;
			try {
				parser = CSVParser.parse(tsv, Charset.defaultCharset(), CSVFormat.TDF);
				for (CSVRecord record : parser) {
					printer.printRecord(new Object[]{
						record.get(0),
						record.get(1),
						record.get(2),
						record.get(3),
						record.get(4),
						record.get(5),
						record.get(6),
						record.get(7)
					});
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			finally{
				parser.close();
			}
		}
		printer.close();
	}
}
