package Hyene;

import Framework.Model.Player;
import Framework.Model.GameObjectsModel.GameObjectModel;

public class HyenePlayer extends Player{

	TokenPlayer token;
	
	int nbTaba;
	int state = 0;
	// 0 = start
	// 1 = first travel
	// 2 = well
	// 3 = return
	// 4 = village (win)
	// 5 = hyene first travel
	// 6 = hyene at well
	// 7 = hyene return
	
	
	public HyenePlayer(String name) {
		super(name);
		nbTaba = 0;
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
