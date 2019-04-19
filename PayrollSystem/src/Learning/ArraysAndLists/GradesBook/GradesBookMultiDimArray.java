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
public class GradesBookMultiDimArray {
    private String courseName;
    private final int [][] grades;

    public GradesBookMultiDimArray(String courseName, int[][] gradesArray) {
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
        // call methods getMinimum and getMaximum
        System.out.printf("\nLowest grade is %d\nHighest grade is %d\n\n", getMinimum(), getMaximum());
        // call outputBarChart to print grade distribution chart
        outputBarChart();
    }
    
    public int getMinimum(){
        int lowGrade= grades[0][0]; //Assume that grades[0][0] is the lowest grade
        
        for(int[] grade : grades){
            
            for(int column = 0; column<grade.length; column++){
                if(grade[column] < lowGrade){
                    lowGrade=grade[column];
                }
            }
        }
        return lowGrade;
    }
    
    public int getMaximum(){
        int highGrade= grades[0][0]; //Assume that grades[0] is largest

        for(int[] grade : grades){
            
            for(int column = 0; column<grade.length; column++){
                if(grade[column] > highGrade){
                    highGrade=grade[column];
                }
            }
        }
        return highGrade;
    }
    // determine average grade for test
    public double getAverage(int [] setOfGrades){
        int sum = 0;
        for(int grade : setOfGrades){
                sum += grade;
        }
        return (double) sum / setOfGrades.length;
    }
    // output bar chart displaying grade distribution
    public void outputBarChart(){
        System.out.printf("%s", "Grades distribution:");
        int frequency[] = new int[11];
        // for each grade, increment the appropriate frequency
        for( int[] grade : grades ) {
            for( int column = 0; column < grade.length; column++ ) {
                ++frequency[grade[column] / 10];
            }
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
            System.out.printf("%18s%6s%6s%11s\n", "Test1","Test2", "Test3","Average");
            
        for( int student=0; student<grades.length; student++ ) {
            
            System.out.printf("Student %2d: ", student+1);
            
            for( int test = 0; test < grades[student].length; test++ ) {
                System.out.printf("%5d ", grades[student][test]);
            }
            System.out.printf("%10.2f\n", getAverage(grades[student]));
        }
    }
}
