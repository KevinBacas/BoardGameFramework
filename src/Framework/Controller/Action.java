package Framework.Controller;

import Framework.Model.Model;

public abstract class Action {
	
	private String label;
	
	public String getLabel() {
		return label;
	}
	
	public abstract boolean isLegal(Model model);
	
	public abstract void doAction(Model model);
	public abstract void undoAction(Model model);
	
}
