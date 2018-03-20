package com.epam.javalab.controller.upgradeControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.epam.javalab.controller.*;
import com.epam.javalab.view.GameView;

public class BattleButtonController implements ActionListener{

	GameView view;

	public BattleButtonController(GameView view) {
		this.view = view;
	}

	public void actionPerformed(ActionEvent e) {
		this.view.clearFrame();
	}
}
