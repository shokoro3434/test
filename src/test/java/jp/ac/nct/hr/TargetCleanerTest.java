package jp.ac.nct.hr;

import junit.framework.TestCase;

public class TargetCleanerTest extends TestCase {
	public void xtestA(){
		try{	
			TargetCleaner.main(new String[]{"../test3/12.csv","./bin/12.csv.in"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testB(){
		try{	
			TargetCleaner.main(new String[]{"../test3/11.csv","./bin/11.csv.in"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testC(){
		try{	
			TargetCleaner.main(new String[]{"../test3/10.csv","./bin/10.csv.in"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testD(){
		try{	
			TargetCleaner.main(new String[]{"../test3/9.csv","./bin/9.csv.in"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testE(){
		try{	
			TargetCleaner.main(new String[]{"../test3/8.csv","./bin/8.csv.in"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testF(){
		try{	
			TargetCleaner.main(new String[]{"../test3/7.csv","./bin/7.csv.in"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testG(){
		try{	
			TargetCleaner.main(new String[]{"../test3/n10.csv","./bin/n10.csv.in"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testH(){
		try{	
			TargetCleaner.main(new String[]{"../test3/n11.csv","./bin/n11.csv.in"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testn12(){
		try{	
			TargetCleaner.main(new String[]{"../test3/n12.csv","./bin/n12.csv.in"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testc11(){
		try{	
			TargetCleaner.main(new String[]{"../test3/c11.csv","./bin/c11.csv.in"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testh11(){
		try{	
			TargetCleaner.main(new String[]{"../test3/h11.csv","./bin/h11.csv.in"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testh12(){
		try{	
			TargetCleaner.main(new String[]{"../test3/h12.csv","./bin/h12.csv.in"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testh10(){
		try{	
			TargetCleaner.main(new String[]{"../test3/h10.csv","./bin/h10.csv.in"});
			TargetCleaner.main(new String[]{"../test3/h11.csv","./bin/h11.csv.in"});
			TargetCleaner.main(new String[]{"../test3/h12.csv","./bin/h12.csv.in"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testc(){
		try{	
			TargetCleaner.main(new String[]{"../test3/c10.csv","./bin/c10.csv.in"});
			TargetCleaner.main(new String[]{"../test3/c11.csv","./bin/c11.csv.in"});
			TargetCleaner.main(new String[]{"../test3/c12.csv","./bin/c12.csv.in"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testnakayama(){
		try{	
			TargetCleaner.main(new String[]{"./n3/12.csv","./n3/12.csv.in","20"});
			TargetCleaner.main(new String[]{"./n3/11.csv","./n3/11.csv.in","20"});
			TargetCleaner.main(new String[]{"./n3/10.csv","./n3/10.csv.in","20"});
			TargetCleaner.main(new String[]{"./n3/7.csv","./n3/7.csv.in","20"});
			TargetCleaner.main(new String[]{"./n3/8.csv","./n3/8.csv.in","20"});
			TargetCleaner.main(new String[]{"./n3/9.csv","./n3/9.csv.in","20"});
//			TargetCleaner.main(new String[]{"../test3/2.csv","./bin/2.csv.in"});
//			TargetCleaner.main(new String[]{"../test3/3.csv","./bin/3.csv.in"});
//			TargetCleaner.main(new String[]{"../test3/4.csv","./bin/4.csv.in"});
//			TargetCleaner.main(new String[]{"../test3/5.csv","./bin/5.csv.in"});
//			TargetCleaner.main(new String[]{"../test3/6.csv","./bin/6.csv.in"});
//			TargetCleaner.main(new String[]{"../test3/7.csv","./bin/7.csv.in"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testhanshin3(){
		try{	
			TargetCleaner.main(new String[]{"./h3/12.csv","./h3/12.csv.in","20"});
			TargetCleaner.main(new String[]{"./h3/11.csv","./h3/11.csv.in","20"});
			TargetCleaner.main(new String[]{"./h3/10.csv","./h3/10.csv.in","20"});
			TargetCleaner.main(new String[]{"./h3/5.csv","./h3/5.csv.in","20"});
			TargetCleaner.main(new String[]{"./h3/6.csv","./h3/6.csv.in","20"});
			TargetCleaner.main(new String[]{"./h3/7.csv","./h3/7.csv.in","20"});
			TargetCleaner.main(new String[]{"./h3/9.csv","./h3/9.csv.in","20"});
//			TargetCleaner.main(new String[]{"../test3/2.csv","./bin/2.csv.in"});
//			TargetCleaner.main(new String[]{"../test3/3.csv","./bin/3.csv.in"});
//			TargetCleaner.main(new String[]{"../test3/4.csv","./bin/4.csv.in"});
//			TargetCleaner.main(new String[]{"../test3/5.csv","./bin/5.csv.in"});
//			TargetCleaner.main(new String[]{"../test3/6.csv","./bin/6.csv.in"});
//			TargetCleaner.main(new String[]{"../test3/7.csv","./bin/7.csv.in"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}

	public void test(){
		try{	
			TargetCleaner.main(new String[]{"../test3/n1/10.csv","./n1/10.csv.in","20"});
			TargetCleaner.main(new String[]{"../test3/n1/11.csv","./n1/11.csv.in","20"});
			TargetCleaner.main(new String[]{"../test3/n1/12.csv","./n1/12.csv.in","20"});
			TargetCleaner.main(new String[]{"../test3/n1/10.csv","./n1/10.csv.in","20"});
			TargetCleaner.main(new String[]{"../test3/n1/11.csv","./n1/11.csv.in","20"});
			TargetCleaner.main(new String[]{"../test3/n1/12.csv","./n1/12.csv.in","20"});
//			TargetCleaner.main(new String[]{"../test3/c5/10.csv","./c5/10.csv.in"});
//			TargetCleaner.main(new String[]{"../test3/c5/11.csv","./c5/11.csv.in"});
//			TargetCleaner.main(new String[]{"../test3/c5/12.csv","./c5/12.csv.in"});
//			TargetCleaner.main(new String[]{"../test3/h1/10.csv","./h1/10.csv.in"});
//			TargetCleaner.main(new String[]{"../test3/h1/11.csv","./h1/11.csv.in"});
//			TargetCleaner.main(new String[]{"../test3/h1/12.csv","./h1/12.csv.in"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	public void testChukyo5(){
		try{	
			TargetCleaner.main(new String[]{"./src/main/resources/2015/c5/10.csv","./src/main/resources/2015/c5/10.csv.in","24"});
			TargetCleaner.main(new String[]{"./src/main/resources/2015/c5/11.csv","./src/main/resources/2015/c5/11.csv.in","24"});
			TargetCleaner.main(new String[]{"./src/main/resources/2015/c5/12.csv","./src/main/resources/2015/c5/12.csv.in","24"});
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}

}
