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
}
