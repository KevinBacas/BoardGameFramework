import GameLoop.Model;
import GameLoop.Player;
import GameLoop.Rule;

public class RuleCanEarnTaba extends Rule {
	private int m_StickResult;
	
	public RuleCanEarnTaba(int r){
		super();
		m_StickResult = r;
	}
	
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
		
		
		
		return res;
	}
	
	public String getErrorMessage(){
		return "Le joueur peut gagner un Taba!";
	}
}
