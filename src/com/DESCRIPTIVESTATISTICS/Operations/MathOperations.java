package com.DESCRIPTIVESTATISTICS.Operations;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;

public class MathOperations {

	public static double average(List<Integer> numberList) {
		Double sum = 0.00d, mean = 0.00d;
		for (int a : numberList) {
			sum += a;
		}
		mean = sum / numberList.size();
		return mean;
	}

	public static double squareRoot(double number) {
		double first = 0;
		double x;
		double last = 0.0;
		x = number;
		for (; number != 0;) {
			first = (x + number / x) / 2.0;
			x = first;
			if (last == first)
				break;
			last = first;
		}
		return first;
	}
	
	public static int findFrequency(List<Integer> numberList) {

		ListOperations.doSort(numberList);
		HashMap map = new HashMap();
		//Set modesSet = new HashSet();
		//HashMap modesMap = new HashMap();
		int mode = 0;
		int maxCount=1;
		
		for(int i=0;i<numberList.size();i++){
			int currentValue=numberList.get(i);
			if(map.containsKey(currentValue)){
				int occurences = (Integer) map.get(currentValue); 
				occurences++;
				map.put(currentValue, occurences);
				
				if(occurences>=maxCount){
					//modesMap.put(currentValue,occurences);
					mode = currentValue;
					maxCount=occurences;
				}
			}
			else{
				map.put(numberList.get(i), 1);
			}
		}
		//int max = (int)Collections.max(modesMap.values());
		return mode;
				//modesMap;
		}
}
