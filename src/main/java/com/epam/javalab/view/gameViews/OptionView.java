package com.epam.javalab.view.gameViews;

import java.awt.*;

import javax.swing.*;

import com.epam.javalab.view.GameView;

public class OptionView extends GameView{
	
	private JButton changeBgColorButton;
	private JButton backButton;

	public OptionView() {
		
		this.panel = new JPanel(new GridBagLayout());
		frame.getContentPane().add(panel, BorderLayout.CENTER);

		Font font = new Font("Arial", Font.PLAIN, 30);

		this.backButton = new JButton("Back");
		this.backButton.setFont(font);

		GridBagConstraints constraints = new GridBagConstraints();

		//adding label
		constraints.insets = new Insets(5, 5, 30, 5);
		JLabel label = new JLabel("OPTIONS");
		label.setFont(new Font("Arial", Font.PLAIN, 60));
		addComponentToPanel(label, constraints, 0, 0);
		
		// adding singlePlayerButton to panel
		constraints.insets = new Insets(5, 5, 20, 5);
		addComponentToPanel(this.changeBgColorButton, constraints, 0, 1);

		// adding optionButton to panel
		addComponentToPanel(this.backButton, constraints, 0, 2);

	}

	public JButton getChangeBgColorButton() {
		return changeBgColorButton;
	}

	public JButton getBackButton() {
		return backButton;
	}

	private void addComponentToPanel(Component button, GridBagConstraints c, int x, int y) {

		c.gridx = x;
		c.gridy = y;
		c.fill = GridBagConstraints.HORIZONTAL;
		panel.add(button, c);
	}
}
