package com.epam.javalab.controller.upgradeControllers.upgradeButtonControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import com.epam.javalab.controller.Controller;

public class MainWeaponUpgradeController implements ActionListener {

	private JLabel mainWeaponLabel;
	private JLabel statDamage;
	private JLabel gold;
	private String nameOfWeapon;

	public MainWeaponUpgradeController(JLabel arm, JLabel stat, JLabel gold, String name) {
		this.mainWeaponLabel = arm;
		this.statDamage = stat;
		this.gold = gold;
		this.nameOfWeapon = name;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Controller.user.doLvlUpMainWeapon();

		this.mainWeaponLabel.setText(nameOfWeapon + "[" + Controller.user.getLvlOfDroidWeapon() + "] --  +("
				+ Controller.user.getMainWeaponUpDelta() + ") -- " + Controller.user.getGoldOfDroidWeapon() + "g");
		this.statDamage.setText("Damage: " + Controller.user.getDroid().getDamage());
		this.gold.setText("Gold: " + Controller.user.getGold() + "g");
	}
}
