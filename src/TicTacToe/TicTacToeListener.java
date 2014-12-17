package TicTacToe;

import java.awt.event.MouseEvent;

import javax.swing.SwingUtilities;

import Framework.View.Listener;

public class TicTacToeListener extends Listener {
	
	public void mousePressed(MouseEvent e) {
		if (SwingUtilities.isLeftMouseButton(e))
		{
			int x = (int)e.getPoint().getX();
			int y = (int)e.getPoint().getY();
			
			ActionJouer action = null;
			
			if (x > 0 && x < 300 && y > 0 && y < 300) {
				action = new ActionJouer(x/100, y/100);
				m_view.sendActionToController(action);
			}
		}
	}
}
