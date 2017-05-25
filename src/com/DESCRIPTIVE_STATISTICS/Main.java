package com.DESCRIPTIVE_STATISTICS;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Timer;

import com.DESCRIPTIVESTATISTICS.Operations.StatisticOperations;
import com.DESCRIPTIVESTATISTICS.Operations.MathOperations;
import com.DESCRIPTIVESTATISTICS.Operations.NumberGenerator;

public class Main {
	/**
	 * http://www.journaldev.com/1050/java-timer-timertask-example reference
	 * 
	 * @param args
	 * @param InputMismatchException
	 * 
	 */
	public static void main(String[] args) {
		Main obj = new Main();
		obj.init();
	}

	public void init() {
		try {

			System.out.println("Enter the size of the List:");
			Scanner scan = new Scanner(System.in);
			int size = scan.nextInt();
			NumberGenerator numberGenerator = new NumberGenerator();
			numberGenerator.setDataSetLimit(size);
			while(numberGenerator.getDataSet().size()!=size){
				numberGenerator.getRandomNumber();
			}
			for (int a : numberGenerator.getDataSet()) {
				System.out.println("ArrayList Member:" + a);
			}
			System.out.println("Size of input list = " + numberGenerator.getDataSet().size());
			StatisticOperations desc = new StatisticOperations();
			System.out.println("Mean = " + desc.computeMean(numberGenerator.getDataSet()));
			System.out.println("Median = " + desc.computeMedian(numberGenerator.getDataSet()));
			System.out.println("Standard Deviation = "
					+ MathOperations.squareRoot(desc.computeVariance(numberGenerator.getDataSet())));

		} catch (InputMismatchException e) {
			System.out.println("Please Enter numerical values only");
			init();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
