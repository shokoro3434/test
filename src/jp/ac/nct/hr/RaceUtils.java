package jp.ac.nct.hr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jp.ac.nct.math.MathUtils;
import jp.ac.nct.math.SingleRegressionAnalysis;

import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.math3.stat.StatUtils;

/**
 * 
 *
 */
public final class RaceUtils {
	
	private static double[] toAvailablePrimitiveArray (double [] src,int available){
		List<Double> doubleList = new ArrayList<Double>();
		int startIndex = available == -1 ? 0 : src.length - available < 0 ? 0 : src.length - available;
		for (int i = startIndex ; i < src.length ; i ++){
			doubleList.add(new Double(src[i]));
		}
		Double[] doubleArray = (Double[]) doubleList.toArray(new Double[0]);
		return ArrayUtils.toPrimitive(doubleArray);
	}
	private static boolean isInvalidToken (String token){
		final String [] ILLEGAL_STRING_ARRAY = new String[]{"着","中止","除外","取消"};
		if (StringUtils.contains(token,ILLEGAL_STRING_ARRAY)){
			return true;
		}
		if (Integer.valueOf(token) <= 30){
			return true;
		}
		return false;
	}
	private static double toMean(CSVRecord record){
		List<Double> raceList = new ArrayList<Double>();
		final int RACE_INDEX = 1;
		for (int i = RACE_INDEX; i < record.size() ; i++) {
			if (record.get(i).isEmpty()){
				continue;
			}
			if (isInvalidToken(record.get(i))){
				continue;
			}
			raceList.add(new Double(record.get(i)));
		}
		if (raceList.isEmpty()){
			return 0;
		}
		Double[] doubleArray = (Double[]) raceList.toArray(new Double[0]);
		double[] primitiveDoubleArray = ArrayUtils.toPrimitive(doubleArray);
		return StatUtils.mean(primitiveDoubleArray);
	}
	
	public static HorseProperties createHorseProperties(CSVRecord record,int availableRaceCount) {
		List<Double> ret = new ArrayList<Double>();
		final int NUM_INDEX = 0;
		String numberAsString = record.get(NUM_INDEX);
		final int RACE_INDEX = 1;
		for (int i = RACE_INDEX; i < record.size() ; i++) {
			if (record.get(i).isEmpty()){
				continue;
			}
			if (isInvalidToken(record.get(i))){
				ret.add(new Double(toMean(record)));
			}
			else{
				ret.add(new Double(record.get(i)));
			}
		}
		System.err.println(ret);
		double lastY = ret.size() != 0 ? ret.get(0) : 0;
		double last2Y = 1 < ret.size() ? ret.get(1) : 0;
		double last3Y = 2 < ret.size() ? ret.get(2) : 0;
		Collections.reverse(ret);
		Double[] doubleArray = (Double[]) ret.toArray(new Double[0]);
		double[] primitiveDoubleArray = ArrayUtils.toPrimitive(doubleArray);
		double[] target = toAvailablePrimitiveArray(primitiveDoubleArray,availableRaceCount);

		System.err.println("variance:"
				+ StatUtils.variance(target));
		System.err.println("sigma:"
				+ Math.sqrt(StatUtils.variance(target)));
		SingleRegressionAnalysis sra = MathUtils
				.createSingleRegressionAnalysis(target,
						target.length);
		return createHorseProperties(
				MathUtils.computeSingleRegressionAnalysisY(sra,
						target.length), sra.getRegressionEquation(),lastY,last2Y,last3Y,target,
						numberAsString);
	}

	private static HorseProperties createHorseProperties(final double y,final String regressionEquation,final double lastY,final double last2y,final double last3y,
			final double[] timeIndexArray, final String numberAsString) {
		return new HorseProperties() {

			public double getLast2y() {
				// TODO Auto-generated method stub
				return last2y;
			}

			public double getLast3y() {
				// TODO Auto-generated method stub
				return last3y;
			}

			public double getLastY() {
				return lastY;
			}

			public double getY() {
				return y;
			}

			public double[] getTimeIndexArray() {
				return timeIndexArray;
			}

			public String getNumberAsString() {
				return numberAsString;
			}

			public int getAvailableRaceCount() {
				return timeIndexArray.length;
			}

			public String getRegressionEquation() {
				// TODO Auto-generated method stub
				return regressionEquation;
			}
			
		};
	}
}
