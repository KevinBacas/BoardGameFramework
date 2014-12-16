package Hyene;

import java.awt.Graphics;
import java.util.ArrayList;

import Framework.Model.Model;
import Framework.Model.GameObjectsModel.GameObjectModel;

public class HyeneModel extends Model{
	private final static int NUMBER_SQUARES = 57;

	private ArrayList<GameObjectModel[]> m_board;
	
	public HyeneModel(){
		super();
		m_board = new ArrayList<>(NUMBER_SQUARES);
	}
	
	public GameObjectModel[] getElement(int i){
		return m_board.get(i);
	}
	
	public void setElement(int i, GameObjectModel go){
		GameObjectModel[] objArray = m_board.get(i);
		for (GameObjectModel model: objArray){
			if (model == null){
				model = go;
				break;
			}
		}
		m_board.set(i, objArray);
	}
	
	public void draw(Graphics g){
		System.out.println(m_board);
	}

	@Override
	public boolean isGameEnded() {
		//for (int i = 1; i < NUMBER_SQUARES; i++)
		return false;
	}
	
}