package com.epam.javalab.controller;

import com.epam.javalab.controller.startMenuControllers.*;
import com.epam.javalab.view.gameViews.StartMenuView;

public class StartMenuController extends Controller{

	public StartMenuController() {
		this.view = new StartMenuView();
	}

	public void handle() {
		StartMenuView v = (StartMenuView) this.view;
		v.addControllerToComponent(new SinglePlayerController(this.view), v.getSinglePlayerButton());
		v.addControllerToComponent(new ExitController(this.view), v.getExitButton());
	}
}
