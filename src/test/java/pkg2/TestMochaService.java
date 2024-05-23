package pkg2;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import pkg2.MathUtil;
import pkg2.MochaService;

//Hey I am using Mockito JUNIT Runner
@RunWith(MockitoJUnitRunner.class)

public class TestMochaService {
	
	//it will create mock object of MathUtil
		@Mock
		private MathUtil mathUtil;
		
		@InjectMocks // this annotation creates real object of MochaService and inject 	// mock mathUtil inside it//MochaService mochaService=new MochaService();;
		private MochaService mochaService;
		
		@Before
		public void anything(){
			
			System.out.println("test case starts");
			//Every time  -> before every test cases
			//it will create new instance of MochaService
			 MockitoAnnotations.openMocks(this);
			//MockitoAnnotations.initMocks(this);
		}
	
		@Test
		public void testComputeWhenNumTen() {
			Mockito.when(mathUtil.findRandNum()).thenReturn(30);
			
			int result=mochaService.compute(10);
			assertEquals(139, result);
			
			
			verify(mathUtil, times(1)).findRandNum();			
			verifyNoMoreInteractions(mathUtil);
		}
		
		@Test
		public void testComputeWhenNumTwenty() {
			Mockito.when(mathUtil.findRandNum()).thenReturn(10);
			
			int result=mochaService.compute(20);
			assertEquals(419, result);
			
			
			verify(mathUtil, times(1)).findRandNum();			
			verifyNoMoreInteractions(mathUtil);
		}
		
		@Test(expected=RuntimeException.class)
		public void testComputeWhenNumIsNegative() {
			
			
			mochaService.compute(-4);
			
			
		}

		
		

}
