package com.oracle.docs.tutorial;

public class CardDeck {
    private static Card[] cards = new Card[52];
    public CardDeck() {
        int i = 0;
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards[i++] = new Card(rank, suit);
            }
        }
    }
    
    private void printCards() {
    	int i = 1;
    	for (Card card : cards) {
    		System.out.println((i++) + ". " + card.toString());
    	}
    }
    
    public static void main(String[] args) {
    	CardDeck cd = new CardDeck();
    	cd.printCards();
    }
}
