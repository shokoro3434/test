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

	private interface RecordProperties {
		public abstract Double getY();

		public abstract int getNum();
	}

	@SuppressWarnings("unused")
	private RecordProperties createRecordProperties(final Double y, final int num) {
		return new RecordProperties() {

			@Override
			public Double getY() {
				// TODO Auto-generated method stub
				return y;
			}

			@Override
			public int getNum() {
				// TODO Auto-generated method stub
				return num;
			}

		};
	}
	private static List<Double> toDoubleList(List<RecordProperties> recList){
		List<Double> dst = new ArrayList<Double> ();
		for (RecordProperties rec : recList){
			dst.add(rec.getY());
		}
		return dst;
	}
	private static int toNum (Double token,List<RecordProperties> recList){
		for (RecordProperties rec : recList){
			if (token.compareTo(rec.getY()) == 0){
				return rec.getNum();
			}
		}
		return 0;
	}
	public static void main(String[] args) throws Exception {
		HorseRaceAnalyzer2 ana = new HorseRaceAnalyzer2();
		List<RecordProperties> recList = ana.retrieveY(args[0]);
		if (recList == null) {
			return;
		}
		List<Double> yList = toDoubleList(recList);
		
		System.out.println(args[0]);
		System.out.println(yList);
		Double[] doubleArray = (Double[]) yList.toArray(new Double[0]);
		double[] primitiveDoubleArray = ArrayUtils.toPrimitive(doubleArray);
		Arrays.sort(primitiveDoubleArray);
		ArrayUtils.reverse(primitiveDoubleArray);

		double mean = StatUtils.mean(primitiveDoubleArray);
		System.out.println("mean:" + mean);
		double stddev = Math.sqrt(StatUtils.populationVariance(primitiveDoubleArray));
		for (double token : primitiveDoubleArray) {
			System.out.print(token + ": ");
			double deviation = MathUtils.toDeviation(token, mean, stddev);
			System.out.print("["+toNum(token,recList)+"]: ");
			System.out.println(deviation);
		}
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
				// System.out.println (record);
				dst.add(createRecordProperties(Double.valueOf(record.get(1)), Integer.parseInt(record.get(0))));
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
