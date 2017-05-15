package com.DESCRIPTIVESTATISTICS.Operations;


import java.util.ArrayList;
import java.util.List;

public class DescriptiveStatistics {

	protected List numberList = new ArrayList();
	
	public double findMean(double [] numberArray){
		
		double sum=0,mean=0;
		for(int i=0;i<numberArray.length;i++){
		sum+= numberArray[i];
		}
		mean = sum/numberArray.length;
		return mean;
	}
	
	public double findMedian(double [] numberArray){
		double median=0.0;
		if(numberArray.length%2==0){
			median = (numberArray[(numberArray.length/2)-1]+(numberArray[numberArray.length/2]))/2;
		}else
			median =   numberArray[(numberArray.length/2)];
		return median;
	}
	
	public double findMode(double [] numberArray){
		
		return 0.0;
	}
	
	public double findStdDev(double [] numberArray){
		
		return 0.0;
	}
	
	
	
}
