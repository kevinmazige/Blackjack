package com.kevinmazige.game;

import java.util.ArrayList;

public class Player {

	//cards belonging to a player
	private ArrayList<Card> hand = new ArrayList<Card>();
	private String name = null;

	public Player(String name) {
		this.name = name;
	}

	//accept a card from the deck
	public void addCardToHand(Card card) {
		hand.add(card);
	}

	//clear the player's hand. get rid of all cards in hand
	public void clearHand() {
		hand.clear();
	}

	//get list of cards in the player's hand
	public ArrayList<Card> getHand(){
		return hand;
	}

	//print hand and hand value
	public void printHand() {
		System.out.println("\n\n" + name + "'s hand");
		for(Card card : hand) {
			card.print();
		}
		System.out.printf(name + "'s value: %d",getValue());
	}	

	//calculate the value of a hand
	public int getValue() {
		int value = 0;
		int aceCounter = 0;
		
		for(Card card : hand) {
			//check each card and add its value if its not
			//an ace
			if(rankToInt(card) != -1) {
				value += rankToInt(card);
			}else {
				//count the number of aces
				aceCounter += 1;
			}
		}
		
		//if you had no aces then you already know the
		//value
		if(aceCounter == 0) {
			return value;
		}else {
			//return the highest value for all the cards
			//(including aces) as long as you don't go
			//above 21. otherwise the ace is worth 1
			for(int i = 0; i < aceCounter; i++) {
				if(value + 11 > 21) {
					value += 1;
				}else {
					value += 11;
				}
			}
			return value;
		}
	}

	private int rankToInt(Card card) {
		
		switch (card.getRank()) 
		{
		case TWO:
			return 2;
		case THREE:
			return 3;
		case FOUR:
			return 4;
		case FIVE:
			return 5;		
		case SIX:
			return 6;		
		case SEVEN:
			return 7;		
		case EIGHT:
			return 8;	
		case NINE:
			return 9;		
		case TEN:
			return 10;		
		case JACK:
			return 10;
		case QUEEN:
			return 10;
		case KING:
			return 10;
		default:
			return -1;
		}
		
	}
}
