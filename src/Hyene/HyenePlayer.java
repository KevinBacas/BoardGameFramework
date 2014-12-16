package Hyene;

import Framework.Model.Player;
import Framework.Model.GameObjectsModel.GameObjectModel;

public class HyenePlayer extends Player{

	GameObjectModel token;
	
	int nbTaba;
	
	public HyenePlayer(String name) {
		super(name);
	}
	
	public GameObjectModel getToken() {
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
