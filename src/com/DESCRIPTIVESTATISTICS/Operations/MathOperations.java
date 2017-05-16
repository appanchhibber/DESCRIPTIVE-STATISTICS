package com.DESCRIPTIVESTATISTICS.Operations;

import java.util.List;

public class MathOperations {
	
	public static double average(List<Integer> numberList){
		Double sum=0.00d , mean=0.00d;
		for(int a : numberList){
			sum+=a;
		}
		mean = sum/numberList.size();
		return mean;
	} 

}
