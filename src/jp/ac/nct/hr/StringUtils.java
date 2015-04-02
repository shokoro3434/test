package jp.ac.nct.hr;

public class StringUtils {
	public static boolean contains (String src,String [] illegalArray){
		for (String illegal : illegalArray){
			if (src.indexOf(illegal) != -1){
				return true;
			}
		}
		return false;
	}
}
