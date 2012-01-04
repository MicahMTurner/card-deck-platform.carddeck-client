package client.api;

import java.util.ArrayList;

public class Player {
	private String username;
	private ArrayList<Card> hand;

	public ArrayList<Card> getHand() {
		return hand;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Player(String username){
		this.username = username;
		hand=new ArrayList<Card>();
	}
}
