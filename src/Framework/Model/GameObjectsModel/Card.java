package Framework.Model.GameObjectsModel;

public class Card implements GameObjectModel {
	private String m_color;
	private int m_value;
	
	public Card(String color,int value){
		m_color = color;
		m_value = value;
	}
	
	public String getColor(){
		return m_color;
	}
	
	public int getValue(){
		return m_value;
	}
	
	public String getValueString(){
		String s;
		switch(m_value){
		case 1:
			s = "As";
			break;
		case 2:
			s = "Deux";
			break;
		case 3:
			s = "Trois";
			break;
		case 4:
			s = "Quatre";
			break;
		case 5:
			s = "Cinq";
			break;
		case 6:
			s = "Six";
			break;
		case 7:
			s = "Sept";
			break;
		case 8:
			s = "Huit";
			break;
		case 9:
			s = "Neuf";
			break;
		case 10:
			s = "Dix";
			break;
		case 11:
			s = "Valet";
			break;
		case 12:
			s = "Reine";
			break;
		case 13:
			s = "Roi";
			break;
		default:
			s = "Joker";
		}
		return s;
	}
	
	public String getString(){
		if(getValue() == 14)
			return getValueString();
		else
			return getValueString() + " de " + getColor();
	}
}
