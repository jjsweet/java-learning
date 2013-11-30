package com.oracle.docs.tutorial;

@ClassPreamble (
	author="Justin J. Sweet", 
	currentRevision = 0, 
	date = "11/24/2013", 
	lastModified = "11/24/2013", 
	lastModifiedBy = "Justin J. Sweet", 
	reviewers = { "Justin", "Chance" }
)
public class Card {
	
	public enum Rank { 
	   DEUCE, THREE, FOUR, FIVE, SIX, SEVEN,
	   EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE 
	}
	
	public enum Suit { 
	   DIAMONDS, 
	   CLUBS, 
	   HEARTS, 
	   SPADES 
	}
	
    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}
