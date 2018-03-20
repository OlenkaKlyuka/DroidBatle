package com.epam.javalab.model.droids;

import com.epam.javalab.model.*;

public class UserDroid extends Droid {

        public UserDroid() {}

	public void setWeapon(Weapon weap) {
		this.weapon = weap;
	}
        
	public void setHealth(double health) {
		this.health = health;
	}
        
	public void refreshHealth() {
		this.health = 100;
	}
}
