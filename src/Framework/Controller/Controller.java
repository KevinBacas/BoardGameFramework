package Framework.Controller;

import Framework.Model.Model;
import Framework.View.View;

public abstract class Controller {

    public Model m_model;
    public View m_view;
    
    public void init(Model model, View view){
    	m_model = model;
    	m_view = view;
    }
    
    public Player getCurrentPlayer(){
    	return m_model.getCurrentPlayer();
    }
    
    public abstract void update();
    
    public void receiveAction(Action action){
    	if(action.isLegal(m_model)){
    		action.doAction(m_model);
    	}else{
    		//TODO: Traitement de l'erreur.
    		//TODO: Affichage de l'erreur.
    	}
    }
    
    public Model getModel(){
    	return m_model;
    }

}
