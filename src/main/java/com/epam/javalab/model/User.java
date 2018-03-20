package com.epam.javalab.model;

import com.epam.javalab.controller.Controller;
import com.epam.javalab.model.droids.UserDroid;
import com.epam.javalab.model.features.Gold;
import com.epam.javalab.model.weapons.Blaster;

public class User {

	private String name;
	private UserDroid droid;
	private Gold gold;
	public static boolean isSeted = false;

	public User() {
		this.gold = new Gold(0);
		this.droid = new UserDroid();
	}

	public User(UserDroid droid) {
		this.gold = new Gold(0);
		this.droid = droid;
	}


	// lvl of droid weapon
	public int getLvlOfDroidWeapon() {
		return this.droid.getWeapon().getLevel();
	}

	// gold of droid weapon to upgrade
	public int getGoldOfDroidWeapon() {
		return this.droid.getWeapon().getUpgradeCost();
	}

	

	// do lvlup of weapon
	public void doLvlUpMainWeapon() {
		this.droid.getWeapon().doLvlUp();
	}

	// gold functions
	public void removeGold(Gold gold) {
		Controller.user.setGold(new Gold(Controller.user.getGold() - gold.getGold()));
	}

	public double getMainWeaponUpDelta() {
		return this.droid.getWeapon().getUpgradeDelta();
	}

	//
	public Weapon getDroidWeapon() {
		return this.droid.getWeapon();
	}

	public void setWeaponToDroid(Weapon weapon) {
		this.droid.setWeapon(weapon);
	}

	public void setHealthToDroid(double health) {
		this.droid.setHealth(health);
	}

	public String getName() {
		return name;
	}

	public UserDroid getDroid() {
		return droid;
	}

	public void setGold(Gold gold) {
		this.gold = gold;
	}

	public int getGold() {
		return gold.getGold();
	}

	public void addGold(Gold gold) {
		this.gold.add(gold);
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDroidHealth() {
		return droid.getHealth();
	}

	public void resetUser() {
		User.isSeted = false;

		
		// default settings
		Controller.user.setHealthToDroid(100);
		Controller.user.setWeaponToDroid(new Blaster());
		Controller.user.setName("Default");
	}
}
