/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.ArraysAndLists.GradesBook;

/**
 *
 * @author Marcelo
 */
public class GradeBookTest {
    public static void main(String[] args) {
        //Array of student grades
        int [] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87, 10};
        
        GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming!", gradesArray);
        myGradeBook.displayMessage();
        myGradeBook.processGrade();
    }//End main method
}//end Class GradeBookTest
