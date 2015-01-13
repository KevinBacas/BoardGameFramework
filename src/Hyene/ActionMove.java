package Hyene;

import Framework.Controller.Action;
import Framework.Model.Model;

public class ActionMove extends Action{

	int x;
	
	public ActionMove(int _x) {
		super();
		this.x = _x;
	}
	
	@Override
	public boolean isLegal(Model model) {
		if(model instanceof HyeneModel){
			HyeneModel hmod = (HyeneModel) model;
			HyenePlayer p = (HyenePlayer) hmod.m_current_player;
			int PlayerPosition = -1;
			int k = -1;
			while(PlayerPosition == -1){
				k++;
				PlayerPosition = hmod.findElement(k,p.token);
			}
			if(PlayerPosition+x < 0 || PlayerPosition+x >= hmod.getSize()) return false;
			else return true;
		}
		return false;
	}

	@Override
	public void doAction(Model model) {
		if(model instanceof HyeneModel){
			HyeneModel hmod = (HyeneModel) model;
			HyenePlayer p = (HyenePlayer) hmod.m_current_player;
			int PlayerPosition = -1;
			int k = -1;
			while(PlayerPosition == -1){
				k++;
				PlayerPosition = hmod.findElement(k,p.token);
			}
			if(x != 0){
				hmod.setElement(k, PlayerPosition+x, p.token);
				hmod.setElement(k, PlayerPosition, new TokenEmpty());
			}
		}
	}

	@Override
	public void undoAction(Model model) {
		if(model instanceof HyeneModel){
			HyeneModel hmod = (HyeneModel) model;
			HyenePlayer p = (HyenePlayer) hmod.m_current_player;
			int PlayerPosition = -1;
			int k = -1;
			while(PlayerPosition == -1){
				k++;
				PlayerPosition = hmod.findElement(k,p.token);
			}
			if(x != 0){
				hmod.setElement(k, PlayerPosition-x, p.token);
				hmod.setElement(k, PlayerPosition, new TokenEmpty());
			}
		}
		
	}

}
