package TicTacToe;

import javax.swing.SwingUtilities;

import Framework.View.Listener;

public class TicTacToeListener extends Listener {
	public
	
	public void mousePressed(MouseEvent e) {
		if (SwingUtilities.isLeftMouseButton(e))
		{
			int x = (int)e.getPoint().getX();
			int y = (int)e.getPoint().getY();
			
			if (x > 0 && x < 100)
			{
				
			}
			else if (x > 100 && x < 200)
			{
				
			}
			else if (x > 200 && x < 300)
			{
				
			}
	}
}
