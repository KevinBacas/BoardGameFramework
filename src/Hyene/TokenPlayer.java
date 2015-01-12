package Hyene;

import Framework.Model.GameObjectsModel.GameObjectModel;

public class TokenPlayer implements GameObjectModel{

	String color;
	
	public TokenPlayer(String _color){
		color = _color;
	}
	
	public boolean equals(Object o){
		boolean res = false;
		if(o instanceof TokenPlayer){
			TokenPlayer t = (TokenPlayer) o;
			res =  color == t.color;
		}
		return res;
		
	}

}
