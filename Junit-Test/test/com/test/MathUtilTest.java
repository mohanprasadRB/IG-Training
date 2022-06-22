package com.test;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class MathUtilTest {

 
	@Test
	void addTest()
	{
		MathUtil mathUtil = new MathUtil(); 
		assertEquals(10, mathUtil.add(5, 5));
	}
	
	@Test
	void testDivide()
	{
		MathUtil mathUtil = new MathUtil(); 
		assertThrows(ArithmeticException.class,()-> mathUtil.div(1, 0),"Devide by zero");		
	}
	 
	
	@Test
	void circleArea()
	{
		MathUtil mathUtil = new MathUtil(); 
		assertEquals(314.1592653589793, mathUtil.circleArea(10));
		
		  
	}
}
