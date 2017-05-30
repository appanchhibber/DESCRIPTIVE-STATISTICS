package com.DESCRIPTIVE_STATISTICS.tests;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import com.DESCRIPTIVE_STATISTICS.Operations.MathOperations;

public class MathOperationsTest {

	private static List<Integer> dataSet;

	@BeforeClass
	public static void setData() {
		Integer[] data = { 1, 2, 3, 3, 3, 7, 5, 8, 8, 8, 9, 6, 8, 5, 6, 4, 4, 7, 5, 5, 5, 5 };
		dataSet = Arrays.asList(data);
	}

	@Test
	public void averageTest() {
		assertEquals("5.318181818181818", String.valueOf(MathOperations.average(dataSet)));
	}

	@Test
	public void frequencyTest() {
		assertEquals("5", MathOperations.findFrequency(dataSet));
	}

	@Test
	public void squareRootTest() {
		assertEquals("2.0", String.valueOf(MathOperations.squareRoot(4.0)));
	}

}
