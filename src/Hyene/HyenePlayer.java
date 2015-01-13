package Hyene;

import Framework.Model.Player;
import Framework.Model.GameObjectsModel.GameObjectModel;

public class HyenePlayer extends Player{

	TokenPlayer token;
	
	int m_nbTaba;
	HyenePlayerState m_state = HyenePlayerState.START;
	
	
	public HyenePlayer(String name, GameObjectModel go) {
		super(name);
		m_nbTaba = 0;
		token = (TokenPlayer) go;
	}
	
	public GameObjectModel getToken() {
		return token;
	}
	
	public int getnbTaba() {
		return m_nbTaba;
	}
	
	public void incrementTaba(int n){
		m_nbTaba += n;
	}
	
	public void decrementTaba(int n){
		m_nbTaba -= n;
	}
	
	public HyenePlayerState getPlayerState(){
		return m_state;
	}
	
	public void nextPlayerState(){
		m_state = m_state.next();
	}
}
