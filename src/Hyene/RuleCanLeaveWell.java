package Hyene;

import Framework.Controller.Rule;
import Framework.Model.Model;

public class RuleCanLeaveWell extends Rule {
	
	public boolean checkRule(Model model){
		boolean res = false;
		if(model instanceof HyeneModel){
			HyeneModel tttmod = (HyeneModel) model;
			res = checkRule(tttmod);
		}
		return res;
	}
	
	public boolean checkRule(HyeneModel model){
		boolean res = true;
		HyenePlayer p = (HyenePlayer) model.getCurrentPlayer();
		if(p.getnbTaba() < 4)
			res = false;
		return res;
	}
	
	public String getErrorMessage(){
		return "Le joueur peut quitter le puits!";
	}
}
