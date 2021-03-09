package com.demo;

public class BasicCalculator {

		static public int add(int...nums)
		{
			int sum=0;
			for(int num:nums)
			{
				sum=sum+num;
			}
			
			
			return sum;
		}
}
