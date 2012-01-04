package client.api;

public class CardPlayer {

		private Card card;
		private String userName;
		public CardPlayer(String userName,Card card) {
			this.userName=userName;
			this.card=card;
		}
		public Card getCard() {
			return card;
		}
		public String getUserName() {
			return userName;
		}
	
}
