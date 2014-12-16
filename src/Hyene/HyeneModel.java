package Hyene;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import Framework.Model.Model;
import Framework.Model.GameObjectsModel.Board2D;
import Framework.Model.GameObjectsModel.GameObjectModel;

public class HyeneModel extends Model{
	private final static int NUMBER_SQUARES = 57;
	private Board2D playing_board;
	private List<HyenePlayer> losers_board;
	private List<HyenePlayer> winners_board;
	private TokenStick[] m_sticks;
	
	public HyeneModel(){
		super();
		playing_board = new Board2D(1, NUMBER_SQUARES);
		winners_board = new ArrayList<>();
		losers_board = new ArrayList<>();
		m_sticks = new TokenStick[4];
	}
	
	public GameObjectModel getElement(int i){
		return playing_board.get(1,i);
	}
	
	public void setElement(int i, GameObjectModel go){
		/*GameObjectModel objArray = m_board.get(1,i);
		for (GameObjectModel model: objArray){
			if (model == null){
				model = go;
				break;
			}
		}*/
		playing_board.set(1,i, go);
	}
	
	public TokenStick[] getSticks(){
		return m_sticks;
	}
	
	public void setSticks(TokenStick[] sticks){
		m_sticks = sticks;
	}
	
	public void draw(Graphics g){
		System.out.println(playing_board);
	}

	@Override
	public boolean isGameEnded() {
		for (int i = 1; i < NUMBER_SQUARES; i++){
			if (!(playing_board.get(1, i) instanceof TokenPlayer))
				return false;
		}
		return true;
	}
	
}
