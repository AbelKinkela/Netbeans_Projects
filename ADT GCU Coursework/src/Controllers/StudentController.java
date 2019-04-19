
package controllers;

import helpers.InputHelper;
import java.time.LocalDate;
import list.StudentList;
import model.Student;


/**
 * 
 * @version 1
 * @since 17/03/2019
 * @author Abel Kinkela
 * 
 */
public class StudentController {
    private StudentList studentList;
    
    /**
     * Constructor starts by reading a student list object from a file.
     * This object may contain user information from the previous session.
     */
    public StudentController() {
//        this.studentList = new StudentList();
//        this.studentList.readStudentList();
//        System.out.println("Your list was loaded");
        this.studentList = new StudentList();
        this.studentList = (this.studentList.readStudentList() == null)? new StudentList(): this.studentList.readStudentList();
        System.out.println("Your list was loaded");
    }
   
    /**
     * Run method calls the displayStudentListMenu() method to show a user menu to the user and handles the user choice with appropriete calls to methods that provide the functionalities for a given choice.
     */
    public void run() {
        boolean finished = false;
        do {
            char choice = displayStudentListMenu();
            switch (choice) {
                case 'A': 
                    displayList();
                    break;
                case 'B': 
                    displayListWithFullDetails();
                    break;   
                case 'C': 
                    addStudentToList();
                    break;
                case 'M':
                    addStudentMarks();
                    break;
                case 'D': 
                    char deleteBy=displayDeleteMenu();
                    if((deleteBy == 'A')|| deleteBy =='a'){
                        deleteStudentFromList("ID");
                    }else if((deleteBy=='B') || deleteBy=='b'){
                        deleteStudentFromList("Name");
                    }else{
                       run();
                    }
                    break; 
                case 'E':
                    this.studentList.saveStudentList(studentList);                  
                    finished = true;
            }
        } while (!finished);
    }
    
    /**
     * Displays a menu list of options for navigating the application. 
     * @return character input, choice representing the menu choosen by the user
     */
    private char displayStudentListMenu() {
        InputHelper inputHelper = new InputHelper();
        System.out.printf("\n%s\t%s\t%s\t%s\t%s\t%s", 
                "A.Display List", 
                "B.Display List with Student Details", 
                "C.Add a new Student",
                "M.Add Student Marks",
                "D.Delete Student",
                "E.Exit\n");
        return inputHelper.readCharacter("Enter choice", "ABCMDE");
    }    
    
    /**
     * Displays a submenu list of options for delete a student from the list. 
     * @return character input, choice representing the submenu choosen by the user
     */
    private char displayDeleteMenu(){
        InputHelper inputHelper = new InputHelper();
            System.out.printf("\n%s\t%s\t%s", 
            "A.Delete by Student ID", 
            "B.Delete by Student Name", 
            "C.Cancel");
        return inputHelper.readCharacter("Enter choice", "ABC");
    }
    
    /**
     * Displays students within the double linked list without their details. 
     * Call the method displayListWithFullDetails() for full student details.
     */
    private void displayList(){
        if(this.studentList.getLength()==0){
            System.out.println("List is empty");
        }
        System.out.println(this.studentList.toString());
    }
    
     /**
     * Displays students within the double linked list full their full details. 
     * Call the method displayList() for to hide the details.
     */
    private void displayListWithFullDetails(){
        if(this.studentList.getLength()==0){
            System.out.println("List is empty");
        }
        this.studentList.display();
    }
    
    /**
     * Add a Student to the Student list by prompting the user to input the following information:
     * ID, name, number of subjects and date of enrolment.
     * 
     * Node: This makes it possible to create a student without further information such as marks for each subject. 
     * Call method addStudentMarks() to add marks for each subject the student has taken
     */
    private void addStudentToList() {
        InputHelper inputHelper = new InputHelper();
        String ID = inputHelper.readID("Enter Valid Student ID. eg.: S1803453", 8, 'S');
        String name = inputHelper.readString("Enter Student Name");
        int numberOfSubjects = inputHelper.readInt("Enter the (int) number of subjects");
        LocalDate dateOfEnrolment = inputHelper.readDate("Enter the date of enrolment in the format d/MM/yyyy", "d/MM/yyyy");
        
        Student studentToAdd = new Student(ID, name, numberOfSubjects, dateOfEnrolment);
        studentList.addLast(studentToAdd);
        System.out.println("Student "+ID+" added. Please not that student has no marks. Choose 'M' to add student marks");
    }
    
    /**
     * Condition: List of students is not empty.
     * Given that your list of students in not empty, this method allows for adding each subject the student has taken and their marks
     */
    private void addStudentMarks(){
        if(this.studentList.getLength()==0){
            System.out.println("List is empty");
        }
        else{
            InputHelper inputHelper = new InputHelper();
            String name = inputHelper.readString("Enter Student Name");
            this.studentList.addStudentMarks(name);
        }
        
    }
    
    /**
     * Condition: Student list is not empty and Student is in the list.
     * This method can delete a student object from the list given its ID or Name
     * @param type an ID or Name indicating how the user wants to delete the student
     */
    private void deleteStudentFromList(String type ) {
        InputHelper inputHelper = new InputHelper();
        if(type.equals("ID")){
            String ID = inputHelper.readID("Enter Valid Student ID. eg.: S1803453", 8, 'S');
            this.studentList.deleteStudent(ID, type);        
        }else{
            String name = inputHelper.readString("Enter Student Name");
            this.studentList.deleteStudent(name, type);
        }
        
        

    }   
}
