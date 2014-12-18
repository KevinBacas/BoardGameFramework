package Hyene;

import Framework.Controller.Rule;
import Framework.Model.Model;

public class RuleHyeneCanLeaveWell extends Rule {
	
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
		HyenePlayer p = (HyenePlayer) model.getCurrentPlayer();
		if(p.getnbTaba() < 4)
			res = false;
		return res;
	}
	
	public String getErrorMessage(){
		return "La hyene du joueur peut quitter le puits!";
	}
}
