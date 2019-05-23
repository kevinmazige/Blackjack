package com.kevinmazige.game;

import java.util.ArrayList;
import java.util.Random;

import com.kevinmazige.game.Card.Rank;
import com.kevinmazige.game.Card.Suit;

public class Decks {

	//member variable to store 1 or multiple card decks
	private ArrayList<Card> decks = new ArrayList<Card>();

	//constructor for a specified number of card decks
	public Decks(int totalNumOfDecks) {

		//user cannot create a number of decks less than 1
		if (totalNumOfDecks >= 1) {
			//fill the deck with cards
			int numOfDecksCreated = 0;
			while(numOfDecksCreated != totalNumOfDecks) {
				for(Suit s : Suit.values()) {
					for(Rank r : Rank.values()) {
						decks.add(new Card(s,r));
					}
				}
				numOfDecksCreated += 1;
			}
		} else {
			System.out.println("You must create at least 1 deck");
		}

	}

	//method to shuffle a deck of cards
	public void shuffle() {}


	/*
	 * draw a card from the deck. This function also makes it appear as though the
	 * deck were shuffled and randomized.
	 */

	public Card draw() {
		Random rand = new Random();
		int n = rand.nextInt(decks.size());

		Card card = decks.get(n);
		//remove drawn card from deck
		decks.remove(n);

		return card;
	}

	//getter
	public ArrayList<Card> getDecks() {
		return decks;
	}

}






