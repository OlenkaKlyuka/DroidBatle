package com.epam.javalab.model.droids;

import javax.swing.ImageIcon;

import com.epam.javalab.model.*;
import com.epam.javalab.model.weapons.*;

public class ShieldDroid extends Droid {

	public ShieldDroid() {
		this.health = 100;
		this.weapon = new LightSword();
	}
	
	public ShieldDroid(int complexity) {
		this.health = 100;
		this.weapon = new LightSword(complexity);
	}

	public String toString() {
		double health;
		if (this.getHealth() <= 0) {
			health = 0;
		} else {
			health = this.getHealth();
		}
		return "SHIELD. " + "Health: " + health + " Damage: " + this.getDamage();
	}
}
