package Framework.View.GameObjectsView;

import java.awt.Graphics;

import Framework.Model.GameObjectsModel.GameObjectModel;

public abstract class GameObjectView {
	
	private GameObjectModel m_model;
	
	public GameObjectView(GameObjectModel model){
		m_model = model;
	}
	
	public abstract void draw(Graphics g);

}
