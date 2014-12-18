package Hyene;

import java.util.Scanner;

import Framework.Controller.Action;
import Framework.Controller.Controller;
import Framework.Model.Model;

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
	public void receiveAction(Action a) {
		if(a instanceof ActionRoll){
			
		}
	}

}
