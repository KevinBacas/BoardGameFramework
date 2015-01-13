package Hyene;

import java.util.Scanner;

import Framework.Controller.Action;
import Framework.Controller.Controller;
import Framework.Controller.Rule;
import Framework.Model.Model;

public class HyeneController extends Controller{
	
	@Override
	public void update() {
		HyeneModel model = getRealModel();
		HyenePlayer p = (HyenePlayer) getCurrentPlayer();
		int PlayerPosition;
		int k;
		Scanner scanner = new Scanner(System.in);
		
		ActionRoll roll;
		ActionMove move;
		Rule rcet = new RuleCanEarnTaba();
		Rule rrs = new RuleRerollSticks();
		
		do{
			PlayerPosition = -1;
			k = -1;
			
			roll = new ActionRoll();
			roll.doAction(model);
			
			switch(p.getPlayerState()){
			case START:
				Rule rmclv = new RuleMotherCanLeaveVillage();
				// Si le joueur a fait 1
				if(rcet.checkRule(model)){
					p.incrementTaba(1);
				}
				// Si le joueur a au moins 1 taba
				if(rmclv.checkRule(model)){
					p.decrementTaba(1);
					move = new ActionMove(model.getSticksResult());
					if(move.isLegal(model))
						move.doAction(model);
					p.nextPlayerState();
				}
				break;
			case MOTHER_TRAVEL:
				// Si le joueur a fait 1
				if(rcet.checkRule(model)){
					p.incrementTaba(1);
				}
				else{
					move = new ActionMove(model.getSticksResult());
					if(move.isLegal(model))
						move.doAction(model);
					// Recuperation de la position du joueur
					while(PlayerPosition == -1){
						k++;
						System.out.println("player :" + p);
						PlayerPosition = model.findElement(k,p.token);
					}
					// Si le joueur arrive au puits
					if(PlayerPosition == model.getSize())
						p.nextPlayerState();
				}
				break;
			case MOTHER_WELL:
				Rule rmclw = new RuleMotherCanLeaveWell();
				if(rmclw.checkRule(model)){
					p.decrementTaba(4);
					p.nextPlayerState();
					move = new ActionMove(model.getSticksResult());
					if(move.isLegal(model))
						move.doAction(model);
				}
				else{
					p.incrementTaba(model.getSticksResult());
				}
				break;
			case MOTHER_RETURN:
				move = new ActionMove(model.getSticksResult());
				if(move.isLegal(model))
					move.doAction(model);
				// Recuperation de la position du joueur
				while(PlayerPosition == -1){
					k++;
					PlayerPosition = model.findElement(k,p.token);
				}
				// Si le joueur arrive au village
				if(PlayerPosition != 0)
					break;
				else
					p.nextPlayerState();
			case VILLAGE:
				model.addWinner(p);
				if(model.checkHyenePresence() == true){
					model.m_players.remove(p);
					break;
				}
				else{
					p.nextPlayerState();
					model.setHyenePresence(p);
				}
			case HYENE_VILLAGE:
				Rule rhclv = new RuleHyeneCanLeaveVillage();
				if(rhclv.checkRule(model)){
					p.decrementTaba(2);
					p.nextPlayerState();
					move = new ActionMove(2*model.getSticksResult());
					if(move.isLegal(model))
						move.doAction(model);
				}
				else{
					p.incrementTaba(model.getSticksResult());
				}
				break;
			case HYENE_TRAVEL:
				move = new ActionMove(2*model.getSticksResult());
				if(move.isLegal(model))
					move.doAction(model);
				// Recuperation de la position du joueur
				while(PlayerPosition == -1){
					k++;
					PlayerPosition = model.findElement(k,p.token);
				}
				// Si le joueur arrive au puits
				if(PlayerPosition == model.getSize())
					p.nextPlayerState();
				break;
			case HYENE_WELL:
				Rule rhclw = new RuleHyeneCanLeaveWell();
				if(rhclw.checkRule(model)){
					p.decrementTaba(10);
					p.nextPlayerState();
					move = new ActionMove(2*model.getSticksResult());
					if(move.isLegal(model))
						move.doAction(model);
				}
				else{
					p.incrementTaba(model.getSticksResult());
				}
				break;
			case HYENE_RETURN:
				move = new ActionMove(2*model.getSticksResult());
				if(move.isLegal(model))
					move.doAction(model);
				// Recuperation de la position du joueur
				while(PlayerPosition == -1){
					k++;
					PlayerPosition = model.findElement(k,p.token);
				}
				// Recuperation de la position des autres joueurs
				int PlayerPosition2;
				HyenePlayer p2;
				int size = model.m_players.size();
				for(int i = 0; i < size ; i++){
					p2 = (HyenePlayer) model.m_players.get(i);
					if(p == p2)
						i++;
					k = -1;
					PlayerPosition2 = -1;
					while(PlayerPosition2 == -1){
						k++;
						PlayerPosition2 = model.findElement(k,p2.token);
					}
					// Defaite des joueurs rattrapes par la hyene
					if(PlayerPosition2 > PlayerPosition){
						model.addLoser(p2);
						model.m_players.remove(p2);
					}
				}
				break;
			}
		}while(rrs.checkRule(model) && !model.isGameEnded());
		
		if(!model.isGameEnded())
			model.toNextPlayer();
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
