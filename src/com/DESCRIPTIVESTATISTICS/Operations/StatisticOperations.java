package com.DESCRIPTIVESTATISTICS.Operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StatisticOperations {

	// protected List numberList = new ArrayList();
	private double mean;

	public double computeMean(List<Integer> numberList) {
		mean = MathOperations.average(numberList);
		return mean;
	}

	public double computeMedian(List<Integer> numberList) {
		double median = 0.0;
		Collections.sort(numberList);

		int middle = numberList.size() / 2;
		if (numberList.size() % 2 == 0) {
			median = (numberList.get(middle - 1) + numberList.get(middle)) / 2;
		} else {
			median = numberList.get(middle);
		}
		return median;
	}

	public double computeMode(double[] numberArray) {

		return 0.0;
	}

	public double computeVariance(List<Integer> numberList) {
		double sum = 0;
		double variance = 0.0;
		for (int a : numberList) {
			sum += (a - mean) * (a - mean);
		}
		variance = sum / (numberList.size() - 1);
		System.out.println("Variance = " + variance);
		return variance;
	}
}
