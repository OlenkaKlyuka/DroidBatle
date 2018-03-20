package com.epam.javalab.controller;

import com.epam.javalab.controller.upgradeControllers.*;
import com.epam.javalab.controller.upgradeControllers.upgradeButtonControllers.*;
import com.epam.javalab.view.gameViews.UpgradeView;

public class UpgradeViewController extends Controller {
	
	public UpgradeViewController() {
		this.view = new UpgradeView();
	}

	@Override
	public void handle() {
		UpgradeView v = (UpgradeView) this.view;
		v.addControllerToComponent(new MainMenuButtonController(this.view), v.getMainMenuButton());
		v.addControllerToComponent(new BattleButtonController(this.view), v.getStartGameButton());
                v.addControllerToComponent(new MainWeaponUpgradeController(v.getMainWeapon(), v.getDamageStat(),
				v.getGoldStat(), v.getNameOfWeapon()), v.getLvlUpMainWeapon());
		
	}

}
