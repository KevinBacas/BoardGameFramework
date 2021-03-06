package Hyene;

import java.util.Scanner;

import Framework.Controller.GameEngine;
import Framework.Model.Player;


public class HyeneEngine extends GameEngine{
	
	@Override
	public void init(){
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom du Joueur 1 : ");
    	Player p1 = new HyenePlayer(scanner.nextLine(),new TokenPlayer(0));
        System.out.print("Entrez le nom du Joueur 2 : ");
    	Player p2 = new HyenePlayer(scanner.nextLine(),new TokenPlayer(1));
		
		HyeneModel Hyene_model = new HyeneModel(2);
		Hyene_model.addPlayer(p1);
		Hyene_model.addPlayer(p2);
		
		HyeneController Hyene_controller = new HyeneController();
		
		HyeneView Hyene_view = new HyeneView();
		Hyene_view.init(Hyene_model, Hyene_controller);
		
		Hyene_controller.init(Hyene_model, Hyene_view);

		setModel(Hyene_model);
		//setView(Hyene_view);
		setController(Hyene_controller);
	}

	@Override
	public void end() {
		HyeneModel model = (HyeneModel) getModel();
		
		System.out.println("C'EST FINI!!");
		System.out.println("Joueur gagnant : " + model.getHyene().getName());
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
