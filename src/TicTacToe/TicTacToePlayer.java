package TicTacToe;

import Framework.Model.Player;

public class TicTacToePlayer extends Player {

	private Pion m_pion;
	
	public TicTacToePlayer(String name, Pion pion) {
		super(name);
		m_pion = pion;
	}
	
	public Pion getPion(){
		return m_pion;
	}

}
