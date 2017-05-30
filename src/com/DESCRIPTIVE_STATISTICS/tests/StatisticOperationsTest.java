package com.DESCRIPTIVE_STATISTICS.tests;
import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import com.DESCRIPTIVE_STATISTICS.Operations.StatisticOperations;


public class StatisticOperationsTest {
	private static List<Integer> dataSet; 
	private static StatisticOperations statsOperation;
@BeforeClass
public static void intializeData(){
	Integer[] data={1,2,3,4,5,6,7,8,9,9,9,9,12,12,12,12,12,12,96};
	dataSet=Arrays.asList(data);
	statsOperation=new StatisticOperations();
}
	@Test
	public void modeTest(){
		String result=statsOperation.computeMode(dataSet);
		assertEquals("12",result);
	}
	@Test
	public void medianTest(){
		assertEquals(9,(int)statsOperation.computeMedian(dataSet));
	}
	@Test
	public void maxValueTest(){
		assertEquals(96,statsOperation.findMax(dataSet));
	}
	@Test
	public void minValueTest(){
		assertEquals(1,statsOperation.findMin(dataSet));
	}
	@Test
	public void meanTest(){
		assertEquals(String.valueOf(12.631578947368421),String.valueOf(statsOperation.computeMean(dataSet)));
	}
	
	@Test 
	public void standardDeviationTest(){
		assertEquals(String.valueOf(20.516146828821302),String.valueOf(statsOperation.computeStdDeviation(dataSet)));
	}
}
