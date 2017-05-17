package com.DESCRIPTIVESTATISTICS.Operations;

import java.util.List;

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
}
