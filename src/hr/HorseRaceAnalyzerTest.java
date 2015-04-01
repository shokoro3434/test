package jp.ac.nct.hr;

import junit.framework.TestCase;

public class HorseRaceAnalyzerTest extends TestCase {
	public void xtestA () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./bin/12.csv.in","./bin/12.csv.out","5"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void test11 () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./bin/11.csv.in","./bin/11.csv.out","5"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void test10 () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./bin/10.csv.in","./bin/10.csv.out","5"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void test9 () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./bin/9.csv.in","./bin/9.csv.out","5"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void test8 () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./bin/8.csv.in","./bin/8.csv.out","5"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void test7 () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./bin/7.csv.in","./bin/7.csv.out","3"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testn10 () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./bin/n10.csv.in","./bin/n10.csv.out","3"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testn11 () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./bin/n11.csv.in","./bin/n11.csv.out","3"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testn12 () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./bin/n12.csv.in","./bin/n12.csv.out","3"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testc11 () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./bin/c11.csv.in","./bin/c11.csv.out","3"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testh11 () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./bin/h11.csv.in","./bin/h11.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testh12 () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./bin/h12.csv.in","./bin/h12.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testh10 () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./bin/h10.csv.in","./bin/h10.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testc12 () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./bin/c12.csv.in","./bin/c12.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testn10x () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./bin/n10.csv.in","./bin/n10.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testn11x () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./bin/n11.csv.in","./bin/n11.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testn12x () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./bin/n12.csv.in","./bin/n12.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
}
