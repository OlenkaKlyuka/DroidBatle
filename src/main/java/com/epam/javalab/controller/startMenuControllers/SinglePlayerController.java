package com.epam.javalab.controller.startMenuControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.epam.javalab.controller.*;
import com.epam.javalab.model.User;
import com.epam.javalab.view.GameView;

public class SinglePlayerController implements ActionListener {

	GameView view;

	public SinglePlayerController(GameView view) {
		this.view = view;
	}

	public void actionPerformed(ActionEvent e) {
		this.view.clearFrame();
		Controller c;
		if (!User.isSeted) {
			c = new SetUserController();
		} else {
			c = new UpgradeViewController();
		}
		c.updateView();
	}

}
