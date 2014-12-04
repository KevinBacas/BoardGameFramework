package TicTacToe;

import java.awt.Graphics;

import GameObjects.GameObject;

public class Pion implements GameObject {
	
	private char m_pion;
	
	public Pion(char pion){
		m_pion = pion;
	}

	@Override
	public void draw(Graphics g) {
		
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
