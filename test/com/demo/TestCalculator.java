package com.demo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculator {

	@Test
	public void tesAdd()
	{
		BasicCalculator cal=new BasicCalculator();
		int result=cal.add(1,2,3,4,5);
		Assertions.assertEquals(15,result);
	}
}
