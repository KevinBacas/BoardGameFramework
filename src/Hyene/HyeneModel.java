package Hyene;

import java.awt.Graphics;
import java.util.ArrayList;
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
	private HyenePlayer m_hyene;

	
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
	
	public void setElement(int i, GameObjectModel go) {
		playing_board.set(1, i, go);
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
	
	public Pair<int,int> findElement(GameObjectModel go) {
		int i = 0;
		for(j = 0; j < NUMBER_PLAYERS;j++){
			for(i = 0; i < NUMBER_SQUARES;i++){
				if(this.getElement(i) != go)
					return Pair<int,int>(2,3);
			}
	}
	
	public int getSize() {
		return NUMBER_SQUARES;
	}
	
}
