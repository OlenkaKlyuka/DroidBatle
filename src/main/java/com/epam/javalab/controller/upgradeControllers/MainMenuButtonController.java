package com.epam.javalab.controller.upgradeControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.epam.javalab.controller.Controller;
import com.epam.javalab.controller.StartMenuController;
import com.epam.javalab.view.GameView;

public class MainMenuButtonController  implements ActionListener{

	GameView view;

	public MainMenuButtonController(GameView view) {
		this.view = view;
	}

	public void actionPerformed(ActionEvent e) {
		this.view.clearFrame();
		Controller c = new StartMenuController();
		c.updateView();
	}
}
