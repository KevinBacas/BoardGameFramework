package Framework.Model.GameObjectsModel;

public class Board2D implements GameObjectModel {

	private GameObjectModel m_board[];
	private int m_height;
	private int m_width;
	  
	public Board2D(int height, int width){
		m_height = height;
		m_width = width;
		m_board = new GameObjectModel[m_height * m_width];
	}
	
	public GameObjectModel get(int i, int j) {
		GameObjectModel res = null;
		if(i > -1 && j > -1 && i < m_height && j < m_width){
			res = m_board[i * m_width + j];
		}
		return res;
	}
	
	public void set(int i, int j, GameObjectModel go) {
		if(i > -1 && j > -1 && i < m_height && j < m_width){
			m_board[i * m_width + j] = go;
		}
	}
	
	public int getHeight() {
		return m_height;
	}
	
	public int getWidth() {
		return m_width;
	}
	
    public String toString() {
    	String res = "";
    	for(int i = 0 ; i < m_height - 1 ; ++i)
    	{
    		for(int j = 0 ; j < m_width - 1; ++j)
    		{
    			if (get(i, j) != null)
    			{
    				res += get(i, j).toString() + "|";
    			}
    			else
    			{
    				res += " " + "|";
    			}
    		}
    		
    		if (get(i, 2) != null)
			{
				res += get(i, 2).toString();
			}
			else
			{
				res += " ";
			}
    		res += "\n-+-+-\n";
    	}
    	
    	for(int j = 0 ; j < m_width - 1; ++j)
		{
			if (get(2, j) != null)
			{
				res += get(2, j).toString() + "|";
			}
			else
			{
				res += " " + "|";
			}
		}
		
		if (get(2, 2) != null)
		{
			res += get(2, 2).toString();
		}
		else
		{
			res += " ";
		}

		return res;
    }
}
