/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.ArraysAndLists.Card;
import java.util.Random;

/**
 *
 * @author Marcelo
 */
public class DeckOfCards {
    private Card [] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    
    private static final Random randomNumbers = new Random();//Random number generator

    public DeckOfCards() {
        String[] faces = {"Ace", "Deuce","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
        "Jack","Queen","King"};
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        
        deck = new Card[NUMBER_OF_CARDS]; //create array of Card objects
        currentCard=0; //set current card so first card dealt is deck[0]
        
        //populate deck with card objects
        for(int count = 0; count < deck.length; count++){
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }//End of DeckOfCards constructor
    
    //shuffle the deck of Cards with one-pass algorithm
    //Note: A popular unbiased shuffling algorithm is the Fisher-Yates algorithm. not the one I used here
    public void shuffle(){
        
        //after shuffling, dealing should start at deck[0] again
        currentCard = 0; //reinicialize currentCard
        
        //for each card pick another random Card(0-51)
        for(int first=0; first<deck.length; first++){
            
            //swap current Card with randomly selected Card
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }//end for
    }//end method shuffle
    
    //deal one Card
    public Card dealCard(){
        //determine whether Cards remain to be dealt
        if(currentCard<deck.length)
            return deck[currentCard++]; //return current Card in array
        else 
            return null; //return null to indicate that all Cards were dealt
    }//end method dealCard
        
}//End of class DeckOfCards
    

