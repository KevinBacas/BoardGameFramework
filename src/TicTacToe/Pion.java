package TicTacToe;

import Framework.Model.GameObjectsModel.GameObjectModel;

public class Pion implements GameObjectModel {
	
	private char m_pion;
	
	public Pion(char pion){
		m_pion = pion;
	}
	
	public String toString(){
		return m_pion + "";
	}
	
	public boolean equals(Object o){
		boolean res = false;
		if(o instanceof Pion){
			Pion p = (Pion) o;
			res = m_pion == p.m_pion;
		}
		return res;
		
	}

}
