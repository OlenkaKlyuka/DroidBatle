package com.epam.javalab.controller.setUserControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.epam.javalab.controller.Controller;
import com.epam.javalab.controller.UpgradeViewController;
import com.epam.javalab.model.User;
import com.epam.javalab.view.GameView;

public class StartGameController implements ActionListener{

	GameView view;

	public StartGameController(GameView view) {
		this.view = view;
	}

	public void actionPerformed(ActionEvent e) {
		this.view.clearFrame();
		User.isSeted = true;
		Controller c = new UpgradeViewController();
		c.updateView();
	}

}
