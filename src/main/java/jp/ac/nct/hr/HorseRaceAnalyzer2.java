package jp.ac.nct.hr;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import jp.ac.nct.math.MathUtils;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.math3.stat.StatUtils;
/**
 * ranking
 * 
 * @author takahiro
 *
 */
public class HorseRaceAnalyzer2 {


	public static void main(String[] args) throws Exception {
		HorseRaceAnalyzer2 ana = new HorseRaceAnalyzer2();
		List<RecordProperties> recList = ana.retrieveY(args[0]);
		if (recList == null) {
			return;
		}
		List<Double> yList = RaceUtils.toYList(recList);
		List<Double> maxList = RaceUtils.toMaxList(recList);
		Double[] maxArray = (Double[]) maxList.toArray(new Double[0]);
		double[] primitiveMaxArray = ArrayUtils.toPrimitive(maxArray);
		Arrays.sort(primitiveMaxArray);
		ArrayUtils.reverse(primitiveMaxArray);
		
		System.out.println(args[0]);
//		System.out.println(yList);
		Double[] doubleArray = (Double[]) yList.toArray(new Double[0]);
		double[] primitiveDoubleArray = ArrayUtils.toPrimitive(doubleArray);
		Arrays.sort(primitiveDoubleArray);
		ArrayUtils.reverse(primitiveDoubleArray);

		double mean = StatUtils.mean(primitiveDoubleArray);
//		System.out.println("mean:" + mean);
		double stddev = Math.sqrt(StatUtils.populationVariance(primitiveDoubleArray));
		List<Map<String,String>> mapList = new ArrayList();
		for (double token : primitiveDoubleArray) {
			Map<String,String> rec = new HashMap<String,String> ();
			System.out.print(token + ": ");
			int num = RaceUtils.toNum(token,recList);
			rec.put("num",String.valueOf(num));
			double deviation = MathUtils.toDeviation(token, mean, stddev);
			if(deviation <= 30){
				System.err.println ("num : "+num);
			}
			rec.put("deviation",String.valueOf(deviation));
			System.out.print("["+num+"]: ");
			System.out.print(deviation+":"+(deviation>=65?"S" : deviation>=60 ? "A" : deviation>=55 ? "B" : deviation >= 50 ?"C" : "F"));
			String rank = deviation>=65?"S" : deviation>=60 ? "A" : deviation>=55 ? "B" : deviation >= 50 ?"C" : "F";
			rec.put("rank",String.valueOf(rank));
			double max = RaceUtils.toMax(token,recList);
			rec.put("max",String.valueOf(max));
			System.out.print(" <<"+token+">> max: "+max);
			int maxNum = toMaxNum(max,primitiveMaxArray);
			rec.put("maxNum",String.valueOf(maxNum));
			System.out.print(" ["+maxNum+"位]");
			System.out.println(" <<"+RaceUtils.toOdds(num, recList)+">>");
			mapList.add(rec);
		}
		System.err.println (args[0]);
		String outfilename = args[0];
		StringTokenizer st = new StringTokenizer(outfilename,"\\");
		st.nextToken();
		st.nextToken();
		st.nextToken();
		st.nextToken();
		st.nextToken();
		st.nextToken();
		
		String event_num = st.nextToken();
		String day_num = st.nextToken();
		String filename = st.nextToken();
		String race_num = filename.substring(0, filename.indexOf("."));
//		if (true)throw new Exception("stop");
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
				.print(new PrintWriter(new OutputStreamWriter(new FileOutputStream(args[0]+".rank.tsv"), "UTF-8")));
	
		printer.printRecord(new Object[] {
//					event_num,
//					day_num,
//					race_num,
//					rec.get("num"),
				toRTokens(mapList,"S"),
				toRTokens(mapList,"A"),
				toRTokens(mapList,"B"),
				"",
				"",
				toSTokens(mapList,"1"),
				toSTokens(mapList,"2"),
				toSTokens(mapList,"3")
		});
		printer.close();
	}
	
	private static String toRTokens (List<Map<String,String>> src,String r_rank){
		StringBuffer sb = new StringBuffer ();
		for (Map<String,String> rec : src){
			String rank = rec.get("rank");
			if (rank.equals(r_rank)){
				sb.append(rec.get("num"));
				sb.append(",");
			}
		}
		
		return sb.length() == 0 ? "" : sb.toString().substring(0, sb.length()-1);
	}
	private static String toSTokens (List<Map<String,String>> src,String r_maxNum){
		StringBuffer sb = new StringBuffer ();
		for (Map<String,String> rec : src){
			String maxNum = rec.get("maxNum");
			if (maxNum.equals(r_maxNum)){
				sb.append(rec.get("num"));
				sb.append(",");
			}
		}
		
		return sb.length() == 0 ? "" : sb.toString().substring(0, sb.length()-1);
	}
	
	private static int toMaxNum(double max,double [] primitiveMaxArray){
		int i = 0;
		for (double token : primitiveMaxArray){
			++i;
			if (max == token){
				return i;
			}
		}
		return i;
	}
	private List<RecordProperties> retrieveY(String src) throws Exception {
		File csvData = new File(src);
		CSVParser parser = null;
		try {
			parser = CSVParser.parse(csvData, Charset.defaultCharset(), CSVFormat.RFC4180);
			List<RecordProperties> dst = new ArrayList<RecordProperties>();
			for (CSVRecord record : parser) {
				if (record.getRecordNumber() == 1) {
					// CSV Header
					continue;
				}
				//System.err.println("odds :"+record.get(13));
				// System.out.println (record);
				dst.add(RaceUtils.createRecordProperties(Double.valueOf(record.get(1)), Integer.parseInt(record.get(0)),Double.valueOf(record.get(9)),record.get(13)));
			}
			return dst;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (parser != null) {
				parser.close();
			}
		}
		return null;
	}

}
