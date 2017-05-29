package com.DESCRIPTIVE_STATISTICS.gui;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import jdk.internal.org.objectweb.asm.tree.IntInsnNode;

public class Windows extends JFrame {
	public Container container;
	private static Windows windows;
	public void init(){
		container = getContentPane();
		setTitle("Descriptive-Statistics");
		setPreferredSize(new Dimension(600, 300));
		setMaximumSize(new Dimension(600, 300));
		setMinimumSize(new Dimension(600, 300));
		setResizable(false);
		setSize(600, 300);
		setLocationRelativeTo(null); // center window on the screen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private  Windows() {
	}
	public static Windows getInstance(){
		if(windows==null){
			windows=new Windows();
		}
		return windows;
	}
	public void setView(JPanel view )
	{
		container.removeAll();
		container.add(view);
		view.setVisible(true); 
		setVisible(true);
		this.pack();
	}

	

}
