package TicTacToe;

import java.util.Scanner;

import Framework.Controller.Action;
import Framework.Controller.Controller;
import Framework.Model.Model;

public class TicTacToeController extends Controller {

	@Override
	public void update() {
		//TODO: Gestion d'une file d'actions
	}
	
	private TicTacToeModel getRealModel(){
		Model m = getModel();
		if(!(m instanceof TicTacToeModel)){
			m = null;
		}
		return (TicTacToeModel) m;
	}
	
	private boolean isValidInput(int row, int col){
		return (row > -1 && col > -1 && row < 3 && col < 3);
	}

	@Override
	public void receiveAction(Action a) {
		if(a.isLegal(getRealModel()))
		{
			a.doAction(getRealModel());
			if(!getModel().isGameEnded())
			{
				getModel().toNextPlayer();
			}
		}
	}

}
