package Hyene;

import Framework.Controller.Action;
import Framework.Model.Model;

public class ActionPay extends Action{
	
	int n;
	
	public ActionPay(int _n) {
		super();
		this.n = _n;
	}

	@Override
	public boolean isLegal(Model model) {
		if(model instanceof HyeneModel){
			HyeneModel hmod = (HyeneModel) model;
			HyenePlayer p = (HyenePlayer) hmod.m_current_player;
			if(p.getnbTaba() >= n) return true;
		}
		return false;
	}

	@Override
	public void doAction(Model model) {
		if(model instanceof HyeneModel){
			HyeneModel hmod = (HyeneModel) model;
			HyenePlayer p = (HyenePlayer) hmod.m_current_player;
			p.decrementTaba(n);
		}
	}

	@Override
	public void undoAction(Model model) {
		if(model instanceof HyeneModel){
			HyeneModel hmod = (HyeneModel) model;
			HyenePlayer p = (HyenePlayer) hmod.m_current_player;
			p.incrementTaba(n);
		}
	}

}
