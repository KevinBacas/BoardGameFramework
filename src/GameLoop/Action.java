package GameLoop;

public abstract class Action {
	
	private String label;
	
	public String getLabel() {
		return label;
	}
	
	public abstract boolean isLegal(Model model);
	
}
