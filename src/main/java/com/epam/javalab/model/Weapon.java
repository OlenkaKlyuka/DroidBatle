package com.epam.javalab.model;

import java.util.List;
import java.util.Random;

import com.epam.javalab.controller.Controller;
import com.epam.javalab.model.features.Gold;

public abstract class Weapon {

	protected double damage;
	protected int level = 1;
	protected Gold upgradeCost;
	protected double upgradeDelta;
	protected Random random = new Random();

	public double getDamage() {
		return this.damage;
	}

	public double getUpgradeDelta() {
		return this.upgradeDelta;
	}

	public int getLevel() {
		return level;
	}

	public int getUpgradeCost() {
		return upgradeCost.getGold();
	}

	// lvlup weapon
	public void doLvlUp() {
		if (hasGold()) {
			this.level++;
			updateDamageAfterLvlup();
			Controller.user.removeGold(this.upgradeCost);
		}
	}

	protected double getNumberOfComplexity(int complexity) {
		double toReturn = 1.0;
		int num = complexity;
		while(num > 1) {
			num -= 1;
			toReturn += 0.05;
		}
		return toReturn;
	}
	
	private boolean hasGold() {
		if (this.upgradeCost.getGold() <= Controller.user.getGold()) {
			return true;
		} else {
			return false;
		}
	}

	// after lvlup damage should be updated
	protected abstract void updateDamageAfterLvlup();

	public String toString() {
		return Double.toString(this.damage);
	}
}
