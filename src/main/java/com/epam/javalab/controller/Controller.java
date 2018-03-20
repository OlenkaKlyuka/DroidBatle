package com.epam.javalab.controller;

import com.epam.javalab.model.User;
import com.epam.javalab.view.GameView;

public abstract class Controller {

	protected GameView view;
	public static User user;

	public void updateView() {
		this.view.draw();
		this.handle();
	}
	public abstract void handle();
}
