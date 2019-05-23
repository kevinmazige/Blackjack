package com.kevinmazige.game;

import java.util.Scanner;

public class GamePlay {

	//game play member variables
	private static Scanner s = new Scanner(System.in);
	private static Decks deck = null;
	private static Player player = null;
	private static Player dealer = null;
	private static String playerName = null;
	private static int deckCount = 0;

	public static void main(String[] args) {


		//Get player input
		System.out.printf("Welcome to Blackjack! %n%nHow many decks would "
				+ "you like to play with?: ");
		deckCount = s.nextInt();

		System.out.printf("\nPlease enter your name: ");
		playerName = s.next();

		//create the deck and the 2 players i.e. you and the dealer
		deck = new Decks(deckCount);

		player = new Player(playerName);
		dealer = new Player("Dealer");

		//deal cards to you and the dealer
		for(int i = 0; i < 2; i++) {
			player.addCardToHand(deck.draw());
		}

		dealer.addCardToHand(deck.draw());

		dealer.printHand();
		player.printHand();

		System.out.print("\n\nWould you like to stand "
				+ "'s' or hit [press any key]: ");

		//allow a player to stand or hit as many times as they'd like to
		//(without busting)
		while(player.getValue() < 21 && !s.next().equalsIgnoreCase("s")) {

			player.addCardToHand(deck.draw());
			dealer.printHand();
			player.printHand();

			//only give option to hit if under 21
			if(player.getValue() < 21) {
				System.out.print("\n\nWould you like to stand "
						+ "'s' or hit [press any key]: ");
			}

			//if player has 21, automatically stand
			if(player.getValue() == 21) {
				break;
			}
		}


		/*
		 * Determine winner
		 */

		if(player.getValue() > 21) {
			//The player has busted; dealer wins
			System.out.println("\n\nYou lose!");
		}else {
			//dealer draws card. if value is 17 or greater they must stay. If
			//value is 16 or less they must draw another card.
			while(dealer.getValue() <= 16) {
				dealer.addCardToHand(deck.draw());
				dealer.printHand();
				player.printHand();
			}

			if(dealer.getValue() > 21) {
				//The dealer has busted; player wins
				System.out.println("\n\nYou win, congratulations!");
			}else if(player.getValue() == dealer.getValue()){
				//no one wins
				System.out.println("\n\nYou have drawn!");
			}else if(player.getValue() > dealer.getValue()) {
				//player wins with higher score
				System.out.println("\n\nYou win, congratulations!");
			}else {
				//dealer wins with higher score
				System.out.println("\n\nYou lose!");
			}
		}
	}
}






