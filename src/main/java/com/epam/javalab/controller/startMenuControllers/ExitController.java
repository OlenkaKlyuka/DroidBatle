package com.epam.javalab.controller.startMenuControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.epam.javalab.view.GameView;

public class ExitController implements ActionListener {

	GameView view;

	public ExitController(GameView view) {
		this.view = view;
	}

	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
