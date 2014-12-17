package Framework.View.GameObjectsView;

import java.awt.Graphics;
import javax.swing.JPanel;
import Framework.Model.GameObjectsModel.GameObjectModel;

public abstract class GameObjectView {
	
	private GameObjectModel m_model;
	
	public GameObjectView(GameObjectModel model){
		m_model = model;
	}
	
	public GameObjectModel getModel() {
		return m_model;
	}
	
	public abstract void draw(Graphics g, JPanel p, int x, int y, int height, int width);
}
