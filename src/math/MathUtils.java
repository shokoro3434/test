package jp.ac.nct.math;

public final class MathUtils {
	private static SingleRegressionAnalysis createSingleRegressionAnalysis(
			final double a, final double b) {
		return new SingleRegressionAnalysis() {

			public double getA() {
				// TODO Auto-generated method stub
				return a;
			}

			public double getB() {
				// TODO Auto-generated method stub
				return b;
			}

			public String getRegressionEquation() {
				// TODO Auto-generated method stub
				return "y="+String.valueOf(getA())+"x+"+String.valueOf(getB());
			}
			
		};
	}

	public static SingleRegressionAnalysis createSingleRegressionAnalysis(
			double[] y, int n) {
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double d = 0.0;
		double aa = 0.0;
		double bb = 0.0;

		for (int i = 0; i < n; i++) {
//			System.err.println(y[i]);
			a += ((i) * y[i]);
			b += (i);
			c += y[i];
			d += ((i) * (i));
		}
		aa = (a - (b * c) / n) / (d - (b * b) / n);
		bb = (c - aa * b) / n;
//		System.err.println("a: " + aa);
//		System.err.println("b: " + bb);
		System.err.println("y=" + aa + "x+" + bb);
		return createSingleRegressionAnalysis(aa, bb);
	}

	public static double computeSingleRegressionAnalysisY(
			SingleRegressionAnalysis sra, double x) {
		return sra.getA() * x + sra.getB();
	}

}
