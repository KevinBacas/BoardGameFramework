package Framework.Controller;

import Framework.Model.Model;

public abstract class Rule {
	
	public abstract boolean checkRule(Model model);
	
	public abstract String getErrorMessage();

}
