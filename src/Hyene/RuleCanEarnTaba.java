package Hyene;

import Framework.Controller.Rule;
import Framework.Model.Model;

public class RuleCanEarnTaba extends Rule {
	
	public boolean checkRule(Model model){
		boolean res = false;
		if(model instanceof HyeneModel){
			HyeneModel tttmod = (HyeneModel) model;
			res = checkRule(tttmod);
		}
		return res;
	}
	
	public boolean checkRule(HyeneModel model, int StickResult){
		boolean res = true;
		if(StickResult != 1)
			res = false;
		return res;
	}
	
	public String getErrorMessage(){
		return "Le joueur peut gagner un Taba!";
	}
}
