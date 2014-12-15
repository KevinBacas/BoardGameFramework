package TicTacToe;

import java.util.Scanner;

import GameLoop.Action;
import GameLoop.Controller;
import GameLoop.Model;
import GameLoop.Player;

public class TicTacToeController extends Controller {

	@Override
	public void update() {
		TicTacToeModel model = getRealModel();
		TicTacToePlayer p = (TicTacToePlayer) getCurrentPlayer();

		Scanner scanner = new Scanner(System.in);
        System.out.println("Au tour de " + p);
        System.out.println("Entrez une position : (format : row col)");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        while( !isValidInput(row, col) || !(model.getElement(row, col) == null)){
            System.out.println("Position invalide !");
            System.out.println("Entrez une position : (format : row col)");
            row = scanner.nextInt();
            col = scanner.nextInt();
        }
        
        model.setElement(row, col, p.getPion());
        
        if(!model.isGameEnded()){
        	model.toNextPlayer();
        }
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
	public void makeAction(Action a) {

	}

}
