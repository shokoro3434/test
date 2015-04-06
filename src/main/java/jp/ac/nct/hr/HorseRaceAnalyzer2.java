package jp.ac.nct.hr;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
		List<Double> yList = ana.retrieveY(args[0]);
		if (yList == null){
			return;
		}
		System.out.println (yList);
		Double[] doubleArray = (Double[]) yList.toArray(new Double[0]);
		double[] primitiveDoubleArray = ArrayUtils.toPrimitive(doubleArray);
		Arrays.sort(primitiveDoubleArray);
		ArrayUtils.reverse(primitiveDoubleArray);
		
		double mean = StatUtils.mean(primitiveDoubleArray);
		System.out.println ("mean:"+mean);
//		double[] target = toAvailablePrimitiveArray(primitiveDoubleArray,availableRaceCount);
		double stddev = Math.sqrt(StatUtils.populationVariance(primitiveDoubleArray));
		System.out.println ("stddev:"+stddev);
		double sum = 0;
		for (double a : primitiveDoubleArray){
			System.out.print (a+": ");
			double deviation = MathUtils.toDeviation(a,mean,stddev);
			System.out.println (deviation);
			sum += deviation;
		}
		//System.err.println(sum/primitiveDoubleArray.length);
	}

	private List<Double> retrieveY(String src) throws Exception {
		File csvData = new File(src);
		CSVParser parser = null;
		try{
			parser = CSVParser.parse(csvData, Charset.defaultCharset(),
					CSVFormat.RFC4180);
			List<Double> dst = new ArrayList<Double>();
			for (CSVRecord record : parser) {
				if (record.getRecordNumber() == 1) {
					// CSV Header
					continue;
				}
				//System.out.println (record);
				dst.add(Double.valueOf(record.get(1)));
			}
			return dst;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			if (parser != null){
				parser.close();
			}
		}
		return null;
	}

}
