package com.epam.javalab.model.droids;

import javax.swing.ImageIcon;

import com.epam.javalab.model.*;
import com.epam.javalab.model.weapons.*;

public class CrazyDroid extends Droid {

	Weapon secondWeapon;

	public CrazyDroid() {
		this.health = 80;
		this.weapon = new Pistol();
	}

	public CrazyDroid(int complexity) {
		this.health = 80;
		this.weapon = new Pistol(complexity);
	}

	public String toString() {
		double health;
		if (this.getHealth() <= 0) {
			health = 0;
		} else {
			health = this.getHealth();
		}
		return "CRAZY. " + "Health: " + health + " Damage: " + this.getDamage();
	}
}
