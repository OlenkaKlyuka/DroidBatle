package com.epam.javalab.DroidBattle;

import com.epam.javalab.controller.Controller;
import com.epam.javalab.controller.StartMenuController;

public class App {
	public static void main(String[] args) {
		try {
			Controller c = new StartMenuController();
			c.updateView();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
