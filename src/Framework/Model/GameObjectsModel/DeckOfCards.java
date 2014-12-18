package Framework.Model.GameObjectsModel;

import java.util.HashSet;

//TODO: pickRandomCard(nombre de cartes à piocher), equals(DeckOfCards), constructeur pour cartes pour un joueur

public class DeckOfCards implements GameObjectModel {
	private HashSet<Card> m_cards;
	private int m_size;
	
	public DeckOfCards(int n){
		m_size = n;
		m_cards = new HashSet<Card>(m_size);
		
		switch(m_size){
		case 54: // 54 Cards
			m_cards.add(new Card("Joker1",14));
			m_cards.add(new Card("Joker2",14));
		case 52: // 52 Cards
			for(int i=2;i<=6;i++){
				m_cards.add(new Card("Carreau",i));
				m_cards.add(new Card("Coeur",i));
				m_cards.add(new Card("Trèfle",i));
				m_cards.add(new Card("Pique",i));
			}
		default: // 32 Cards
			for(int i=7;i<=13;i++){
				m_cards.add(new Card("Carreau",i));
				m_cards.add(new Card("Coeur",i));
				m_cards.add(new Card("Trèfle",i));
				m_cards.add(new Card("Pique",i));
			}
			m_cards.add(new Card("Carreau",1));
			m_cards.add(new Card("Coeur",1));
			m_cards.add(new Card("Trèfle",1));
			m_cards.add(new Card("Pique",1));
			break;
		}
	}
	
	//DeckOfCards pickRandomCard(int n){
		
		
	//}
	
}
