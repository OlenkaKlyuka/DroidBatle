package com.epam.javalab.controller;

import com.epam.javalab.controller.setUserControllers.*;
import com.epam.javalab.model.User;
import com.epam.javalab.view.gameViews.*;

public class SetUserController extends Controller {
	
	public SetUserController() {
		this.view = new SetUserView();
		Controller.user = new User();
		Controller.user.resetUser();
	}

	@Override
	public void handle() {
		SetUserView v = (SetUserView) this.view;
		v.addControllerToComponent(new StartGameController(this.view), v.getStartButton());
		v.addControllerToComponent(new BackController(this.view), v.getBackButton());
                v.addControllerToComboBox(new KindOfWeaponBoxController(v.getWeaponStats()), v.getKindOfWeapon());
		v.addControllerToComponent(new SaveNameButtonController(v.getNameOfUser()), v.getSaveName());
	}
}
