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
	public void testN1() {
		try {
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/n1/10.csv.out" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/n1/11.csv.out" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/n1/12.csv.out" });
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void testH1() {
		try {
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/h1/10.csv.out" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/h1/11.csv.out" });
			HorseRaceAnalyzer2.main(new String[] { "./src/main/resources/2015/h1/12.csv.out" });
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void testN3_5 () throws Exception{
		try{
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/n/3/5/6.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/n/3/5/7.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/n/3/5/8.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/n/3/5/9.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/n/3/5/10.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/n/3/5/11.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/n/3/5/12.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testN3_6 () throws Exception{
		try{
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/n/3/6/10.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/n/3/6/11.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/n/3/6/12.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testH2_5 () throws Exception{
		try{
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/h/2/5/5.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/h/2/5/6.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/h/2/5/7.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/h/2/5/8.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/h/2/5/9.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/h/2/5/10.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/h/2/5/11.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/h/2/5/12.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testH2_6 () throws Exception{
		try{
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/h/2/6/7.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/h/2/6/8.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/h/2/6/9.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/h/2/6/10.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/h/2/6/11.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/h/2/6/12.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testF1 () throws Exception{
		try{
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/f/1/1/6.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/f/1/1/10.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/f/1/1/11.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/f/1/1/12.csv.out","-1"});

			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/f/1/2/8.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/f/1/2/9.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/f/1/2/10.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/f/1/2/11.csv.out","-1"});
			HorseRaceAnalyzer2.main(new String[]{"./src/main/resources/2015/f/1/2/12.csv.out","-1"});

		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}


}
