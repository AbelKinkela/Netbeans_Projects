/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import daos.IDisplayable;
import helpers.InputHelper;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


/**
 * 
 * @version 1
 * @since 17/03/2019
 * @author Abel Kinkela
 * 
 */
public class Student implements IDisplayable, Serializable{
   
    private final String ID; //A student's constant ID
    private String name; 
    private int numberOfSubjects;
    private ArrayList<Subject> marksForEachSubject= new ArrayList<Subject>();
    private LocalDate dateOfEnrolment;
    private Category category;
    
    public enum Category{
        PART_TIME, FULL_TIME;
    }
    
    public Student(String ID, String name, int numberOfSubjects, LocalDate dateOfEnrolment){
        this.ID = ID;
        this.name = name;
        this.numberOfSubjects = numberOfSubjects;
        this.dateOfEnrolment=dateOfEnrolment;

    }

    public String getStudentID() {
        return this.ID;
    }



    public String getName() {
        return name;
    }
 

    public int getNumberOfSubjects() {
        return numberOfSubjects;
    }

    public void setNumberOfSubjects(int numberOfSubjects) {
        this.numberOfSubjects = numberOfSubjects;
    }

    public void setMarks() {
        InputHelper inputHelper = new InputHelper();
        int counter = 1;
        if(this.marksForEachSubject.size() >= getNumberOfSubjects()){ //check if mark has been asigned already
                System.out.println("Student already has marks");
        }else{
            for(int i=0; i<getNumberOfSubjects(); i++){
                String subjectName = inputHelper.readString("Enter subject "+ counter+" name");
                int subjectMark = inputHelper.readInt("Enter subject mark");
                Subject subject = new Subject(subjectName, subjectMark);
                this.marksForEachSubject.add(subject);
                counter++;
            }
            System.out.print("Information added\n");
        }
        
    }
    
    public int getMarkForASubject(String subjectName) {
        return marksForEachSubject.indexOf(subjectName);
    }
    
    public String getMarksForEachSubject() {  
        String marksForEachSubject="";
        for( Subject subject : this.marksForEachSubject ) {
            marksForEachSubject +=subject;
        }
        return marksForEachSubject;
    }

    public String getDateOfEnrolment() {
     return dateOfEnrolment.format(DateTimeFormatter.ofPattern("d/MM/yyyy"));
    }
//
//    public void setDateOfEnrolment(String dateOfEnrolment) {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
//        this.dateOfEnrolment =LocalDate.parse(dateOfEnrolment, formatter);
//    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return this.name; //Just return the name whenever a student object is referred, display() must be called for full details
    }
    
    
    @Override
    public void display() {
        System.out.printf("%s\n" + 
                "%-30s %s\n"+
                "%-30s %s\n"+
                "%-30s %d\n"+
                "%-30s %s\n"+
                "%-30s %s\n\n",
                
                getName()+" Details: ",
                "     ID:",getStudentID(),
                "     Name:",getName(), 
                "     Number of Subjects:",getNumberOfSubjects(),
                "     Marks for each Subject:\n",getMarksForEachSubject(),
                "     Date of Enrolment:", getDateOfEnrolment()); 
    }

}
