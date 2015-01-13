package Hyene;

import Framework.Controller.Rule;
import Framework.Model.Model;

public class RuleRerollSticks extends Rule {
	
	public boolean checkRule(Model model){
		boolean res = false;
		if(model instanceof HyeneModel){
			HyeneModel hmod = (HyeneModel) model;
			res = checkRule(hmod);
		}
		return res;
	}
	
	public boolean checkRule(HyeneModel model){
		if(model.getSticksResult() != 2)
			return false;
		return true;
	}
	
	public String getErrorMessage(){
		return "Le joueur peut relancer les bâtonnets!";
	}
}
