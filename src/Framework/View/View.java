package Framework.View;
import java.awt.Graphics;

import Framework.Controller.Controller;
import Framework.Model.Model;

public class View {

    public Model m_model;
    public Controller m_controller;

    public void draw(Graphics g){
    	m_model.draw(g);
    }
    
    public void init(Model model, Controller controller){
    	m_model = model;
    	m_controller = controller;
    }

}
