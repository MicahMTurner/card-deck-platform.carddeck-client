package client.api;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public abstract class Game implements Actions {
	
	protected int minimumPlayers;
	ArrayList<Card> unShuffleDeck;
	protected Hashtable<String ,Player> players;
	protected Queue<Card> deck;
	protected String currentTurn;
	protected int round;
	protected PublicArea publicArea;
	public Game(int minimumPlayers) {
		this.minimumPlayers=minimumPlayers;
		unShuffleDeck=createDeck();
		deck=new LinkedList<Card>();
		publicArea=new PublicArea();
	}
	
	//shuffle deck
	//add players to game
	public abstract void setDeck();
	public abstract boolean setStartingPlayer();
	
	public void addPlayer(Player player){
		players.put(player.getUsername(), player);
	}
	
	public boolean startGame(){
		return minimumPlayers<=players.size(); 
	}
	public Hashtable<String ,Player> getPlayers() {
		return players;
	}
	public void endTurn(){
		round++;
	}
	
	public abstract void endGame();
	
	public ArrayList<Card> createDeck() {
		ArrayList<Card>deck=new ArrayList<Card>();
			for (int j=0;j<14;j++){
				deck.add(new Card(j,"H"));
			}
			for (int j=0;j<14;j++){
				deck.add(new Card(j,"C"));
			}
			for (int j=0;j<14;j++){
				deck.add(new Card(j,"S"));
			}
			for (int j=0;j<14;j++){
				deck.add(new Card(j,"D"));
			}
		return deck;
	}
	
}
