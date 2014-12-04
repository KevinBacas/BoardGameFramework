package GameLoop;

public abstract class Rule {
	
	public abstract boolean checkRule(Model model);
	
	public abstract String getErrorMessage();

}
