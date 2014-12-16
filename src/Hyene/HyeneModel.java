package Hyene;

import java.awt.Graphics;

import Framework.Model.Model;
import Framework.Model.GameObjectsModel.Board2D;
import Framework.Model.GameObjectsModel.GameObjectModel;

public class HyeneModel extends Model{
	private final static int NUMBER_SQUARES = 57;
	private Board2D m_board;
	private TokenStick[] m_sticks;
	
	public HyeneModel(){
		super();
		m_board = new Board2D(1, NUMBER_SQUARES);
		m_sticks = new TokenStick[4];
	}
	
	public GameObjectModel getElement(int i){
		return m_board.get(1,i);
	}
	
	public void setElement(int i, GameObjectModel go){
		/*GameObjectModel objArray = m_board.get(1,i);
		for (GameObjectModel model: objArray){
			if (model == null){
				model = go;
				break;
			}
		}*/
		m_board.set(1,i, go);
	}
	
	public TokenStick[] getSticks(){
		return m_sticks;
	}
	
	public void setSticks(TokenStick[] sticks){
		m_sticks = sticks;
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
