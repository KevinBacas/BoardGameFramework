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
			TokenStick[] sticks = hmod.getSticks();
			for(TokenStick s : sticks){
				s.roll();
				// par défaut, valeur = 1 ou 2, on veut 0 ou 1
				s.setFaceValue(s.getFaceValue() - 1);
			}
			hmod.setSticks(sticks);
		}
	}

	@Override
	public void undoAction(Model model) {
		// TODO Auto-generated method stub
		
	}

}
