package Hyene;

import java.awt.Graphics;

import GameObjects.GameObject;

public class TokenPlayer  implements GameObject{

	String color;
	
	public TokenPlayer(String _color){
		color = _color;
	}
	
	@Override
	public void draw(Graphics g) {
	}

}
