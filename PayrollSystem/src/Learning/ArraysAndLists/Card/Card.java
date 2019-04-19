/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.ArraysAndLists.Card;

/**
 *
 * @author Marcelo
 */
public class Card {
    private String face; //face of card("Ace","Deuce",...)
    private String suit;//suit of card("Hearts", "Diamonds")

    public Card(String cardFace, String cardSuit) {
        face = cardFace;
        suit = cardSuit;
    }
    
    @Override
    public String toString(){
        return face + " of " + suit;
    }
    
    
}
