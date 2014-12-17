package Framework.View;

import Framework.Model.Model;
import Framework.Controller.Controller;
import Framework.Controller.Action;

import javax.swing.JPanel;

import java.awt.Graphics;

public abstract class View extends JPanel {
	static final long serialVersionUID = 1;
	protected Model m_model;
    private Controller m_controller;
  
    public void init(Model model, Controller controller) {
    	m_model = model;
    	m_controller = controller;
    }
    
    public void initListener(Listener listener) {
    	addMouseListener(listener);
    	addMouseWheelListener(listener);
    	addMouseMotionListener(listener);
    }
    
    public void sendActionToController(Action action) {
    	m_controller.receiveAction(action);
    }

    public abstract void paintComponent(Graphics g);
}
