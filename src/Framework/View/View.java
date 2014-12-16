package Framework.View;
import java.awt.Graphics;

import javax.swing.JPanel;

import Framework.Controller.Action;
import Framework.Controller.Controller;

public class View extends JPanel {

    private Controller m_controller;
    
    protected void sendActionToController(Action action){
    	m_controller.receiveAction(action);
    }

    public void draw(Graphics g) {
    	//TODO: draw
    }

    public void init(Controller controller){
    	m_controller = controller;
    }
}
