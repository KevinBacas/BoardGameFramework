package GameLoop;
import java.awt.Event;

public abstract class Controller {

    public Model m_model;
    public View m_view;
	
    public void receiveEvent(Event e) {
    }

    public Controller(){
    }
    
    public void init(Model model, View view){
    	m_model = model;
    	m_view = view;
    }
    
    public Player getCurrentPlayer(){
    	return m_model.getCurrentPlayer();
    }
    
    public abstract void update();
    
    public Model getModel(){
    	return m_model;
    }

}
