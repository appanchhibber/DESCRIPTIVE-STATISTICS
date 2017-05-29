package com.DESCRIPTIVE_STATISTICS;

import com.DESCRIPTIVE_STATISTICS.gui.HomeScreen;
import com.DESCRIPTIVE_STATISTICS.gui.Windows;

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
		Windows windows = Windows.getInstance();
		windows.init();
		windows.setView(new HomeScreen());
	}
}
