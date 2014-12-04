package GameLoop;

public class Player {

  private String m_name;

  public Player(String name){
	  m_name = name;
  }
  
  public String getName(){
	  // Force une copie de la chaine pour éviter la modification
	  return m_name + "";
  }
  
  public String toString(){
	  return getName();
  }

}
