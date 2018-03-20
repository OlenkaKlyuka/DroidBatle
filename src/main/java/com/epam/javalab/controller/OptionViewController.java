package com.epam.javalab.controller;

import com.epam.javalab.controller.optionController.*;
import com.epam.javalab.view.gameViews.OptionView;

public class OptionViewController extends Controller{

	public OptionViewController() {
		this.view = new OptionView();
	}
	@Override
	public void handle() {
		OptionView v = (OptionView) this.view;
		v.addControllerToComponent(new ResetUserController(this.view), v.getChangeBgColorButton());
		v.addControllerToComponent(new BackController(this.view), v.getBackButton());
	}

}
