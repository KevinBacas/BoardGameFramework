package TicTacToe;

import Framework.View.GameObjectsView.GameObjectView;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PionView extends GameObjectView {
	public PionView(Pion pion) {
		super(pion);
	}
	
	public void draw(Graphics g, JPanel p, int x, int y, int height, int width) {
		Image img = null;
		if(getModel() == null)
		{
			try {
				img = ImageIO.read(new File("empty.jpg"));
				g.drawImage(img, x, y, p);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else
		{
			if (((Pion)getModel()).getPion() == 'X') {
				try {
					img = ImageIO.read(new File("cross.jpg"));
					g.drawImage(img, x, y, p);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			else if (((Pion)getModel()).getPion() == 'O')
			{
				try {
					img = ImageIO.read(new File("round.jpg"));
					g.drawImage(img, x, y, p);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
