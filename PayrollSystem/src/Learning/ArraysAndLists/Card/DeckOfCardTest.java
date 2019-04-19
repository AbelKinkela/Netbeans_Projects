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
public class DeckOfCardTest {
    public static void main(String[] args) {
        DeckOfCards myDeckOfCard = new DeckOfCards();
        myDeckOfCard.shuffle(); //place cards in random order
        
        
        for(int i = 1; i<=52; i++){
            System.out.printf("%-19s", myDeckOfCard.dealCard());
            
            if(i % 4 ==0){
                System.out.println();
            }
        }
        
        
    }
}
