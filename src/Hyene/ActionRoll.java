package Hyene;

import Framework.Controller.Action;
import Framework.Model.Model;

public class ActionRoll extends Action{

	@Override
	public boolean isLegal(Model model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void doAction(Model model) {
		if(model instanceof HyeneModel){
			HyeneModel hmod = (HyeneModel) model;
			TokenStick[] sticks = new TokenStick[4];
			for(int i=0;i<4;i++){
				sticks[i].roll();
			}
			hmod.setSticks(sticks);
		}
	}

	@Override
	public void undoAction(Model model) {
		if(model instanceof HyeneModel){
			HyeneModel hmod = (HyeneModel) model;
			hmod.setSticks(null);
		}		
	}

}
