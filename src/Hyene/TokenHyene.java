package Hyene;

import Framework.Model.GameObjectsModel.GameObjectModel;

public class TokenHyene implements GameObjectModel{
	private boolean alreadyDrank = false;
	
	public TokenHyene(){
		alreadyDrank = false;
	}
	
	public void drinkWater(){
		alreadyDrank = true;
	}
	
	public boolean hadDrank(){
		return alreadyDrank;
	}
}
