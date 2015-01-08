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
			int i = hmod.findElement(p.getToken());
			if(i+x < 0 || i+x > hmod.getSize()) return false;
			else return true;
		}
		return false;
	}

	@Override
	public void doAction(Model model) {
		if(model instanceof HyeneModel){
			HyeneModel hmod = (HyeneModel) model;
			HyenePlayer p = (HyenePlayer) hmod.m_current_player;
			hmod.setElement(x, p.token);
		}
	}

	@Override
	public void undoAction(Model model) {
		// TODO Auto-generated method stub
		
	}

}
