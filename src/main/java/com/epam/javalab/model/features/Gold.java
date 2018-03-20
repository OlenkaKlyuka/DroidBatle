package com.epam.javalab.model.features;

public class Gold {

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int gold;
	
	public Gold(int gold) {
		this.gold = gold;
	}

	public Gold add(Gold second) {
		this.gold += second.getGold();
		return this;
	}

	public Gold remove(Gold second) {
		this.gold -= second.getGold();
		return this;
	}

	public int getGold() {
		return gold;
	}
	
	public String toString() { 
		return Integer.toString(gold);
	}
}
