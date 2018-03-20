package com.epam.javalab.view.gameViews;

import java.awt.*;

import javax.swing.*;

import com.epam.javalab.view.*;

public class StartMenuView extends GameView {
	private JButton singlePlayerButton;
	private JButton optionButton;
	private JButton exitButton;

	public StartMenuView() {
		
		this.setFrame();
		this.panel = new JPanel(new GridBagLayout());
		frame.getContentPane().add(panel, BorderLayout.CENTER);

		Font font = new Font("Arial", Font.PLAIN, 30);

		this.singlePlayerButton = new JButton("Single Player");
		this.singlePlayerButton.setFont(font);

		this.optionButton = new JButton("Options");
		this.optionButton.setFont(font);

		this.exitButton = new JButton("Exit");
		this.exitButton.setFont(font);

		GridBagConstraints constraints = new GridBagConstraints();

		//adding label
		constraints.insets = new Insets(5, 5, 30, 5);
		JLabel label = new JLabel(GameView.frame.getTitle());
		label.setFont(new Font("Arial", Font.PLAIN, 60));
		addComponentToPanel(label, constraints, 0, 0);
		
		// adding singlePlayerButton to panel
		constraints.insets = new Insets(5, 5, 20, 5);
		addComponentToPanel(this.singlePlayerButton, constraints, 0, 1);

		// adding optionButton to panel
		constraints.insets = new Insets(5, 5, 5, 5);
		addComponentToPanel(this.optionButton, constraints, 0, 2);

		// adding exitBuuton to panel
		addComponentToPanel(this.exitButton, constraints, 0, 3);
	}

	public JButton getSinglePlayerButton() {
		return singlePlayerButton;
	}

	public JButton getOptionButton() {
		return optionButton;
	}

	public JButton getExitButton() {
		return exitButton;
	}

	private void addComponentToPanel(Component button, GridBagConstraints c, int x, int y) {

		c.gridx = x;
		c.gridy = y;
		c.fill = GridBagConstraints.HORIZONTAL;
		panel.add(button, c);
	}
}
