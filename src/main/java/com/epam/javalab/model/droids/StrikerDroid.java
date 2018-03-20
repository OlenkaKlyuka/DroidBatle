package com.epam.javalab.model.droids;

import com.epam.javalab.model.*;
import com.epam.javalab.model.weapons.*;

public class StrikerDroid extends Droid {
	
	public StrikerDroid() {
		this.health = 60;
		this.weapon = new Blaster();
	}
	
	public StrikerDroid(int complexity) {
		this.health = 60;
		this.weapon = new Blaster(complexity);
	}

	public String toString() {
		double health;
		if (this.getHealth() <= 0) {
			health = 0;
		} else {
			health = this.getHealth();
		}
		return "STRIKER. " + "Health: " + health + " Damage: " + this.getDamage();
	}
}
