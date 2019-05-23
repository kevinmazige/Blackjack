package com.kevinmazige.game;

public class Card {

	enum Suit{
		HEARTS, DIAMONDS, CLUBS, SPADES;
	}
	enum Rank {
		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,
		JACK, QUEEN, KING;
	}

	//card fields
	private Suit suit;
	private Rank rank;

	//getters
	public Suit getSuit() {
		return suit;
	}
	public Rank getRank() {
		return rank;
	}


	// constructor
	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	/*-----Helper Print methods-----*/

	// helper method to print a 2 card to the command line
	private void print2(Suit suit){

		Character chr = 'C';

		switch (suit)
		{
		case CLUBS:
			break;
		case HEARTS:
			chr = 'H';
			break;
		case SPADES:
			chr = 'S';
			break;
		case DIAMONDS:
			chr = 'D';
			break;
		}

		System.out.printf(" ---------\n");
		System.out.printf("|2   %c    |\n", chr);
		System.out.printf("|         |\n");
		System.out.printf("|         |\n");
		System.out.printf("|         |\n");
		System.out.printf("|         |\n");
		System.out.printf("|         |\n");
		System.out.printf("|    %c   2|\n", chr);
		System.out.printf(" ---------\n");
	}

	// helper method to print a 3 card to the command line
	private void print3(Suit suit){

		Character chr = 'C';

		switch (suit)
		{
		case CLUBS:
			break;
		case HEARTS:
			chr = 'H';
			break;
		case SPADES:
			chr = 'S';
			break;
		case DIAMONDS:
			chr = 'D';
			break;
		}

		System.out.printf(" ---------\n");
		System.out.printf("|3        |\n");
		System.out.printf("|         |\n");
		System.out.printf("|    %c    |\n", chr);
		System.out.printf("|    %c    |\n", chr);
		System.out.printf("|    %c    |\n", chr);
		System.out.printf("|         |\n");
		System.out.printf("|        3|\n");
		System.out.printf(" ---------\n");
	}

	// helper method to print a 4 card to the command line
	private void print4(Suit suit){

		Character chr = 'C';

		switch (suit)
		{
		case CLUBS:
			break;
		case HEARTS:
			chr = 'H';
			break;
		case SPADES:
			chr = 'S';
			break;
		case DIAMONDS:
			chr = 'D';
			break;
		}

		System.out.printf(" ---------\n");
		System.out.printf("|4%c     %c |\n",chr,chr);
		System.out.printf("|         |\n");
		System.out.printf("|         |\n");
		System.out.printf("|         |\n");
		System.out.printf("|         |\n");
		System.out.printf("|         |\n");
		System.out.printf("| %c     %c4|\n",chr,chr);
		System.out.printf(" ---------\n");
	}

	// helper method to print an Ace card to the command line
	private void printAce(Suit suit){

		Character chr = 'C';

		switch (suit)
		{
		case CLUBS:
			break;
		case HEARTS:
			chr = 'H';
			break;
		case SPADES:
			chr = 'S';
			break;
		case DIAMONDS:
			chr = 'D';
			break;
		}

		System.out.printf(" ---------\n");
		System.out.printf("|A        |\n");
		System.out.printf("|         |\n");
		System.out.printf("|         |\n");
		System.out.printf("|    %c    |\n", chr);
		System.out.printf("|         |\n");
		System.out.printf("|         |\n");
		System.out.printf("|        A|\n");
		System.out.printf(" ---------\n");
	}

	// helper method to print a 5 card to the command line
	private void print5(Suit suit){

		Character chr = 'C';

		switch (suit)
		{
		case CLUBS:
			break;
		case HEARTS:
			chr = 'H';
			break;
		case SPADES:
			chr = 'S';
			break;
		case DIAMONDS:
			chr = 'D';
			break;
		}

		System.out.printf(" ---------\n");
		System.out.printf("|5%c     %c |\n",chr,chr);
		System.out.printf("|         |\n");
		System.out.printf("|         |\n");
		System.out.printf("|    %c    |\n", chr);
		System.out.printf("|         |\n");
		System.out.printf("|         |\n");
		System.out.printf("| %c     %c5|\n",chr,chr);
		System.out.printf(" ---------\n");
	}

	// helper method to print a 6 card to the command line
	private void print6(Suit suit){

		Character chr = 'C';

		switch (suit)
		{
		case CLUBS:
			break;
		case HEARTS:
			chr = 'H';
			break;
		case SPADES:
			chr = 'S';
			break;
		case DIAMONDS:
			chr = 'D';
			break;
		}

		System.out.printf(" ---------\n");
		System.out.printf("|6%c     %c |\n",chr,chr);
		System.out.printf("|         |\n");
		System.out.printf("|         |\n");
		System.out.printf("| %c     %c |\n", chr, chr);
		System.out.printf("|         |\n");
		System.out.printf("|         |\n");
		System.out.printf("| %c     %c6|\n",chr,chr);
		System.out.printf(" ---------\n");
	}

	// helper method to print a 7 card to the command line
	private void print7(Suit suit){

		Character chr = 'C';

		switch (suit)
		{
		case CLUBS:
			break;
		case HEARTS:
			chr = 'H';
			break;
		case SPADES:
			chr = 'S';
			break;
		case DIAMONDS:
			chr = 'D';
			break;
		}

		System.out.printf(" ---------\n");
		System.out.printf("|7%c     %c |\n",chr,chr);
		System.out.printf("|         |\n");
		System.out.printf("|         |\n");
		System.out.printf("| %c  %c  %c |\n", chr, chr, chr);
		System.out.printf("|         |\n");
		System.out.printf("|         |\n");
		System.out.printf("| %c     %c7|\n",chr,chr);
		System.out.printf(" ---------\n");
	}

