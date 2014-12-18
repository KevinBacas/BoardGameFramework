package TicTacToe;

import java.awt.Color;
import java.awt.Graphics;

import Framework.View.View;

public class TicTacToeView extends View {

	public void paintComponent(Graphics g) {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				PionView pv = new PionView((Pion)((TicTacToeModel)m_model).getElement(i, j));
				pv.draw(g, this, i*100, j*100, 100, 100);
			}
		
		g.setColor(Color.BLACK);
		g.drawLine(0, 100, 300, 100);
		g.drawLine(0, 200, 300, 200);
		g.drawLine(100, 0, 100, 300);
		g.drawLine(200, 0, 200, 300);
	}
}
