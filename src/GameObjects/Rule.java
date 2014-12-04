package GameObjects;

import GameLoop.Model;

public abstract class Rule {
	
	public abstract boolean checkRule(Model model);
	
	public abstract String getErrorMessage();

}
