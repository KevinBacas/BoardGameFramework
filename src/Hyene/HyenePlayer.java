package Hyene;

import GameLoop.Player;
import GameObjects.GameObject;

public class HyenePlayer extends Player{

	GameObject token;
	
	int nbTaba;
	
	public HyenePlayer(String name) {
		super(name);
	}
	
	public GameObject getToken() {
		return token;
	}
	
	public int getnbTaba() {
		return nbTaba;
	}
	
	public void incrementTaba(int n){
		nbTaba += n;
	}
	
	public void decrementTaba(int n){
		nbTaba -= n;
	}
	
}
