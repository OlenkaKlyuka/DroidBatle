package com.epam.javalab.model.weapons;

import java.util.ArrayList;

import com.epam.javalab.model.Weapon;
import com.epam.javalab.model.features.*;

public class Pistol extends Weapon {

	public Pistol() {
		this.upgradeDelta = 4;
		this.upgradeCost = new Gold(110);
		this.damage = 3 + random.nextInt(9);
	}
	
	public Pistol(int complexity) {
		this.upgradeDelta = 4;
		this.upgradeCost = new Gold(110);
		this.damage = (3 + random.nextInt(9)) * this.getNumberOfComplexity(complexity);
	}

	@Override
	protected void updateDamageAfterLvlup() {
		this.damage += this.upgradeDelta;

	}
}
