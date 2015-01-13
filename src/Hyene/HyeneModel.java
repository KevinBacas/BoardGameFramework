package Hyene;

import java.awt.Graphics;
import java.util.*;

import Framework.Model.Model;
import Framework.Model.Player;
import Framework.Model.GameObjectsModel.Board2D;
import Framework.Model.GameObjectsModel.GameObjectModel;

public class HyeneModel extends Model{
	private final static int NUMBER_SQUARES = 57;
	private final int NUMBER_PLAYERS;
	private Board2D playing_board;
	private TokenStick[] m_sticks;
	private ArrayList<HyenePlayer> m_winners;
	private ArrayList<HyenePlayer> m_losers;
	private HyenePlayer m_hyene = null;

	public HyeneModel(int PlayerNumber){
		super();
		NUMBER_PLAYERS = PlayerNumber;
		playing_board = new Board2D(PlayerNumber, NUMBER_SQUARES);
		m_winners = new ArrayList<HyenePlayer>();
		m_losers = new ArrayList<HyenePlayer>();
		m_sticks = new TokenStick[3];
		for(int i=0;i<3;i++){
			m_sticks[i] = new TokenStick();
		}
	}
	
	public ArrayList<GameObjectModel> getElement(int i) {
		ArrayList<GameObjectModel> list = new ArrayList<GameObjectModel>();
		
		for (int k = 0; k < NUMBER_PLAYERS; k++)
			list.add(playing_board.get(k, i));
			
		return list;
	}
	
	public void setElement(int PlayerNumber, int Position, GameObjectModel go) {
		playing_board.set(PlayerNumber, Position, go);
	}
	
	@Override
	public void addPlayer(Player p){
		int PlayerNum = m_players.size();
		super.addPlayer(p);
		this.setElement(PlayerNum, 0, new TokenPlayer(PlayerNum));
		//TEST
		int pos = -1;
		int qq = -1;
		while(pos == -1){
			qq++;
			pos = this.findElement(qq,((HyenePlayer)p).token);
		}
		System.out.println("DEBUT!!! Player " + p + " Position " + pos);
		System.out.println("DEBUT!!! " + ((HyenePlayer)p).getPlayerState() + "  " + ((HyenePlayer)p).getnbTaba() + " Tabas ");
		//TEST
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
	
	public int findElement(int PlayerNumber, GameObjectModel go) {
		for(int Position = 0; Position < NUMBER_SQUARES; Position++){
			if(this.getElement(Position).get(PlayerNumber) == go){
				System.out.println("QQQQQQQQ" + Position + " num " + PlayerNumber);
				return Position;
			}
		}
		return -1;
	}
	
	public int getSize() {
		return NUMBER_SQUARES;
	}
	
}
