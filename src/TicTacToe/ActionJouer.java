package TicTacToe;

import Framework.Controller.Action;
import Framework.Model.Player;
import Framework.Model.Model;

public class ActionJouer extends Action {
	private int m_x;
	private int m_y;
	
	public ActionJouer(int x, int y) {
		m_x = x;
		m_y = y;
	}
	
	public boolean isLegal(TicTacToeModel model) {
		if (model.getElement(m_x, m_y) == null)
			return true;
		
		return false;
	}
	
	public void doAction(TicTacToeModel model) {
		Player p = model.getCurrentPlayer();
		if(p instanceof TicTacToePlayer)
		{
			Pion pion = ((TicTacToePlayer)p).getPion();
			model.setElement(m_x, m_y, pion);
		}
	}
	
	public void undoAction(TicTacToeModel model) {}

	@Override
	public boolean isLegal(Model model) {
		if(model instanceof TicTacToeModel){
			return this.isLegal((TicTacToeModel) model);
		}
		return false;
	}

	@Override
	public void doAction(Model model) {
		if(model instanceof TicTacToeModel){
			this.doAction((TicTacToeModel) model);
		}
		
	}

	@Override
	public void undoAction(Model model) {
		if(model instanceof TicTacToeModel){
			this.undoAction((TicTacToeModel) model);
		}
	}
	
}
