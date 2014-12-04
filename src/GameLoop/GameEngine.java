package GameLoop;

public abstract class GameEngine {

	private Model m_model;
	private View m_view;
	private Controller m_controller;
	
	public abstract void init();

	protected void setModel(Model model){
		m_model = model;
	}
	
	protected void setView(View view){
		m_view = view;
	}
	
	protected void setController(Controller controller){
		m_controller = controller;
	}

	public void play(){
		init();
		
		while(!m_model.isGameEnded()){
			m_controller.update();
			m_view.draw(null);
		}
		
		end();
	}
	
	public Model getModel(){
		return m_model;
	}
	
	public abstract void end();

}