	// helper method to print an 8 card to the command line
	private void print8(Suit suit){

		Character chr = 'C';

		switch (suit)
		{
		case CLUBS:
			break;
		case HEARTS:
			chr = 'H';
			break;
		case SPADES:
			chr = 'S';
			break;
		case DIAMONDS:
			chr = 'D';
			break;
		}

		System.out.printf(" ---------\n");
		System.out.printf("|8%c     %c |\n",chr,chr);
		System.out.printf("|    %c    |\n", chr);
		System.out.printf("|         |\n");
		System.out.printf("| %c     %c |\n", chr, chr, chr);
		System.out.printf("|         |\n");
		System.out.printf("|    %c    |\n",chr);
		System.out.printf("| %c     %c8|\n",chr,chr);
		System.out.printf(" ---------\n");
	}

	// helper method to print a 9 card to the command line
	private void print9(Suit suit){

		Character chr = 'C';

		switch (suit)
		{
		case CLUBS:
			break;
		case HEARTS:
			chr = 'H';
			break;
		case SPADES:
			chr = 'S';
			break;
		case DIAMONDS:
			chr = 'D';
			break;
		}

		System.out.printf(" ---------\n");
		System.out.printf("|9%c     %c |\n",chr,chr);
		System.out.printf("|         |\n");
		System.out.printf("| %c     %c |\n", chr, chr);
		System.out.printf("|    %c    |\n", chr);
		System.out.printf("| %c     %c |\n", chr, chr);
		System.out.printf("|         |\n");
		System.out.printf("| %c     %c9|\n",chr,chr);
		System.out.printf(" ---------\n");
	}

	// helper method to print a 10 card to the command line
	private void print10(Suit suit){

		Character chr = 'C';

		switch (suit)
		{
		case CLUBS:
			break;
		case HEARTS:
			chr = 'H';
			break;
		case SPADES:
			chr = 'S';
			break;
		case DIAMONDS:
			chr = 'D';
			break;
		}

		System.out.printf(" ---------\n");
		System.out.printf("|10%c   %c  |\n",chr,chr);
		System.out.printf("|    %c    |\n",chr);
		System.out.printf("|  %c   %c  |\n", chr, chr);
		System.out.printf("|         |\n");
		System.out.printf("|  %c   %c  |\n", chr, chr);
		System.out.printf("|    %c    |\n", chr);
		System.out.printf("|  %c   %c10|\n",chr,chr);
		System.out.printf(" ---------\n");
	}

	// helper method to print a Jack card to the command line
	private void printJack(Suit suit){

		Character chr = 'C';

		switch (suit)
		{
		case CLUBS:
			break;
		case HEARTS:
			chr = 'H';
			break;
		case SPADES:
			chr = 'S';
			break;
		case DIAMONDS:
			chr = 'D';
			break;
		}

		System.out.printf(" ---------\n");
		System.out.printf("|J       %c|\n",chr);
		System.out.printf("|         |\n");
		System.out.printf("|         |\n");
		System.out.printf("|    J    |\n");
		System.out.printf("|         |\n");
		System.out.printf("|         |\n");
		System.out.printf("|%c       J|\n",chr);
		System.out.printf(" ---------\n");
	}

	// helper method to print a Queen card to the command line
	private void printQueen(Suit suit){

		Character chr = 'C';

		switch (suit)
		{
		case CLUBS:
			break;
		case HEARTS:
			chr = 'H';
			break;
		case SPADES:
			chr = 'S';
			break;
		case DIAMONDS:
			chr = 'D';
			break;
		}

		System.out.printf(" ---------\n");
		System.out.printf("|Q       %c|\n",chr);
		System.out.printf("|         |\n");
		System.out.printf("|         |\n");
		System.out.printf("|    Q    |\n");
		System.out.printf("|         |\n");
		System.out.printf("|         |\n");
		System.out.printf("|%c       Q|\n",chr);
		System.out.printf(" ---------\n");
	}

	// helper method to print a King card to the command line
	private void printKing(Suit suit){

		Character chr = 'C';

		switch (suit)
		{
		case CLUBS:
			break;
		case HEARTS:
			chr = 'H';
			break;
		case SPADES:
			chr = 'S';
			break;
		case DIAMONDS:
			chr = 'D';
			break;
		}

		System.out.printf(" ---------\n");
		System.out.printf("|K       %c|\n",chr);
		System.out.printf("|         |\n");
		System.out.printf("|         |\n");
		System.out.printf("|    K    |\n");
		System.out.printf("|         |\n");
		System.out.printf("|         |\n");
		System.out.printf("|%c       K|\n",chr);
		System.out.printf(" ---------\n");
	}


	/*
	 * public method to print a card to the command line
	 */
	public void print() {

		switch (rank)
		{
		case ACE:
			printAce(suit);
			break;
		case TWO:
			print2(suit);
			break;	
		case THREE:
			print3(suit);
			break;
		case FOUR:
			print4(suit);
			break;
		case FIVE:
			print5(suit);
			break;
		case SIX:
			print6(suit);
			break;
		case SEVEN:
			print7(suit);
			break;
		case EIGHT:
			print8(suit);
			break;
		case NINE:
			print9(suit);
			break;
		case TEN:
			print10(suit);
			break;
		case JACK:
			printJack(suit);
			break;
		case QUEEN:
			printQueen(suit);
			break;
		case KING:
			printKing(suit);
			break;
		}
	}
}
