package Hyene;

import Framework.Model.GameObjectsModel.GameObjectModel;

public class TokenPlayer implements GameObjectModel{

	HyenePlayerColor color = HyenePlayerColor.RED;
	
	public TokenPlayer(int c){
		color = color.setColor(c);
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
