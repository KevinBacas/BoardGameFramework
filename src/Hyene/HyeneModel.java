package Hyene;

import java.awt.Graphics;
import java.util.ArrayList;

import Framework.Model.Model;
import Framework.Model.GameObjectsModel.GameObjectModel;

public class HyeneModel extends Model{
	private final static int NUMBER_SQUARES = 57;

	private ArrayList<GameObjectModel> m_board;
	
	public HyeneModel(){
		super();
		m_board = new ArrayList<>(NUMBER_SQUARES);
	}
	
	public GameObjectModel getElement(int i){
		return m_board.get(i);
	}
	
	public void setElement(int i, GameObjectModel go){
		m_board.set(i, go);
	}
	
	public void draw(Graphics g){
		System.out.println(m_board);
	}

	@Override
	public boolean isGameEnded() {
		return false;
	}
	
}