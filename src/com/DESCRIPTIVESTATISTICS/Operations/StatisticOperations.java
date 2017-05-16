package com.DESCRIPTIVESTATISTICS.Operations;


import java.util.ArrayList;
import java.util.List;

public class StatisticOperations {

	//protected List numberList = new  ArrayList();
	
	public double findMean(List<Integer> numberList){
		
		double mean;
		mean = MathOperations.average(numberList);
		return mean;
		/*
		Double sum=0.00d , mean=0.00d;
		
		for(int a : numberList){
			sum+=a;
		}
		mean = sum/numberList.size();
		return mean;*/
		/*
		int[] array = new int[];
		List.(int[]) (numberList.toArray(new int[numberList.size()]));
		
		for(int i=0;i<numberArray.size();i++){
		//sum+= numberArray[i];
		  sum = sum ;
		  Double.parseDouble(numberArray.get(i));
		}*/
		
	}
	
	public double findMedian(List<Integer> numberList){
		double median=0.0;
		List<Integer> list = new ArrayList<Integer>();
		
		if(numberList.size()%2==0){
			list.add(numberList.get(numberList.size()/2)-1);
			list.add(numberList.get(numberList.size()/2));
			median = MathOperations.average(list);
		}else
			median =   numberList.get(numberList.get(numberList.size()/2));
		return median;
	}
	
	public double findMode(double [] numberArray){
		
		return 0.0;
	}
	
	public double findStdDev(double [] numberArray){
		
		return 0.0;
	}
	
	
	
}
