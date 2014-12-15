package GameLoop;

public abstract class Action {
	
	private String label;
	
	public String getLabel() {
		return label;
	}
	
	public boolean isLegal(Model model) {
		return true;
	}
	
}
