package Hyene;

import java.util.Scanner;

import GameLoop.Action;
import GameLoop.Controller;
import GameLoop.Model;

public class HyeneController extends Controller{

	@Override
	public void update() {
		HyeneModel model = getRealModel();
		HyenePlayer p = (HyenePlayer) getCurrentPlayer();

		Scanner scanner = new Scanner(System.in);
        
		Action a = new ActionRoll();
		
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
	public void makeAction(Action a) {
		if(a instanceof ActionRoll){
			
		}
	}

}
