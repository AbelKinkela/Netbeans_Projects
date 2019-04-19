/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 * Subject Class
 * @version 1
 * @since 17/03/2019
 * @author Abel Kinkela
 * 
 */


public class Subject implements Serializable{ //objects of type subject can be saved
    private final String name;
    private int mark;
   
    /**
     * Subject(String name, int mark)
     * Constructor for creating objects of type Subject given a String name and int mark
     * @param name name of the subject
     * @param mark mark of the subject
     */
    public Subject(String name, int mark) {
        this.name=name;
        this.mark = mark;
    }
    
    /**
     * getName()
     * Method returns the name of the current subject
     * @return name
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * setMark(int mark)
     * Given an int mark, the method sets the mark for the current student
     * @param mark of the current subject
     */
    public void setMark(int mark){
        this.mark=mark;
    }
    
     /**
     * getMark()
     * Method returns the an int, value of the current mark
     * @return name
     */
    public int getMark(){
        return this.mark;
    }

    /**
     * toString()
     * @return String representation of the subject
     */
    @Override
    public String toString() {
        return String.format("          %-30s%d\n", getName()+":", getMark());
    }
    
    
}
