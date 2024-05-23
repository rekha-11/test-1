package pkg1;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestAdd {
	
	/*
	 * int add(int num1,int num2){
	 * 
	 * return num1+num2;
	 * 
	 * }
	 */
	Add obj=null;
	
	@Before
	public void init() {
		System.out.println("going to start a new test case");
		 obj=new Add();
		
	}
	
	
	@Test
	
	public void testAddWhenBothNosPositive(){
		
		//Add obj=new Add();
		int result=obj.add(5, 5);
		assertEquals(10,result);
		
	}
	
@Test
	
	public void testAddWhenBothNosNegative(){
		
		//Add obj=new Add();
		int result=obj.add(-5, -9);
		assertEquals(-14,result);
		
	}

@Test

public void testAddWhenNo1IsNegativeAndNo2IsPositive(){
	
	//Add obj=new Add();
	int result=obj.add(-5, 9);
	assertEquals(4,result);
	
}

	
@After
public void afterTestCases() {
	System.out.println(" test case ends");
	 
	
}

	

}
