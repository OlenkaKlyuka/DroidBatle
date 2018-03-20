package com.epam.javalab.model.weapons;

import java.util.ArrayList;

import com.epam.javalab.model.Weapon;
import com.epam.javalab.model.features.Gold;

public class Blaster extends Weapon {

	public Blaster() {
		this.upgradeDelta = 3;
		this.upgradeCost = new Gold(100);
		this.damage = 5 + random.nextInt(25);
	}
	
	public Blaster(int complexity) {
		this.upgradeDelta = 3;
		this.upgradeCost = new Gold(100);
		this.damage = (5 + random.nextInt(25) * this.getNumberOfComplexity(complexity));
	}

	@Override
	public String toString() {
		String toReturn = "Blaster[" + this.level + "]" + " with ";
		toReturn = toReturn + " Damage: " + this.damage;
		return toReturn;
	}

	@Override
	protected void updateDamageAfterLvlup() {
		this.damage += this.upgradeDelta;
	}
}
