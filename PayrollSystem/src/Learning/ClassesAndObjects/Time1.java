/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.ClassesAndObjects;

// Time1 class declaration maintains the time in 24-hour format.
/**
 *
 * @author Marcelo
 */
public class Time1 {
    private int hour; //0-23
    private int minute;//00-59
    private int second;//00-59
    
    public void setTime(int h, int m, int s){
        if((h >= 0 && h < 24)&&(m >= 0 && m < 60) && (s >=0 && s < 60)){
            hour = h;
            minute = m;
            second = s;
        }// end if
        else{
            throw new IllegalArgumentException("Hour, minute and/or second argument was out of range");
        }
    }//end setTime
    
    //convert to String in Universal format (HH:MM:SS)
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }//end of method toUniversalString
    
    
    //convert to String in Standard-time format (H:MM:SS AM or PM)
    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d %s", 
                ((hour == 0 || hour ==12) ? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM")
                );
    }//end of method toString
}//end of class Time1
