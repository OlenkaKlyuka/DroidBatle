package com.epam.javalab.model.weapons;

import java.util.*;

import com.epam.javalab.model.Weapon;
import com.epam.javalab.model.features.Gold;

public class LightSword extends Weapon {

	public LightSword() {
		this.upgradeDelta = 8;
		this.upgradeCost = new Gold(125);
		this.damage = 8;
	}
	
	public LightSword(int complexity) {
		this.upgradeDelta = 8;
		this.upgradeCost = new Gold(125);
		this.damage = 8 * this.getNumberOfComplexity(complexity);
	}
        
	@Override
	protected void updateDamageAfterLvlup() {
		this.damage += this.upgradeDelta;
	}
}
