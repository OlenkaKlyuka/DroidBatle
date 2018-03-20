package com.epam.javalab.view;

import java.awt.event.ActionListener;

import javax.swing.*;

public abstract class GameView {
	public static JFrame frame = new JFrame("Droid Battle v1.0");
	protected JPanel panel;

	public void setFrame() {
		GameView.frame.setSize(1000, 700);
		GameView.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GameView.frame.setResizable(false);
	}

	public void draw() {
		GameView.frame.setVisible(true);
	}

	public void clearFrame() {
		GameView.frame.getContentPane().removeAll();
		GameView.frame.revalidate();
		GameView.frame.repaint();
	}

	public void addControllerToComponent(ActionListener controller, JButton button) {
		button.addActionListener(controller);
	}
	public void addControllerToComboBox(ActionListener controller, JComboBox<?> button) {
		button.addActionListener(controller);
	}
	
	public JPanel getPanel() {
		return this.panel;
	}
}
