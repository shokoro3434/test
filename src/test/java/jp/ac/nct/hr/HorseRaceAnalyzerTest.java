package jp.ac.nct.hr;

import junit.framework.TestCase;

public class HorseRaceAnalyzerTest extends TestCase {
	public void testc () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./c10.csv.in","./c10.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./c11.csv.in","./c11.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./c12.csv.in","./c12.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testn () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./n10.csv.in","./n10.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./n11.csv.in","./n11.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./n12.csv.in","./n12.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testh () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./h10.csv.in","./h10.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./h11.csv.in","./h11.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./h12.csv.in","./h12.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testnakayama5 () throws Exception{
		try{
//			HorseRaceAnalyzer.main(new String[]{"./1.csv.in","./1.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./2.csv.in","./2.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./3.csv.in","./3.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./4.csv.in","./4.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./5.csv.in","./5.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./6.csv.in","./6.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./7.csv.in","./7.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./8.csv.in","./8.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./9.csv.in","./9.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./10.csv.in","./10.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./11.csv.in","./11.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./10.csv.in","./10.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}

	public void test () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./n1/10.csv.in","./n1/10.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./n1/11.csv.in","./n1/11.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./n1/12.csv.in","./n1/12.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./c5/10.csv.in","./c5/10.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./c5/11.csv.in","./c5/11.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./c5/12.csv.in","./c5/12.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./h1/10.csv.in","./h1/10.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./h1/11.csv.in","./h1/11.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./h1/12.csv.in","./h1/12.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testnakayama3 () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./n3/7.csv.in","./n3/7.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./n3/8.csv.in","./n3/8.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./n3/9.csv.in","./n3/9.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./n3/10.csv.in","./n3/10.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./n3/11.csv.in","./n3/11.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./n3/12.csv.in","./n3/12.csv.out","-1"});
			//HorseRaceAnalyzer.main(new String[]{"./n3/11.csv.in","./n3/11.csv.out","-1"});
			//HorseRaceAnalyzer.main(new String[]{"./n3/12.csv.in","./n3/12.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./c5/10.csv.in","./c5/10.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./c5/11.csv.in","./c5/11.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./c5/12.csv.in","./c5/12.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./h1/10.csv.in","./h1/10.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./h1/11.csv.in","./h1/11.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./h1/12.csv.in","./h1/12.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testhanshin3 () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./h3/5.csv.in","./h3/5.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./h3/6.csv.in","./h3/6.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./h3/7.csv.in","./h3/7.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./h3/9.csv.in","./h3/9.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./h3/10.csv.in","./h3/10.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./h3/11.csv.in","./h3/11.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./h3/12.csv.in","./h3/12.csv.out","-1"});
			//HorseRaceAnalyzer.main(new String[]{"./n3/11.csv.in","./n3/11.csv.out","-1"});
			//HorseRaceAnalyzer.main(new String[]{"./n3/12.csv.in","./n3/12.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./c5/10.csv.in","./c5/10.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./c5/11.csv.in","./c5/11.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./c5/12.csv.in","./c5/12.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./h1/10.csv.in","./h1/10.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./h1/11.csv.in","./h1/11.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./h1/12.csv.in","./h1/12.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testchukyo5 () throws Exception{
		try{
//			HorseRaceAnalyzer.main(new String[]{"./h3/5.csv.in","./h3/5.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./h3/6.csv.in","./h3/6.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./h3/7.csv.in","./h3/7.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./h3/9.csv.in","./h3/9.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./h3/10.csv.in","./h3/10.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./h3/11.csv.in","./h3/11.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./h3/12.csv.in","./h3/12.csv.out","-1"});
			//HorseRaceAnalyzer.main(new String[]{"./n3/11.csv.in","./n3/11.csv.out","-1"});
			//HorseRaceAnalyzer.main(new String[]{"./n3/12.csv.in","./n3/12.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/c5/10.csv.in","./src/main/resources/2015/c5/10.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/c5/11.csv.in","./src/main/resources/2015/c5/11.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/c5/12.csv.in","./src/main/resources/2015/c5/12.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./h1/10.csv.in","./h1/10.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./h1/11.csv.in","./h1/11.csv.out","-1"});
//			HorseRaceAnalyzer.main(new String[]{"./h1/12.csv.in","./h1/12.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testN1 () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/n1/10.csv.in","./src/main/resources/2015/n1/10.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/n1/11.csv.in","./src/main/resources/2015/n1/11.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/n1/12.csv.in","./src/main/resources/2015/n1/12.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testH1 () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/h1/10.csv.in","./src/main/resources/2015/h1/10.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/h1/11.csv.in","./src/main/resources/2015/h1/11.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/h1/12.csv.in","./src/main/resources/2015/h1/12.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testN3_5 () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/n/3/5/6.csv.in","./src/main/resources/2015/n/3/5/6.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/n/3/5/7.csv.in","./src/main/resources/2015/n/3/5/7.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/n/3/5/8.csv.in","./src/main/resources/2015/n/3/5/8.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/n/3/5/9.csv.in","./src/main/resources/2015/n/3/5/9.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/n/3/5/10.csv.in","./src/main/resources/2015/n/3/5/10.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/n/3/5/11.csv.in","./src/main/resources/2015/n/3/5/11.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/n/3/5/12.csv.in","./src/main/resources/2015/n/3/5/12.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testN3_6 () throws Exception{
		try{
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/n/3/6/10.csv.in","./src/main/resources/2015/n/3/6/10.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/n/3/6/11.csv.in","./src/main/resources/2015/n/3/6/11.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/n/3/6/12.csv.in","./src/main/resources/2015/n/3/6/12.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testH3_5(){
		try{	
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/h/2/5/5.csv.in","./src/main/resources/2015/h/2/5/5.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/h/2/5/6.csv.in","./src/main/resources/2015/h/2/5/6.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/h/2/5/7.csv.in","./src/main/resources/2015/h/2/5/7.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/h/2/5/8.csv.in","./src/main/resources/2015/h/2/5/8.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/h/2/5/9.csv.in","./src/main/resources/2015/h/2/5/9.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/h/2/5/10.csv.in","./src/main/resources/2015/h/2/5/10.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/h/2/5/11.csv.in","./src/main/resources/2015/h/2/5/11.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/h/2/5/12.csv.in","./src/main/resources/2015/h/2/5/12.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testH3_6(){
		try{	
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/h/2/6/7.csv.in","./src/main/resources/2015/h/2/6/7.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/h/2/6/8.csv.in","./src/main/resources/2015/h/2/6/8.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/h/2/6/9.csv.in","./src/main/resources/2015/h/2/6/9.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/h/2/6/10.csv.in","./src/main/resources/2015/h/2/6/10.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/h/2/6/11.csv.in","./src/main/resources/2015/h/2/6/11.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/h/2/6/12.csv.in","./src/main/resources/2015/h/2/6/12.csv.out","-1"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testF1(){
		try{	
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/f/1/1/6.csv.in","./src/main/resources/2015/f/1/1/6.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/f/1/1/10.csv.in","./src/main/resources/2015/f/1/1/10.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/f/1/1/11.csv.in","./src/main/resources/2015/f/1/1/11.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/f/1/1/12.csv.in","./src/main/resources/2015/f/1/1/12.csv.out","-1"});

			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/f/1/2/8.csv.in","./src/main/resources/2015/f/1/2/8.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/f/1/2/9.csv.in","./src/main/resources/2015/f/1/2/9.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/f/1/2/10.csv.in","./src/main/resources/2015/f/1/2/10.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/f/1/2/11.csv.in","./src/main/resources/2015/f/1/2/11.csv.out","-1"});
			HorseRaceAnalyzer.main(new String[]{"./src/main/resources/2015/f/1/2/12.csv.in","./src/main/resources/2015/f/1/2/12.csv.out","-1"});

		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}

}
