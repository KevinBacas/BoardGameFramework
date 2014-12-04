package GameLoop;
import java.awt.Event;
import java.awt.Graphics;

public class View {

    public Model m_model;
    public Controller m_controller;

    public void draw(Graphics g){
    	m_model.draw(g);
    }

    public void sendEvent(Event e) {
    	m_controller.receiveEvent(e);
    }

    public View() {}
    
    public void init(Model model, Controller controller){
    	m_model = model;
    	m_controller = controller;
    }

}
