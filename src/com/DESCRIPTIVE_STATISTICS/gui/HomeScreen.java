package com.DESCRIPTIVE_STATISTICS.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HomeScreen extends JPanel implements ActionListener {

	public JLabel welcomeMessage, comboLabel;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == go) {
			if (userType.getSelectedItem().toString().equals("User")) {
				Windows window=Windows.getInstance();
				window.setView(new UserMainScreen());
			} else {

			}
		}

	}

	public JComboBox<String> userType;
	public JButton go;

	public HomeScreen() {

		welcomeMessage = new JLabel("Welcome to Descriptive Statistics.");
		welcomeMessage.setSize(600, 30);
		welcomeMessage.setLocation(185, 15);

		comboLabel = new JLabel("Select User type:");
		comboLabel.setSize(100, 30);
		comboLabel.setLocation(85, 80);

		userType = new JComboBox<String>(new String[] { "User", "Machine" });
		userType.setSize(125, 30);
		userType.setLocation(195, 80);

		go = new JButton("Go");
		go.setSize(55, 30);
		go.setLocation(340, 80);
		go.addActionListener(this);

		this.setSize(600, 300);
		this.setLayout(null);
		add(go);
		add(userType);
		add(comboLabel);
		add(welcomeMessage);
	}
}
