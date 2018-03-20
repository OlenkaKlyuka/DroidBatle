package com.epam.javalab.view.gameViews;

import java.awt.*;

import javax.swing.*;

import com.epam.javalab.controller.Controller;
import com.epam.javalab.model.Weapon;
import com.epam.javalab.model.weapons.*;
import com.epam.javalab.view.GameView;

public class UpgradeView extends GameView {

	private JLabel mainWeapon;
	private JLabel damageStat;
	private JLabel defenseStat;
	private JLabel healthStat;
	private JLabel nameStat;
	private JLabel goldStat;

	private JButton lvlUpMainWeapon;
	private JButton lvlUpSecondWeapon;

	private JButton startGameButton; // TODO: add next controller
	private JButton mainMenuButton; // done controller

	private GridBagConstraints constraints;
	
	private String weapon;

	public UpgradeView() {

		Font upgradeFont = new Font("Arial", Font.PLAIN, 20);
		Font statFont = new Font("Arial", Font.PLAIN, 30);

		this.constraints = new GridBagConstraints();

		this.panel = new JPanel(new GridBagLayout());
		frame.getContentPane().add(panel, BorderLayout.CENTER);

		// initialise weapon labes
		weapon = this.determineWeapon(Controller.user.getDroidWeapon());
		this.mainWeapon = this.determineMainWeapon(weapon);
		this.mainWeapon.setFont(upgradeFont);

		// initialise stats
		this.damageStat = new JLabel("Damage: " + Controller.user.getDroid().getDamage());
		this.healthStat = new JLabel("Health: " + Controller.user.getDroidHealth());
		this.nameStat = new JLabel("Name: " + Controller.user.getName());
		this.goldStat = new JLabel("Gold: " + Controller.user.getGold() + "g");

		this.damageStat.setFont(statFont);
		this.healthStat.setFont(statFont);
		this.nameStat.setFont(statFont);
		this.goldStat.setFont(statFont);

		// initialise movement buttons
		this.startGameButton = new JButton("Start Game");
		this.mainMenuButton = new JButton("Main Menu");

		this.startGameButton.setFont(statFont);
		this.mainMenuButton.setFont(statFont);
		// end of initialisation
		//
		//
		constraints.insets = new Insets(5, 5, 50, 5);
		JLabel label = new JLabel("Upgrade Time");
		label.setFont(new Font("Arial", Font.PLAIN, 45));
		addComponentToPanel(label, 1, 0);

		// add labels stats to panel
		constraints.insets = new Insets(5, 200, 5, 5);
		addComponentToPanel(this.nameStat, 2, 1);
		addComponentToPanel(this.healthStat, 2, 2);
		addComponentToPanel(this.defenseStat, 2, 3);
		addComponentToPanel(this.damageStat, 2, 4);
		constraints.insets = new Insets(50, 200, 5, 5);
		addComponentToPanel(this.goldStat, 2, 5);

		// add start and main menu buttons
		constraints.insets = new Insets(50, 200, 5, 5);
		addComponentToPanel(this.startGameButton, 2, 7);
		constraints.insets = new Insets(10, 200, 5, 5);
		addComponentToPanel(this.mainMenuButton, 2, 8);

	}

	public JLabel getGoldStat() {
		return goldStat;
	}

	private void addComponentToPanel(Component button, int x, int y) {

		constraints.gridx = x;
		constraints.gridy = y;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		panel.add(button, constraints);
	}

	private JLabel determineMainWeapon(String weapon) {
		return new JLabel(weapon + "[" + Controller.user.getLvlOfDroidWeapon() + "] --  +("
				+ Controller.user.getMainWeaponUpDelta() + ") -- " + Controller.user.getGoldOfDroidWeapon() + "g");
	}

	private String determineWeapon(Weapon weapon) {
		if (weapon instanceof Blaster) {
			return "Blaster";
		} else if (weapon instanceof LightSword) {
			return "Light Sword";
		} else {
			return "Pistol";
		}
	}

	public JLabel getMainWeapon() {
		return mainWeapon;
	}

	public JLabel getDamageStat() {
		return damageStat;
	}

	public JLabel getDefenseStat() {
		return defenseStat;
	}
        
	public JButton getLvlUpMainWeapon() {
		return lvlUpMainWeapon;
	}

	public JButton getLvlUpSecondWeapon() {
		return lvlUpSecondWeapon;
	}

	public JButton getStartGameButton() {
		return startGameButton;
	}

	public JButton getMainMenuButton() {
		return mainMenuButton;
	}
	public String getNameOfWeapon() {
		return this.weapon;
	}
}
