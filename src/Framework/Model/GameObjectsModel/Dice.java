package Framework.Model.GameObjectsModel;

public class Dice implements GameObjectModel{
	private int m_nbFaces;
	private int m_faceValue;
	
	public Dice(int nbFaces){
		m_nbFaces = nbFaces;
	}
	public int roll(){
		m_faceValue = (int)(Math.random() * m_nbFaces) + 1;
		return m_faceValue;
	}
	public void setFaceValue (int faceValue){
		m_faceValue = faceValue;
	}
	public int getFaceValue(){
		return m_faceValue;
	}
	public String toString() {
		String result = Integer.toString(m_faceValue);
		return result;
	}
}
