/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import daos.IDisplayable;

/**
 * 
 * @version 1
 * @since 17/03/2019
 * @author Abel Kinkela
 * 
 */
public class Message implements IDisplayable{
    private String subject;
    private String body;
 
    /**
    *<p>This is the constructor for creating a message object</p>
    *@param subject This is the subject of the message
    *@param body This is the body of the message
    */
    public Message(String subject, String body){
        this.subject = subject;
        this.body = body;
    }

    /**
     * The getSubject
    *@return String The subject of the message
    */
    public String getSubject() {
        return subject;
    }
/**
 * The getMessage
 * @return String The body of the message
 */
    public String getBody() {
        return body;
    }
    /**
     * Displays the message content(subject + body)
     */
    public void display(){
        System.out.printf("Subject: %s\nBody:%s", getSubject(), getBody());
    }
}
