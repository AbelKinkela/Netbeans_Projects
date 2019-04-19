/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.Serializations;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.io.IOException;

/**
 *
 * @author Marcelo
 */
public class CreateSequentialFile {
    private ObjectOutputStream objectOutput;

    
    public void openFile(File file){
        try {//open file
            objectOutput = new ObjectOutputStream(new FileOutputStream(file));
        }//end try
        catch( IOException iOException ) {
            System.err.println("Error opening file");
        }//end catch
        
    }
    
    public void addRecords(){
        AccountRecordSerializable record;
        int accountNumber = 0;
        String firstName;
        String lastName;
        double balance;
        
        Scanner input = new Scanner(System.in);
        System.out.printf("%s\n%s\n%s\n%s\n\n",
                "To terminate input, type the end-of-file indicator ",
                "when you are prompted to enter input.",
                "On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
                "On Windows type <ctrl> z then press Enter");
        System.out.printf( "%s\n%s",
                "Enter account number (> 0), first name, last name and balance.",
                "? " );
        
        while( input.hasNext() ) {

            try {
                accountNumber = input.nextInt();
                firstName = input.next();
                lastName = input.next();
                balance = input.nextDouble();

                if(accountNumber > 0){
                    record = new   AccountRecordSerializable(accountNumber,firstName,lastName,balance);
                    objectOutput.writeObject(record);
                }//end if
                else{
                    System.out.println("Account number must be greater than 0.");
                }//end else
            }
            catch(NoSuchElementException noSuchElementException){
                System.err.println("Invalid input, please try again.");
                input.nextLine();//discard input so user can try again
            }
            catch( IOException iOException ) {
                    System.err.printf("%s", "Error writing to the file");
                    return;
            }//end catch
            
            System.out.printf( "%s\n%s",
                "Enter account number (> 0), first name, last name and balance.",
                "? " );            
        }//end while

    }//end method addRecords
    
    public void closeFile(){
        try {
            if(objectOutput != null){
                objectOutput.close();
            }//end try
            
        }
        catch( IOException iOException ) {
            System.out.println("Error closing file");
            System.exit(1);
        }//end catch
    }//end method closeFile
    
        
}//end class CreateSequentialFile
    

