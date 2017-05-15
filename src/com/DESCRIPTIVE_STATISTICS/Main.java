package com.DESCRIPTIVE_STATISTICS;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Timer;

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
			Scanner sc = new Scanner(System.in);
			int count = sc.nextInt();
			NumberGenerator numberGenerator = new NumberGenerator();
			Timer timer = new Timer(true);

			numberGenerator.dataSetlimt = count;
			timer.schedule(numberGenerator, 0, 10);
			System.out.println("TimerTask started");
			try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			timer.cancel();
			System.out.println("TimerTask cancelled");
			for (int a : numberGenerator.getDataSet()) {
				System.out.println("ArrayList Member:" + a);
			}

		} catch (InputMismatchException e) {
			System.out.println("Please Enter Integer value only");
			init();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
