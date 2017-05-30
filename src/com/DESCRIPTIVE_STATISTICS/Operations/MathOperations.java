package com.DESCRIPTIVE_STATISTICS.Operations;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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

	public static String findFrequency(
			List<Integer> numberList) {

		ListOperations.doSort(numberList);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> modesMap = new HashMap<Integer, Integer>();
		int maxCount = 1;
		StringBuilder mode=new StringBuilder();
		for (int i = 0; i < numberList.size(); i++) {
			int currentValue = numberList.get(i);
			if (map.containsKey(currentValue)) {
				int occurences = (Integer) map.get(currentValue);
				occurences++;
				map.put(currentValue, occurences);

				if (occurences >= maxCount) {
					maxCount = occurences;
				}
			} else {
				map.put(numberList.get(i), 1);
			}
		}

		for (Map.Entry<Integer, Integer> xyz : map.entrySet()) {
			if (xyz.getValue() == maxCount) {
				modesMap.put(xyz.getKey(), xyz.getValue());
				mode.append(xyz.getKey()+",");
			}
		}
		System.out.println("new has map:" + modesMap.keySet() + ",value"
				+ modesMap.values());
		return mode.toString().substring(0,mode.length()-1);
		// modesMap;
	}
}
