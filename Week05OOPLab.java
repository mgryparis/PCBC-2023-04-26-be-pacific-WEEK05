//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Object Oriented Programming
// Java Week 05 Lab  
//
package week05;

import java.util.Scanner;


public class Week05OOPLab {

	// This Lab will give you a basic look at creating an Object Oriented Card Game.  
	//		The idea here is to prepare you for your Week 6 Unit Final Project.
	//		There are many ways to implement this Lab, please use the tools that you know,
	//		and go from there.
	// These exercises are intended to be coded in order 1 through 5.
		
	
	public static void main(String[] args) {
	
		
		// A standard deck of playing cards has 52 cards as specified below 
		//		i. There are 4 suits:  Clubs, Diamonds, Hearts, & Spades
		//				
		//	   ii. Each suit has 13 cards:  Two, Three, Four, Five, Six, Seven, 
		//									 Eight, Nine, Ten, Jack, Queen, King & Ace
		//
		//	  iii. Comparing Cards:  When comparing two cards, Ace is high and Two is low.
		//							 to make this easy, a Two will have a value of 2, a
		//							 Three will have a value of 3, ... and an Ace will have
		//							 a value of 14.
		//
	
		
		// 1. Card Class:
		//		Create a class called Card to represent a standard playing card. 
		//		Fields:   The Card class should have the following fields:
		// 			a. name field
		//			b. suit field
		//			c. value field for comparing against other cards.
		//
		//		Methods:  This class can have any useful method.
		//			a. describe() to display the card information to the Console.
		//			b. Getters & Setters 
		//
		System.out.println("\nQuestion 1: Card Class");

		// Add your code here to instantiate a Card
		Card card32 = new Card(32);
		Card card17 = new Card(17);
		Card card50 = new Card(50);
		// Card card72 = new Card(72);
		Card card46 = new Card(46);
		// Card card0 = new Card(0);
		// Card cardn5 = new Card(-5);
		
		// Call the describe method on the newly instantiated card.
		// in describev, v = verbose
		card32.describev();
		card17.describev();
		card50.describev();
		// card72.describe();
		card46.describev();
		// card0.describe();
		// cardn5.describe();
		

		// 2. Deck Class:
		//		Create a class called Deck.
		//		Fields:  This class should have a list of Card field called cards 
		//				 that will hold all the cards in the deck. 
		//			List<Card> cards = new ArrayList<Card>(); 
		//
		//		Constructor: The constructor for the Deck Class should
		// 			instantiate all 52 standard playing cards and add them to the cards list.
		//
		//		Methods:  
		//			a.  describe() to describe the deck to the Console -- 
		//					print out all of the cards in the deck.
		//
		System.out.println("\nQuestion 2: Deck Class");

		// Add your code here to instantiate a Deck	
	    Deck deck1 = new Deck("deck1");
	    
	    // Call the describe method on the newly instantiated deck.
	    deck1.describe();
		
		// 3. Deck shuffle() Method:
		//		Add a shuffle method within the Deck Class
		System.out.println("\nQuestion 3: Deck shuffle() method");
		// Test your method here
		// Call the describe method on the newly shuffled deck.
		
		deck1.shuffle2();
		deck1.describe();
		deck1.checkDeck2(); //  added integrity checker to make sure my shuffle didn't mess up the deck
		
		deck1.shuffle2();
		deck1.describe();
		deck1.checkDeck2();
		
		deck1.shuffle2();
		deck1.describe();
		deck1.checkDeck2();
				
		
		// 4. Deck draw() Method:
		//		Add a draw method within the Deck Class
		System.out.println("\nQuestion 4: Deck draw() method");
		// Test your method here

	    Deck deck2 = new Deck("deck2");
	    System.out.print("Drawn Card: ");
	    deck2.drawACard().describe();
	    System.out.print("\n");
		
		// 5. Create Game Board:
		//		Create and test a method that takes an int as a parameter (representing the
		// 			number of players for a game) and returns a Map<String, List<Card>>
		// 			that represents each player (i.e. "Player 1", "Player 2", etc..) 
		//			and their cards.
		//
		// 			The method should create a new instance of Deck, shuffle it,
		// 			and deal the cards out to the "players" in the Map.
		System.out.println("\nQuestion 5: Create Game");

		// Call your method here
		Scanner kbd = new Scanner(System.in);
		
		//  Get user input to configure the game
		System.out.println("\n__  Welcome to AutoDealer  ____________________");
		System.out.println("This utility will deal cards out to players for a card game per your specifications.");
		int players = 0; int cardsPerHand = 0; int totalCardsDealt = 0;
		while (totalCardsDealt<1 || totalCardsDealt>52)	{
			while (players<2 || players>6)	{
				System.out.print(">>  Enter the number of players (2-6):  ");
				players = kbd.nextInt();
			}
			while (cardsPerHand<5 || cardsPerHand>12)	{
				System.out.print(">>  Enter the number of cards/hand (5-12):  ");
				cardsPerHand = kbd.nextInt();
			}
			totalCardsDealt = players*cardsPerHand;
			if	(totalCardsDealt>52)	{
				System.out.println("Sorry - AutoDealer cannot deal out more than 52 cards at a time.  Try again...");
				players=0;
				cardsPerHand=0;
				totalCardsDealt=0;
			}
		}
		System.out.println("Game Config:  players = "+ players+"   cardsPerHand = "+cardsPerHand+"   totalCardsDealt = "+totalCardsDealt);
		kbd.close();
	
		//  Instantiate a new Deck and deal out the hands
		Deck deck3 = new Deck("deck3");
		deck3.shuffle2();
		deck3.shuffle2();
		deck3.shuffle2();
		deck3.autoDealer(players,cardsPerHand);


		
		
		
		
		
		
		
	} 
	
	// Method 5:
	
	
	
	

}