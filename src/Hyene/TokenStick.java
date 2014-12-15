package Hyene;

import java.awt.Graphics;
import java.util.Random;

import GameObjects.GameObject;

public class TokenStick  implements GameObject{

	int N;
	
	public int getN(){
		return N;
	}
	
	public void roll(){
		Random rand = new Random();
		N = rand.nextInt(2);
	}
	
	@Override
	public void draw(Graphics g) {
	}

}
