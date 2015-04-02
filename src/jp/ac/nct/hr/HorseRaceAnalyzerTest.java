package jp.ac.nct.hr;

import junit.framework.TestCase;

public class HorseRaceAnalyzerTest extends TestCase {
	public void testc () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./bin/c10.csv.in","./bin/c10.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./bin/c11.csv.in","./bin/c11.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./bin/c12.csv.in","./bin/c12.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testn () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./bin/n10.csv.in","./bin/n10.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./bin/n11.csv.in","./bin/n11.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./bin/n12.csv.in","./bin/n12.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testh () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./bin/h10.csv.in","./bin/h10.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./bin/h11.csv.in","./bin/h11.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./bin/h12.csv.in","./bin/h12.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testnakayama5 () throws Exception{
		try{
//			HorseRaceAnalyzer.main(new String[]{"./bin/1.csv.in","./bin/1.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./bin/2.csv.in","./bin/2.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./bin/3.csv.in","./bin/3.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./bin/4.csv.in","./bin/4.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./bin/5.csv.in","./bin/5.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./bin/6.csv.in","./bin/6.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./bin/7.csv.in","./bin/7.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./bin/8.csv.in","./bin/8.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./bin/9.csv.in","./bin/9.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./bin/10.csv.in","./bin/10.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./bin/11.csv.in","./bin/11.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./bin/10.csv.in","./bin/10.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}


}
