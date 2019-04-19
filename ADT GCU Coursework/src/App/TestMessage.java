/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import daos.IDisplayable;
import model.Message;

/**
 *
 * @author Abel Kinkela
 */
public class TestMessage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creating a Message object that is displayable
        IDisplayable myDisplayableMessage = 
                new Message("Greetings", "\nHi Abel!\nI hope this message finds you well. \n"+
                        "I am writing to test if my program works. Please ignore this.\n"+
                        "Thank you\nKind regards,\nAbel Kinkela\n");
        myDisplayableMessage.display();
    }
    
}
