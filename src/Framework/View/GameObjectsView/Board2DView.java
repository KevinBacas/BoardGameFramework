package Framework.View.GameObjectsView;

import java.awt.Graphics;

import javax.swing.JPanel;

import Framework.Model.GameObjectsModel.Board2D;
import Framework.Model.GameObjectsModel.GameObjectModel;

/*public class Board2DView extends GameObjectView {
	private int m_height;
	private int m_width;
	private GameObjectView[] m_board;
	
	public Board2DView(Board2D board) {
		super(board);
		
		m_height = ((Board2D)getModel()).getHeight();
		m_width = ((Board2D)getModel()).getWidth();
		m_board = new GameObjectView[m_height*m_width];
		
		for (int i = 0; i < m_height; i++) {
			for (int j = 0; j < m_width; j++) {
				m_board[i*m_width+j] = new GameObjectView(((Board2D)getModel()).get(i,  j));
			}
		}
	}
	
	public GameObjectView get(int i, int j) {
		if(i > -1 && j > -1 && i < m_height && j < m_width) {
			return m_board[i*m_width+j];
		}
	}
	
	public void draw(Graphics g, JPanel p, int x, int y, int height, int width) {
		for (int i = 0; i < m_height; i++) {
			for (int j = 0; j < m_width; j++) {
				get(i, j).draw(g, p, x+i*height, y+j*width, height, width);
			}
		}
	}

}*/