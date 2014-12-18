package Hyene;

import Framework.Controller.Action;
import Framework.Model.Model;

public class ActionPay extends Action{

	@Override
	public boolean isLegal(Model model) {
		return false;
	}

	@Override
	public void doAction(Model model) {
		if(model instanceof HyeneModel){
			HyeneModel hmod = (HyeneModel) model;
			HyenePlayer p = (HyenePlayer) hmod.m_current_player;
		}
	}

	@Override
	public void undoAction(Model model) {
		// TODO Auto-generated method stub
		
	}

}
