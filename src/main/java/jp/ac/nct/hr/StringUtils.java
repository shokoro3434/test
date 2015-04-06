package jp.ac.nct.hr;

public final class StringUtils {
	public static boolean contains (String src,String [] illegalArray){
		for (String illegal : illegalArray){
			if (src.indexOf(illegal) != -1){
				return true;
			}
		}
		return false;
	}
	public static String toAvailableFormat (double src){
		if (Double.valueOf(src).isNaN()){
			return String.valueOf(0);
		}
		return String.format("%.2f",src);
	}
}
