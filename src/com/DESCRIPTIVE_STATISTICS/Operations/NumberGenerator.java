package com.DESCRIPTIVE_STATISTICS.Operations;

import java.util.*;

/**
 * http://stackoverflow.com/questions/21009973/java-timer-random-time-each-time-
 * between-2-values reference
 * http://www.kitabxana.net/files/books/file/1354098277.pdf Java Random method
 * 
 * @author hp1
 *
 */
public class NumberGenerator {
	private int minValue;
	private int maxValue;
	private int numberOutput;
	private ArrayList<Integer> dataSet;
	private int dataSetLimit;
	private int seeds;
	private static final int addend = 48271;
	private static final int multiplier = 2147483647;
	private static final int Q = multiplier / addend;// quotient
	private static final int R = multiplier % addend;// remainder

	public void setDataSetLimit(int dataSetLimit) {
		this.dataSetLimit = dataSetLimit;
	}

	public NumberGenerator() {
		minValue = 0;
		maxValue = 100;
		seeds = (int) System.currentTimeMillis() % Integer.MAX_VALUE;
		dataSet = new ArrayList<Integer>();
	}

	public ArrayList<Integer> getDataSet() {
		return dataSet;
	}

	public double random() {
		return (double) randomInt() / multiplier;
	}

	public int randomInt() {
		int tmpState = addend * (seeds % Q) - R * (seeds / Q);

		if (tmpState >= 0) {
			seeds = tmpState;
		} else {
			seeds = tmpState + multiplier;
		}
		return seeds;
	}

	public void getRandomNumber() {
		if (dataSet.size() != dataSetLimit) {
			numberOutput = minValue + (int) (random() * maxValue);
			dataSet.add(numberOutput);
		} else {
			return;
		}
	}

}
