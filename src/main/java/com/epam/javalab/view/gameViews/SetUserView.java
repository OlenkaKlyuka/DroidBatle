package com.epam.javalab.view.gameViews;

import java.awt.*;

import javax.swing.*;

import com.epam.javalab.model.weapons.Blaster;
import com.epam.javalab.view.GameView;

public class SetUserView extends GameView {

	private JButton backButton;
	private JButton startButton;
	private JButton saveName;

	private String[] strOfKindsOfWeapon = { "Blaster", "Light Sword", "Pistols" };
	private JComboBox<?> kindOfWeapon;

	private JLabel weaponStats;

	private JTextField nameOfUser;

	private GridBagConstraints constraints;

	public SetUserView() {
		
		this.panel = new JPanel(new GridBagLayout());
		frame.getContentPane().add(panel, BorderLayout.CENTER);

		Font font = new Font("Arial", Font.PLAIN, 30);

		this.backButton = new JButton("Back");
		this.backButton.setFont(font);

		this.startButton = new JButton("Start");
		this.startButton.setFont(font);

		this.saveName = new JButton("Save name");
		this.saveName.setFont(new Font("Arial", Font.PLAIN, 20));

		this.nameOfUser = new JTextField("User name");

		this.kindOfWeapon = new JComboBox<Object>(this.strOfKindsOfWeapon);
		this.kindOfWeapon.setSelectedItem(0);

		this.weaponStats = new JLabel("Weapon Damage: " + new Blaster().getDamage());
		this.weaponStats.setFont(font);

		constraints = new GridBagConstraints();

		// adding main label
		constraints.insets = new Insets(5, 5, 30, 5);
		JLabel label = new JLabel(GameView.frame.getTitle());
		label.setFont(new Font("Arial", Font.PLAIN, 60));
		addComponentToPanel(label, 0, 0);

		// adding text field to panel
		constraints.insets = new Insets(5, 5, 3, 5);
		addComponentToPanel(nameOfUser, 0, 1);

		// adding button to save name
		addComponentToPanel(saveName, 0, 2);

		// adding Label for Defense
		constraints.insets = new Insets(20, 5, 5, 5);
		JLabel comboBoxLabel = new JLabel("Defense");
		comboBoxLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		addComponentToPanel(comboBoxLabel, 0, 3);


		// adding Label for Weapon
		comboBoxLabel = new JLabel("Weapon");
		comboBoxLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		addComponentToPanel(comboBoxLabel, 0, 5);

		// adding combo box (Weapon) to panel
		addComponentToPanel(this.kindOfWeapon, 0, 6);


		// adding label for weapon stats
		addComponentToPanel(this.weaponStats, 0, 8);

		// adding Start button to panel
		constraints.insets = new Insets(120, 5, 5, 5);
		addComponentToPanel(this.startButton, 0, 9);

		// adding Back button to panel
		constraints.insets = new Insets(10, 5, 5, 5);
		addComponentToPanel(this.backButton, 0, 10);

	}

	public JComboBox<?> getKindOfWeapon() {
		return kindOfWeapon;
	}

	public JButton getBackButton() {
		return this.backButton;
	}

	public JButton getStartButton() {
		return this.startButton;
	}

	public JTextField getNameOfUser() {
		return this.nameOfUser;
	}

	public JButton getSaveName() {
		return this.saveName;
	}
        
	public JLabel getWeaponStats() {
		return this.weaponStats;
	}

	public void addComponentToPanel(Component button, int x, int y) {

		constraints.gridx = x;
		constraints.gridy = y;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		panel.add(button, constraints);
	}
}
