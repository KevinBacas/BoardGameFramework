package Hyene;

import java.util.Scanner;

import Framework.Controller.Action;
import Framework.Controller.Controller;
import Framework.Controller.Rule;
import Framework.Model.Model;
import Framework.View.View;

public class HyeneController extends Controller{
	
	@Override
	public void update() {
		HyeneModel model = getRealModel();
		HyenePlayer p = (HyenePlayer) getCurrentPlayer();

		Scanner scanner = new Scanner(System.in);
		
		Action roll = new ActionRoll();
		Rule rcet = new RuleCanEarnTaba();
		
		//TODO PARTOUT RuleRerollSticks mais voir pour stocker résultats continuels des dés
		
		switch(p.getPlayerState()){
		case START:
			Rule rmclv = new RuleMotherCanLeaveVillage();
			roll.doAction(model);
			// Si le joueur a fait 1
			if(rcet.checkRule(model)){
				p.incrementTaba(1);
			}
			// Si le joueur a au moins 1 taba
			if(rmclv.checkRule(model)){
				p.decrementTaba(1);
				//TODO Déplacement
				p.nextPlayerState();
			}
			break;
		case MOTHER_TRAVEL:
			// Si le joueur a fait 1
			if(rcet.checkRule(model)){
				p.incrementTaba(1);
			}
			else{
				//TODO Déplacement
			}
			//TODO Si le joueur arrive au puit
				//p.nextPlayerState();
			break;
		case MOTHER_WELL:
			Rule rmclw = new RuleMotherCanLeaveWell();
			roll.doAction(model);
			if(rmclw.checkRule(model)){
				p.decrementTaba(4);
				p.nextPlayerState();
				//TODO Déplacement
			}
			else{
				p.incrementTaba(model.getSticksResult());
			}
			break;
		case MOTHER_RETURN:
			roll.doAction(model);
			//TODO Déplacement
			//TODO Si le joueur arrive au village
				//p.nextPlayerState();
				// PAS BREAK
			//sinon break
			break;
		case VILLAGE:
			model.addWinner(p);
			if(model.checkHyenePresence() == false)
				p.nextPlayerState();
			break;
		case HYENE_VILLAGE:
			roll.doAction(model);
			Rule rhclv = new RuleHyeneCanLeaveVillage();
			if(rhclv.checkRule(model)){
				p.decrementTaba(2);
				p.nextPlayerState();
				//TODO Déplacement
			}
			else{
				p.incrementTaba(model.getSticksResult());
			}
			break;
		case HYENE_TRAVEL:
			roll.doAction(model);
			//TODO Déplacement double
			//TODO Si le joueur arrive au puits
				//p.nextPlayerState();
			break;
		case HYENE_WELL:
			roll.doAction(model);
			Rule rhclw = new RuleHyeneCanLeaveWell();
			if(rhclw.checkRule(model)){
				p.decrementTaba(10);
				p.nextPlayerState();
				//TODO Déplacement double
			}
			else{
				p.incrementTaba(model.getSticksResult());
			}
			break;
		case HYENE_RETURN:
			roll.doAction(model);
			//TODO Déplacement double
			break;
		}

        if(!model.isGameEnded()){
        	model.toNextPlayer();
        }
	}
	
	private HyeneModel getRealModel(){
		Model m = getModel();
		if(!(m instanceof HyeneModel)){
			m = null;
		}
		return (HyeneModel) m;
	}

	@Override
	public void receiveAction(Action a) {
		if(a instanceof ActionRoll){
			
		}
	}

}
