package com.epam.javalab.controller.setUserControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;

import com.epam.javalab.controller.Controller;
import com.epam.javalab.model.Weapon;
import com.epam.javalab.model.weapons.*;
import com.epam.javalab.view.GameView;

public class KindOfWeaponBoxController implements ActionListener {

	private JLabel weaponStats;

	public KindOfWeaponBoxController(JLabel label) {
		this.weaponStats = label;
	}

	public void actionPerformed(ActionEvent e) {

		JComboBox<?> cb = (JComboBox<?>) e.getSource();
		String msg = (String) cb.getSelectedItem();
		if (msg == "Blaster")
                {
			Blaster blaster = new Blaster();
			Controller.user.setWeaponToDroid(blaster);
                }
                else if( msg == "Light Sword")
                {
			LightSword lightSword = new LightSword();
			Controller.user.setWeaponToDroid(lightSword);
                }
                else if ( msg == "Pistols")
                {
			Pistol pistol = new Pistol();
			Controller.user.setWeaponToDroid(pistol);
		}
		GameView.frame.repaint();
	}
}
