package TicTacToe;

import Framework.Controller.Rule;
import Framework.Model.Model;

public class RuleHasAlignment extends Rule{

	public boolean checkRule(Model model){
		boolean res = false;
		if(model instanceof TicTacToeModel){
			TicTacToeModel tttmod = (TicTacToeModel) model;
			res = checkRule(tttmod);
		}
		return res;
	}
	
	public boolean checkRule(TicTacToeModel model){
		boolean res = false;
		res = ((model.getElement(0, 0) != null) 
				&& (model.getElement(0, 1) != null)
				&& model.getElement(0, 0).equals(model.getElement(0, 1))
				&& model.getElement(0, 1).equals(model.getElement(0, 2)))
			|| ((model.getElement(1, 0) != null) 
				&& (model.getElement(1, 1) != null)
				&& model.getElement(1, 0).equals(model.getElement(1, 1))
				&& model.getElement(1, 1).equals(model.getElement(1, 2)))
			|| ((model.getElement(2, 0) != null) 
				&& (model.getElement(2, 1) != null)
				&& model.getElement(2, 0).equals(model.getElement(2, 1))
				&& model.getElement(2, 1).equals(model.getElement(2, 2)))
			|| ((model.getElement(0, 0) != null) 
				&& (model.getElement(1, 0) != null)
				&& model.getElement(0, 0).equals(model.getElement(1, 0))
				&& model.getElement(1, 0).equals(model.getElement(2, 0)))
			|| ((model.getElement(0, 1) != null) 
				&& (model.getElement(1, 1) != null)
				&& model.getElement(0, 1).equals(model.getElement(1, 1))
				&& model.getElement(1, 1).equals(model.getElement(2, 1)))
			|| ((model.getElement(0, 2) != null) 
				&& (model.getElement(1, 2) != null)
				&& model.getElement(0, 2).equals(model.getElement(1, 2))
				&& model.getElement(1, 2).equals(model.getElement(2, 2)))
			|| ((model.getElement(0, 0) != null) 
				&& (model.getElement(1, 1) != null)
				&& model.getElement(0, 0).equals(model.getElement(1, 1))
				&& model.getElement(1, 1).equals(model.getElement(2, 1)))
			|| ((model.getElement(2, 0) != null) 
				&& (model.getElement(1, 1) != null)
				&& model.getElement(2, 0).equals(model.getElement(1, 1))
				&& model.getElement(1, 1).equals(model.getElement(0, 2)));
		return res;
	}
	
	public String getErrorMessage(){
		return "3 pions alignés!";
	}
}
