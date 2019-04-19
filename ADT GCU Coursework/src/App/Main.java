/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import controllers.StudentController;

/**
 *
 * @author Abel Kinkela
 */
public class Main {
    
    public static void run() {        
        System.out.println("Welcome to the Student Management System!");
        
        StudentController studentController = new StudentController();  
        
        studentController.run();
        
        System.out.println("Your data was saved.\nThank you for using Student List Management App. Good bye.\n");        
    }
    
    /**
     * Entry point of the program.
     * Runs the entire program
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main studentListManagementApp = new Main();
        studentListManagementApp.run();
    }
}
