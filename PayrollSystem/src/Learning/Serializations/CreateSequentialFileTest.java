/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.Serializations;

import java.io.File;
import java.io.IOException;


/**
 *
 * @author Marcelo
 */
public class CreateSequentialFileTest {
    public static void main(String[] args) throws IOException {
        CreateSequentialFile application = new CreateSequentialFile();
        File myFile = new File("clients.ser");
        myFile.createNewFile();
        application.openFile(myFile);
        application.addRecords(); 
        application.closeFile();
    }

    
    
}
