package TicTacToe;

import java.awt.Graphics;

import GameLoop.Model;
import GameObjects.Board2D;
import GameObjects.GameObject;

public class TicTacToeModel extends Model {
	
	private Board2D m_board;
	
	public TicTacToeModel(){
		super();
		m_board = new Board2D(3, 3);
	}
	
	public GameObject getElement(int i, int j){
		return m_board.get(i, j);
	}
	
	public void setElement(int i, int j, GameObject go){
		m_board.set(i, j, go);
	}

	@Override
	public boolean isGameEnded() {
		return hasAlignment() || isBoardFull();
	}

	public boolean isBoardFull() {
		boolean res = true;
		for(int i = 0 ; i < 3 && res ; ++i){
			for(int j = 0 ; j < 3 && res ; ++j){
				res = (getElement(i, j) != null);
			}
		}
		return res;
	}

	public boolean hasAlignment() {
		boolean res = false;
		res = ((getElement(0, 0) != null) 
				&& (getElement(0, 1) != null)
				&& getElement(0, 0).equals(getElement(0, 1))
				&& getElement(0, 1).equals(getElement(0, 2)))
			|| ((getElement(1, 0) != null) 
				&& (getElement(1, 1) != null)
				&& getElement(1, 0).equals(getElement(1, 1))
				&& getElement(1, 1).equals(getElement(1, 2)))
			|| ((getElement(2, 0) != null) 
				&& (getElement(2, 1) != null)
				&& getElement(2, 0).equals(getElement(2, 1))
				&& getElement(2, 1).equals(getElement(2, 2)))
			|| ((getElement(0, 0) != null) 
				&& (getElement(1, 0) != null)
				&& getElement(0, 0).equals(getElement(1, 0))
				&& getElement(1, 0).equals(getElement(2, 0)))
			|| ((getElement(0, 1) != null) 
				&& (getElement(1, 1) != null)
				&& getElement(0, 1).equals(getElement(1, 1))
				&& getElement(1, 1).equals(getElement(2, 1)))
			|| ((getElement(0, 2) != null) 
				&& (getElement(1, 2) != null)
				&& getElement(0, 2).equals(getElement(1, 2))
				&& getElement(1, 2).equals(getElement(2, 2)))
			|| ((getElement(0, 0) != null) 
				&& (getElement(1, 1) != null)
				&& getElement(0, 0).equals(getElement(1, 1))
				&& getElement(1, 1).equals(getElement(2, 1)))
			|| ((getElement(2, 0) != null) 
				&& (getElement(1, 1) != null)
				&& getElement(2, 0).equals(getElement(1, 1))
				&& getElement(1, 1).equals(getElement(0, 2)));
		return res;
	}
	
	public void draw(Graphics g){
		System.out.println(m_board);
	}

}
