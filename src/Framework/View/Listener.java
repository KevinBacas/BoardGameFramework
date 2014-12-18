package Framework.View;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Framework.Controller.Controller;

public abstract class Listener extends MouseAdapter {
	protected View m_view;
	protected Controller m_controller;
	
	public void init(View view, Controller controller) {
		m_view = view;
		m_controller = controller;
	}
	
	public abstract void mousePressed(MouseEvent e);
}
