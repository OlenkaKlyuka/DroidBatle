package com.epam.javalab.controller.optionController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.epam.javalab.controller.Controller;
import com.epam.javalab.model.User;
import com.epam.javalab.view.GameView;

public class ResetUserController implements ActionListener {

	GameView view;

	public ResetUserController(GameView view) {
		this.view = view;
	}

	// TODO implement method below
	public void actionPerformed(ActionEvent e) {
		
		
		Controller.user = new User();
		Controller.user.resetUser();
	}
}
