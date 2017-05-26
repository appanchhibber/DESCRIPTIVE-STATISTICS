package com.DESCRIPTIVE_STATISTICS.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserMainScreen extends JPanel implements ActionListener {
	public JLabel info;
	public JTextField dataSize;
	public JButton createList, back;

	public UserMainScreen() {

		info = new JLabel("Enter the size of the sample");
		info.setSize(600, 30);
		info.setLocation(225, 15);
		dataSize = new JTextField();
		dataSize.setSize(150, 30);
		dataSize.setLocation(235, 65);
		createList = new JButton("Generate Data");
		createList.setSize(120, 20);
		createList.setLocation(185, 105);
		createList.addActionListener(this);
		back = new JButton("Back");
		back.setSize(120, 20);
		back.setLocation(315, 105);
		back.addActionListener(this);

		add(info);
		add(dataSize);
		add(createList);
		add(back);
		this.setSize(600, 200);
		this.setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==back){
			Windows window=Windows.getInstance();
			window.setView(new HomeScreen());
		}
		else if(e.getSource()==createList){
			Windows window=Windows.getInstance();
			window.setView(new HomeScreen());
		}

	}
}
