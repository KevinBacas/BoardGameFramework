package TicTacToe;

import Framework.Controller.Rule;
import Framework.Model.Model;

public class RuleIsBoardFull extends Rule {

	public boolean checkRule(Model model){
		boolean res = false;
		if(model instanceof TicTacToeModel){
			TicTacToeModel tttmod = (TicTacToeModel) model;
			res = checkRule(tttmod);
		}
		return res;
	}
	
	public boolean checkRule(TicTacToeModel model){
		boolean res = true;
		for(int i = 0 ; i < 3 && res ; ++i){
			for(int j = 0 ; j < 3 && res ; ++j){
				res = (model.getElement(i, j) != null);
			}
		}
		return res;
	}
	
	public String getErrorMessage(){
		return "Le plateau est plein!";
	}
}
