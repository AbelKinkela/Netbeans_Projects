
package helpers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


/**
 * 
 * @version 1
 * @since 17/03/2019
 * @author Abel Kinkela
 * 
 */
public class InputHelper {
    private final Scanner reader;
    
    public InputHelper() {
        reader = new Scanner(System.in);
    }

    // Read Character
    public char readCharacter(String prompt) {
        
        System.out.println(prompt + ": ");
        char inputText = reader.nextLine().charAt(0);
        return inputText;
    }    
    
    // Read Character - set of valid values
    public char readCharacter(String prompt, String validCharacters) {
        char inputText;
        boolean inputError;        
        do {
            inputError = false;             
            System.out.println(prompt + ": ");
            inputText = reader.nextLine().toUpperCase().charAt(0);
            if (validCharacters.indexOf(inputText) == -1) {
                inputError = true;
                System.out.println("Character out of range: please re-enter: "); 
            }
        } while (inputError);        
        return inputText;
    }     
    
    // Read String
    public String readString(String prompt) {
        
        System.out.println(prompt + ": ");
        String inputText = reader.nextLine();
        return inputText;
    }
    
    // Read Int
    public int readInt(String prompt, int max, int min) {
        int inputNumber = 0;
        boolean inputError;
        do {
            inputError = false;                
            System.out.println(prompt + ": ");

            try {
                inputNumber = Integer.parseInt(reader.nextLine());
                if (inputNumber < min || inputNumber > max) {
                    inputError = true;
                    System.out.println("Number out of range: please re-enter\n");                        
                }
            } catch (NumberFormatException e) {
                inputError = true;
                System.out.println("Not a valid number: please re-enter: ");
            }
        } while (inputError);
        return inputNumber;
    } 
    
    // Read Int
    public int readInt(String prompt) {
        int inputNumber = 0;
        boolean inputError;
        do {
            inputError = false;                
            System.out.println(prompt + ": ");

            try {
                inputNumber = Integer.parseInt(reader.nextLine());
            } catch (NumberFormatException e) {
                inputError = true;
                System.out.println("Not a valid number: please re-enter: ");
            }
        } while (inputError);
        return inputNumber;
    }     
    
    /**
     * readDate(String prompt, String format)
     * @param prompt String prompt to instructions to show to the users for how to insert the date
     * @param format The format for which the date will be created
     * @return LocalDate object representing date
     */
    public LocalDate readDate(String prompt, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        String dateOfEnrolment = readString(prompt);
        return LocalDate.parse(dateOfEnrolment, formatter);
    }
     /**
     * readID(String prompt, int validSize, char inicialChart)
     *
     * @param prompt String prompt to instructions to show to the users for how to insert the int
     * @param validSize int valid size of the ID 
     * @param inicialChart char ID's initial character (for validating)
     * @return String ID, a well formatted ID
     */
    public String readID(String prompt, int validSize, char inicialChart){
        boolean validStudentID=false;
        String ID;
        do {
            ID =readString(prompt);

            if((ID.length()== validSize) && ( ID.charAt(0)==inicialChart )){
                validStudentID= true;
            }                              
        } while (!validStudentID);
        return ID;
    }
}

//Node: Some methods in this file are copied from the GCU programming 2 lab 6 solutions 