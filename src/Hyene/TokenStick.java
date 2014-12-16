package Hyene;

import java.util.Random;

import Framework.Model.GameObjectsModel.GameObjectModel;

public class TokenStick implements GameObjectModel{

	int N;
	
	public int getN(){
		return N;
	}
	
	public void roll(){
		Random rand = new Random();
		N = rand.nextInt(2);
	}

}
