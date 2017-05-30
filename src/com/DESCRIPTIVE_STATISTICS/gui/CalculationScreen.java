package com.DESCRIPTIVE_STATISTICS.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import com.DESCRIPTIVE_STATISTICS.Operations.MathOperations;
import com.DESCRIPTIVE_STATISTICS.Operations.NumberGenerator;
import com.DESCRIPTIVE_STATISTICS.Operations.StatisticOperations;

public class CalculationScreen extends JPanel implements ActionListener {
	public JPanel listArea, resultArea;
	public JLabel lblMax, lblMin, lblMedian, lblMode, lblMean, lblDeviation;
	public JTextField max, min, median, mode, mean, stdDeviation;
	public JList sampleData;
	public JButton calculate, back;
	private NumberGenerator numGen;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == back) {
			Windows window = Windows.getInstance();
			window.setView(new HomeScreen());
		} else if (e.getSource() == calculate) {
			StatisticOperations desc = new StatisticOperations();
			max.setText(String.valueOf(desc.findMax(numGen.getDataSet())));
			min.setText(String.valueOf(desc.findMin(numGen.getDataSet())));
			mean.setText(String.valueOf(desc.computeMean(numGen.getDataSet())));
			median.setText(String.valueOf(desc.computeMedian(numGen
					.getDataSet())));
			mode.setText(String.valueOf(desc.computeMode(numGen.getDataSet())));
			stdDeviation.setText(String.valueOf(desc.computeStdDeviation(numGen
					.getDataSet())));
		}
	}

	public CalculationScreen(NumberGenerator numberGenerator) {
		this.numGen = numberGenerator;
		listArea = new JPanel();
		sampleData = new JList(numGen.getDataSet().toArray());
		JScrollPane scrollPane1 = new JScrollPane(sampleData);
		scrollPane1.setBounds(0, 0, 200, 290);
		listArea.add(scrollPane1);

		listArea.setSize(200, 300);
		listArea.setLocation(0, 0);
		listArea.setLayout(null);
		listArea.setVisible(true);
		this.add(listArea);

		resultArea = new JPanel();
		lblMax = new JLabel("Maximum(M):");
		lblMax.setSize(120, 30);
		lblMax.setLocation(100, 5);
		max = new JTextField();
		max.setSize(120, 30);
		max.setLocation(245, 5);
		max.setEditable(false);
		resultArea.add(lblMax);
		resultArea.add(max);

		lblMin = new JLabel("Minimum(m):");
		lblMin.setSize(120, 30);
		lblMin.setLocation(100, 45);
		min = new JTextField();
		min.setSize(120, 30);
		min.setLocation(245, 45);
		min.setEditable(false);
		resultArea.add(lblMin);
		resultArea.add(min);

		lblMode = new JLabel("Mode(o):");
		lblMode.setSize(120, 30);
		lblMode.setLocation(100, 85);
		mode = new JTextField();
		mode.setSize(120, 30);
		mode.setLocation(245, 85);
		mode.setEditable(false);
		resultArea.add(lblMode);
		resultArea.add(mode);

		lblMedian = new JLabel("Median(d):");
		lblMedian.setSize(120, 30);
		lblMedian.setLocation(100, 125);
		median = new JTextField();
		median.setSize(120, 30);
		median.setLocation(245, 125);
		median.setEditable(false);
		resultArea.add(lblMedian);
		resultArea.add(median);

		lblMean = new JLabel("Arithmetic Mean(μ):");
		lblMean.setSize(120, 30);
		lblMean.setLocation(100, 165);
		mean = new JTextField();
		mean.setSize(120, 30);
		mean.setLocation(245, 165);
		mean.setEditable(false);
		resultArea.add(lblMean);
		resultArea.add(mean);

		lblDeviation = new JLabel("Standard Deviation(σ):");
		lblDeviation.setSize(140, 30);
		lblDeviation.setLocation(100, 205);
		stdDeviation = new JTextField();
		stdDeviation.setSize(120, 30);
		stdDeviation.setLocation(245, 205);
		stdDeviation.setEditable(false);
		resultArea.add(lblDeviation);
		resultArea.add(stdDeviation);

		calculate = new JButton("Calculate");
		calculate.setSize(100, 20);
		calculate.setLocation(100, 245);
		calculate.addActionListener(this);
		resultArea.add(calculate);

		back = new JButton("Back");
		back.setSize(100, 20);
		back.setLocation(245, 245);
		back.addActionListener(this);
		resultArea.add(back);

		resultArea.setSize(400, 300);
		resultArea.setLocation(200, 0);
		resultArea.setVisible(true);
		resultArea.setLayout(null);
		this.add(resultArea);

		this.setSize(600, 300);
		this.setLayout(null);
	}
}
