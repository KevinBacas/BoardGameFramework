package Framework.Model;
import java.awt.Graphics;
import java.util.ArrayList;

public abstract class Model {

	public ArrayList<Player> m_players;
	public Player m_current_player;

	public Model() {
		m_players = new ArrayList<>();
	}

	public void addPlayer(Player player){
		m_players.add(player);
		if(m_current_player == null){
			m_current_player = player;
		}
	}
	
	public void draw(Graphics g){
		System.out.println("Current player : " + m_current_player);
	}

	public abstract boolean isGameEnded();

	public Player getCurrentPlayer() {
		return m_current_player;
	}
	
	public Player toNextPlayer(){
		int index = m_players.indexOf(m_current_player);
		m_current_player = m_players.get((index + 1) % m_players.size());
		return getCurrentPlayer();
	}

}
