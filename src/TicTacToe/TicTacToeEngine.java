package TicTacToe;

import java.util.Scanner;

import GameLoop.GameEngine;
import GameLoop.Player;

public class TicTacToeEngine extends GameEngine {
	
	@Override
	public void init(){
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom du Joueur X : ");
    	Player p1 = new TicTacToePlayer(scanner.nextLine(), new Pion('X'));
        System.out.print("Entrez le nom du Joueur O : ");
    	Player p2 = new TicTacToePlayer(scanner.nextLine(), new Pion('O'));
		
		TicTacToeModel tictactoe_model = new TicTacToeModel();
		TicTacToeController tictactoe_controller = new TicTacToeController();
		TicTacToeView tictactoe_view = new TicTacToeView();

		tictactoe_view.init(tictactoe_model, tictactoe_controller);
		tictactoe_controller.init(tictactoe_model, tictactoe_view);

		tictactoe_model.addPlayer(p1);
		tictactoe_model.addPlayer(p2);

		setModel(tictactoe_model);
		setView(tictactoe_view);
		setController(tictactoe_controller);
	}

	@Override
	public void end() {
		TicTacToeModel model = (TicTacToeModel) getModel();
		System.out.println("La partie est terminée");
	}

}
