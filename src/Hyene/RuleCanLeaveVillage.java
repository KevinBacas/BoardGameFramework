package Hyene;

import GameLoop.Model;
import GameLoop.Player;
import GameLoop.Rule;

public class RuleCanLeaveVillage extends Rule {

	public boolean checkRule(Model model){
		boolean res = false;
		if(model instanceof HyeneModel){
			HyeneModel hmod = (HyeneModel) model;
			res = checkRule(hmod);
		}
		return res;
	}
	
	public boolean checkRule(HyeneModel model){
		boolean res = true;
		HyenePlayer p = model.getCurrentPlayer();
		if(p.getnbTaba() < 1)
			res = false;
		return res;
	}
	
	public String getErrorMessage(){
		return "Le joueur peut quitter le village!";
	}
}
