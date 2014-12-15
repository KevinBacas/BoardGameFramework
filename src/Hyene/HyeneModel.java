package Hyene;

import java.awt.Graphics;

import GameLoop.Model;
import GameLoop.Player;
import GameObjects.Board2D;
import GameObjects.GameObject;

public class HyeneModel extends Model{

	private Board2D m_board;
	
	public HyeneModel(){
		super();
		m_board = new Board2D(3, 3);
	}
	
	public GameObject getElement(int i, int j){
		return m_board.get(i, j);
	}
	
	public void setElement(int i, int j, GameObject go){
		m_board.set(i, j, go);
	}
	
	public void draw(Graphics g){
		System.out.println(m_board);
	}

	@Override
	public boolean isGameEnded() {
		return false;
	}
	
}
