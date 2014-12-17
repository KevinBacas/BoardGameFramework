package TicTacToe;

import java.awt.Dimension;
import java.util.Scanner;

import Framework.Controller.GameEngine;
import Framework.Controller.Player;
import Framework.View.Frame;

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
		TicTacToeListener tictactoe_listener = new TicTacToeListener();
		
		tictactoe_view.init(tictactoe_model, tictactoe_controller);
		tictactoe_controller.init(tictactoe_model, tictactoe_view);
		tictactoe_listener.init(tictactoe_view, tictactoe_controller);
		tictactoe_view.initListener(tictactoe_listener);
		tictactoe_view.setPreferredSize(new Dimension(300, 300));
		
		new Frame("Tic-tac-toe", tictactoe_view);
		
		tictactoe_model.addPlayer(p1);
		tictactoe_model.addPlayer(p2);

		setModel(tictactoe_model);
		setView(tictactoe_view);
		setController(tictactoe_controller);
	}

	@Override
	public void end() {
		TicTacToeModel model = (TicTacToeModel) getModel();
		Player p = model.getWinner();
		System.out.println("La partie est terminée");
		if(p != null)
		{
			System.out.println(p + " a gagné.");
		}
		else
		{
			System.out.println("Il y a égalité.");
		}
	}

}
