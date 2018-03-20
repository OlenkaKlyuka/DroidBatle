package com.epam.javalab.model;

import javax.swing.ImageIcon;

public abstract class Droid {

	protected double health;
	protected Weapon weapon;
	protected ImageIcon img;

	public double getDamage() {
		return this.weapon.getDamage();
	}

	public Weapon getWeapon() {
		return this.weapon;
        }

	public double getHealth() {
		return this.health;
	}

	public void addShopToWeapon() {

	}

	public void addSightToWeapon() {

	}

	public void addBattaryToWeapon() {

	}

	public String toString() {
		return "Heath: " + this.health + "  Armor: "+ "  Weapon: " + this.weapon.toString();
	}
}
