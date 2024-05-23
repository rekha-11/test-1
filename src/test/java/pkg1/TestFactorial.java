package pkg1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestFactorial {
	
	Factorial factorrial;
	
	@Before //this code will run before every test case
	
	public void init() {
		System.out.println("creatin new object for new test case");
		 factorrial=new Factorial();
		
	}
	
	
//public int fact(int num) {
//		
//		if(num<0) {
//			
//			throw new ArithmeticException();
//			
//		}
//		
//		
//	int factorial = 1;	
//
//	for (int i = 2; i <= num; i++) {
//
//		factorial = factorial * i;
//	}
//
//    return factorial;
//	
//}
	
	@Test
	public void testFactWhenNoIsPositive() {
		
		//Factorial factorrial=new Factorial();
		int actual=factorrial.fact(4);
		assertEquals(24,actual);
		
	}
	
	
	@Test
	public void testFactWhenNoIsZero() {
		
		//Factorial factorrial=new Factorial();
		int actual=factorrial.fact(0);
		assertEquals(1,actual);
		
	}
	
	
	@Test
	public void testFactWhenNoIsOne() {
		
		//Factorial factorrial=new Factorial();
		int actual=factorrial.fact(1);
		assertEquals(1,actual);
		
	}
	
	@Test(expected=ArithmeticException.class)
	public void testFactWhenNoIsNegative() {
		
		//Factorial factorrial=new Factorial();
		factorrial.fact(-4);
		
		
	}

}
