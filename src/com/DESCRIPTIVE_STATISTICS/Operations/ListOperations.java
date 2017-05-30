package com.DESCRIPTIVE_STATISTICS.Operations;

import java.util.List;

public class ListOperations {

	public static void doSort(List<Integer> dataSet) {
		int min;
	    for (int i = 0; i < dataSet.size(); ++i) {
	        //find minimum in the rest of array
	        min = i;
	        for (int j = i + 1; j < dataSet.size(); ++j) {
	            if (dataSet.get(j) < dataSet.get(min)) {
	                min = j;
	            }
	        }
	        //do swap
	        swap(dataSet, i, min);
	    }
	}

	public static void swap(List<Integer> dataSet, int i, int j) {
		int tmp = dataSet.get(i);
		dataSet.set(i, dataSet.get(j));
		dataSet.set(j, tmp);
	}

}
