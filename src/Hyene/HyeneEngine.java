package Hyene;

import java.util.Scanner;

import Framework.Controller.GameEngine;
import Framework.Model.Player;


public class HyeneEngine extends GameEngine{
	
	@Override
	public void init(){
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom du Joueur 1 : ");
    	Player p1 = new HyenePlayer(scanner.nextLine());
        System.out.print("Entrez le nom du Joueur 2 : ");
    	Player p2 = new HyenePlayer(scanner.nextLine());
		
		HyeneModel Hyene_model = new HyeneModel(2);
		HyeneController Hyene_controller = new HyeneController();
		HyeneView Hyene_view = new HyeneView();

		Hyene_view.init(Hyene_model, Hyene_controller);
		Hyene_controller.init(Hyene_model, Hyene_view);

		Hyene_model.addPlayer(p1);
		Hyene_model.addPlayer(p2);

		setModel(Hyene_model);
		//setView(Hyene_view);
		setController(Hyene_controller);
	}

	@Override
	public void end() {
		HyeneModel model = (HyeneModel) getModel();
		/*
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
		*/
	}
}
