package Hyene;

import java.awt.Graphics;
import java.util.*;

import Framework.Model.Model;
import Framework.Model.GameObjectsModel.Board2D;
import Framework.Model.GameObjectsModel.GameObjectModel;

public class HyeneModel extends Model{
	private final static int NUMBER_SQUARES = 57;
	private final int NUMBER_PLAYERS = m_players.size();
	private Board2D playing_board;
	private TokenStick[] m_sticks;
	private ArrayList<HyenePlayer> m_winners;
	private ArrayList<HyenePlayer> m_losers;
	private HyenePlayer m_hyene = null;

	
	public HyeneModel(){
		super();
		playing_board = new Board2D(NUMBER_PLAYERS, NUMBER_SQUARES);
		m_winners = new ArrayList<HyenePlayer>();
		m_losers = new ArrayList<HyenePlayer>();
		m_sticks = new TokenStick[3];
	}
	
	public ArrayList<GameObjectModel> getElement(int i) {
		ArrayList<GameObjectModel> list = new ArrayList<GameObjectModel>();
		
		for (int k = 0; k < NUMBER_PLAYERS; k++)
			if (playing_board.get(k, i) != null)
				list.add(playing_board.get(k, i));
			
		return list;
	}
	
	public void setElement(int j, int i, GameObjectModel go) {
		/*GameObjectModel objArray = m_board.get(1,i);
		for (GameObjectModel model: objArray){
			if (model == null){
				model = go;
				break;
			}
		}*/

		playing_board.set(j, i, go);
	}
	
	public TokenStick[] getSticks(){
		return m_sticks;
	}
	
	public void setSticks(TokenStick[] sticks){
		m_sticks = sticks;
	}
	
	public int getSticksResult(){
		int s = 0;
		for(TokenStick st : m_sticks){
			s += st.getFaceValue();
		}
		return s;
	}
	
	public boolean checkHyenePresence(){
		if(m_hyene == null)
			return false;
		else
			return true;
	}
	
	public void setHyenePresence(HyenePlayer p){
		m_hyene = p;
	}
	
	public void addWinner(HyenePlayer p){
		m_winners.add(p);
	}
	
	public void addLoser(HyenePlayer p){
		m_losers.add(p);
	}
	
	public void draw(Graphics g){
		System.out.println(playing_board);
	}

	@Override
	public boolean isGameEnded() {
		if(m_players.size() == 1 && m_players.get(0) == m_hyene)
			return true;
		return false;
	}
	
	public int findElement(int j, GameObjectModel go) {
		for(int i = 0; i < NUMBER_SQUARES;i++){
			if(this.getElement(i).get(j) != go)
				return i;
		}
		return -1;
	}
	
	public int getSize() {
		return NUMBER_SQUARES;
	}
	
}
