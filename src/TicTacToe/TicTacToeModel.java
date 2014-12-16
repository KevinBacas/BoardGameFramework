package TicTacToe;

import java.awt.Graphics;

import Framework.Model.Model;
import Framework.Model.Player;
import Framework.Model.GameObjectsModel.Board2D;
import Framework.Model.GameObjectsModel.GameObjectModel;

public class TicTacToeModel extends Model {
	
	private Board2D m_board;
	private RuleIsBoardFull m_ruleIsBoardFull;
	private RuleHasAlignment m_ruleHasAlignment;
	
	public TicTacToeModel(){
		super();
		m_board = new Board2D(3, 3);
		m_ruleIsBoardFull = new RuleIsBoardFull();
		m_ruleHasAlignment = new RuleHasAlignment();
	}
	
	public GameObjectModel getElement(int i, int j){
		return m_board.get(i, j);
	}
	
	public void setElement(int i, int j, GameObjectModel go){
		m_board.set(i, j, go);
	}

	@Override
	public boolean isGameEnded() {
		return m_ruleHasAlignment.checkRule(this) || m_ruleIsBoardFull.checkRule(this);
	}
	
	public void draw(Graphics g){
		System.out.println(m_board);
	}

	public Player getWinner() {
		Player res = null;
		if(m_ruleHasAlignment.checkRule(this))
		{
			res = getCurrentPlayer();
		}
		return res;
	}

}
