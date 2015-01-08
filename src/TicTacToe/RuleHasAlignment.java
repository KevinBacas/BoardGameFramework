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
		res = (checkLine(model, 0, 0, 0, 1, 0, 2)
			|| checkLine(model, 1, 0, 1, 1, 1, 2)
			|| checkLine(model, 2, 0, 2, 1, 2, 2)
			|| checkLine(model, 0, 0, 1, 0, 2, 0)
			|| checkLine(model, 0, 1, 1, 1, 2, 1)
			|| checkLine(model, 0, 2, 1, 2, 2, 2)
			|| checkLine(model, 0, 0, 1, 1, 2, 2)
			|| checkLine(model, 2, 0, 1, 1, 0, 2)
			);
		return res;
	}
	
	private boolean checkEqualsPositions(TicTacToeModel model, int x1, int y1, int x2, int y2){
		return model.getElement(x1, y1).equals(model.getElement(x2, y2));
	}
	
	private boolean checkLine(TicTacToeModel model, int x1, int y1, int x2, int y2, int x3, int y3){
		return model.getElement(x1, y1) != null
		&& model.getElement(x2, y2) != null
		&& checkEqualsPositions(model, x1, y1, x2, y2)
		&& checkEqualsPositions(model, x2, y2, x3, y3);
	}
	
	public String getErrorMessage(){
		return "3 pions alignés!";
	}
}
