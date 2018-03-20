package com.epam.javalab.controller.setUserControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import com.epam.javalab.controller.Controller;

public class SaveNameButtonController implements ActionListener {

	private JTextField text;

	public SaveNameButtonController(JTextField text) {
		this.text = text;
	}

	public void actionPerformed(ActionEvent e) {
		Controller.user.setName(text.getText());
		text.setText("");
	}
}
