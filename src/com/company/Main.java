package com.company;



public class Main {

    public static void main(String[] args) {

        // Step 1 code goes here.  Declare an array to hold the deck of cards.
        // Name the array deck.  Make the array size 52

        String[] deck = new String[52];


        //Method to populate the deck of cards
        populateDeck(deck);

        //Method to print deck of cards
        printDeck(deck);

        //Method to shuffle deck of cards
        shuffleDeck(deck);

        //Method to print deck of cards
        printDeck(deck);
    }


    //Method to populate the deck of cards
    public static void populateDeck(String[] deck){

        // Array to hold suits
        String[] suits = {"Hearts","Spades","Clubs","Diamonds"};

        //Array to hold card values
        String[] values ={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        //Step 2 code goes here.  Use the arrays (suits and values) and a nested loop to
        // populate the deck array
        int deckIndex = 0;
        for (int suitIndex = 0; suitIndex < 4; suitIndex++);
        for (int valueIndex = 0; valueIndex < 13; valueIndex++);
    }



    //Method to populate the deck of cards
    public static void printDeck(String[] deck){

        //Step 3 code goes here.  Use a for loop to print the deck array

        for (int i = 0; i < deck.length; i++){
            System.out.println(deck[i]);
        }

    }

    //Method to populate the deck of cards
    public static void shuffleDeck(String[] deck){

        //Step 4 code goes here.  Use a for loop to swap each card in the deck
        //with a random card in the deck
        for (int i = 0; i < deck.length; i++){
            int random = int(Math.random()*52);
            swap(deck, i, random);
        }

    }

    //Method to swap the value of two spots in the deck array
    public static void swap(String[] deck, int i, int x){
        //step 5 code goes here.  Swap the values held by deck[i] and deck[x]

        String cards = deck[x];
        deck[x] = deck[i];
        deck[i] = cards;



    }
}
