/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.ClassesAndObjects;

/**
 *
 * @author Marcelo
 */
public class Date {
    private int month;
    private int day;
    private int year;
    
    //days in each month
    private static final int [] daysPerMonth={ 0, 31, 28, 31, 30,31,30,31,31,30,31,30,31};

    //constructor: call checkMonth to confirm proper value for month;
    //call checkDay to confirm proper value for the day
    public Date(int theMonth, int theDay, int theYear) {
        month = checkMonth(theMonth);
        day = checkDay(theDay);
        year = theYear;
        
        System.out.printf("Date object constructor for date %s\n", this);
    }//end of constructor
    
    //utility method to confirm proper month value
    private int checkMonth(int testMonth){
        if(testMonth > 0 && testMonth <=12){ //validate month
            return testMonth;
        }//end of if
        else
            throw new IllegalArgumentException("Month must be 1-12");
    }//end of checkMonth
    
    private int checkDay(int testDay){
        if(testDay > 0 && testDay <= daysPerMonth[month]){
            return testDay;
        }
        if(month == 2 && testDay == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
            return testDay;
        throw new IllegalArgumentException("Day out-of-range for the specified month and year");
    }//end of method checkDay
    
    @Override
    public String toString(){
        return String.format("%d/%d/%d", month, day, year);
    }//end of method toString()
     
}//end of class Date
