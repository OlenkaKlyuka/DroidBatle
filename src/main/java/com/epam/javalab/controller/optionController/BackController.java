package com.epam.javalab.controller.optionController;

import java.awt.event.*;

import com.epam.javalab.controller.Controller;
import com.epam.javalab.controller.*;
import com.epam.javalab.view.GameView;

public class BackController implements ActionListener{

	GameView view;

	public BackController(GameView view) {
		this.view = view;
	}

	public void actionPerformed(ActionEvent e) {
		this.view.clearFrame();
		Controller c = new StartMenuController();
		c.updateView();
	}

}
