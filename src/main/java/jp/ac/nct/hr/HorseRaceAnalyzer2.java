package jp.ac.nct.hr;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jp.ac.nct.math.MathUtils;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.math3.stat.StatUtils;

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
		for (double token : primitiveDoubleArray) {
			System.out.print(token + ": ");
			double deviation = MathUtils.toDeviation(token, mean, stddev);
			int num = RaceUtils.toNum(token,recList);
			System.out.print("["+num+"]: ");
			System.out.print(deviation+":"+(deviation>=65?"S" : deviation>=60 ? "A" : deviation>=55 ? "B" : deviation >= 50 ?"C" : "F"));
			double max = RaceUtils.toMax(token,recList);
			System.out.print(" <<"+token+">> max: "+max);
			int maxNum = toMaxNum(max,primitiveMaxArray);
			System.out.print(" ["+maxNum+"位]");
			System.out.println(" <<"+RaceUtils.toOdds(num, recList)+">>");
		}
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
