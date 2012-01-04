package client.api;

import java.util.ArrayList;

public class PublicArea {
	private ArrayList<CardPlayer> cards;
	
	
	public ArrayList<CardPlayer> getCards() {
		return cards;
	}
	public void add(String userName,Card card){
		cards.add(new CardPlayer(userName,card));
	}
}
