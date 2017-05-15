package com.DESCRIPTIVESTATISTICS.Operations;
import java.util.*;
/**
 * http://stackoverflow.com/questions/21009973/java-timer-random-time-each-time-between-2-values reference
 * @author hp1
 *
 */
public class NumberGenerator extends TimerTask {
	private int minValue;
	private int maxValue;
	private int numberOutput;
	private Random random;
	private ArrayList<Integer> dataSet;
	public NumberGenerator() {
		minValue = 0;
		maxValue = 100;
		random = new Random();
		dataSet=new ArrayList<Integer>();
	}
	
	public ArrayList<Integer> getDataSet(){
		return dataSet;
	}

	@Override
	public void run() {
		numberOutput = (minValue + random.nextInt(maxValue - minValue + 1));
		dataSet.add(numberOutput);
	}

}
