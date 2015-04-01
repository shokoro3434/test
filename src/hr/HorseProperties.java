package jp.ac.nct.hr;

public interface HorseProperties {
	public abstract String getNumberAsString();
	public abstract double [] getTimeIndexArray();
	public abstract double getY();
	public abstract double getLastY();
	public abstract double getLast2y();
	public abstract double getLast3y();
	public abstract int getAvailableRaceCount();
	public abstract String getRegressionEquation ();
}
