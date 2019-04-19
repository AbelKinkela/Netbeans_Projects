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
public class GradeBook {
    private String courseName;
    private int [] grades;

    public GradeBook(String courseName, int[] gradesArray) {
        this.courseName = courseName;
        this.grades = gradesArray;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    // display a welcome message to the GradeBook user
    public void displayMessage(){
        // getCourseName gets the name of the course
        System.out.printf("Welcome to the grade book for \n%s!\n\n", getCourseName());
    }
    public void processGrade(){
        outputGrades();
        
        //call method getAverage to calculate the average grade
        System.out.printf("\nClass average grade is %.2f\n", getAverage());
        // call methods getMinimum and getMaximum
        System.out.printf("Lowest grade is %d\nHighest grade is %d\n\n", getMinimum(), getMaximum());
        // call outputBarChart to print grade distribution chart
        outputBarChart();
    }
    
    public int getMinimum(){
        int lowGrade= grades[0]; //Assume that grades[0] is the lowest grade
        
        for(int grade : grades){
            if(grade < lowGrade){
                lowGrade=grade;
            }
        }
        return lowGrade;
    }
    
    public int getMaximum(){
        int highGrade= grades[0]; //Assume that grades[0] is largest

        for(int grade : grades){
            // if grade greater than highGrade, assign it to highGrade
            if(grade > highGrade){
                highGrade=grade;
            }
        }
        return highGrade;
    }
    // determine average grade for test
    public double getAverage(){
        int sum = 0;
        for(int value : grades){
            sum += value;
        }
        return (double) sum / grades.length;
    }
    // output bar chart displaying grade distribution
    public void outputBarChart(){
        System.out.printf("%s", "Grades distribution:");
        int frequency[] = new int[11];
        // for each grade, increment the appropriate frequency
        for(int i=0; i<grades.length; i++){
            ++frequency[grades[i]/10];
        }
        // print bar of asterisks where frequency is > 0
        for(int i=0; i<frequency.length; i++){
            
            // output bar label ( "00-09: ", ..., "90-99: ", "100: " )
            if(i == 10) System.out.printf("%07d:", 100);
            else
                System.out.printf("%02d - %02d:", i*10, i*10+9);
            
            // print bar of asterisks
            for(int stars = 0; stars < frequency[i]; stars++){
                System.out.print("*");
            }
            System.out.println();
            
        }            
        
    }
    // output the contents of the grades array
    public void outputGrades(){
            System.out.println("The grades are: \n");
            
            for( int student = 0; student < grades.length; student++ ) 
                System.out.printf("Student %2d: %3d\n", student+1, grades[student]);   
            
    }
}
