package jp.ac.nct.hr;

import org.apache.commons.math3.stat.correlation.SpearmansCorrelation;

import junit.framework.TestCase;

public class HorseRaceAnalyzer2Test extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testA() {
		try {
			HorseRaceAnalyzer2.main(new String[] { "./c5/12.csv.out" });
			HorseRaceAnalyzer2.main(new String[] { "./h3/10.csv.out" });
			HorseRaceAnalyzer2.main(new String[] { "./h3/11.csv.out" });
			HorseRaceAnalyzer2.main(new String[] { "./h3/12.csv.out" });
			HorseRaceAnalyzer2.main(new String[] { "./n3/10.csv.out" });
			HorseRaceAnalyzer2.main(new String[] { "./n3/11.csv.out" });
			HorseRaceAnalyzer2.main(new String[] { "./n3/12.csv.out" });
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void testB() {
		double[] data1 = { 20, 17, 30, 42.3, 17, 50 };
		double[] data2 = { 15, 32, 18, 9.3, 7, 5 };

		SpearmansCorrelation cor = new SpearmansCorrelation();
		System.out.println(cor.correlation(data1, data2));
	}

	public void testC5() {
		try {
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/c5/10.csv.out" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/c5/11.csv.out" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/c5/12.csv.out" });
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
