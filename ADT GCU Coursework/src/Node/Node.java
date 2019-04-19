/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Node;


import daos.IDisplayable;
import java.io.Serializable;
import model.Student;

/**
 * 
 * @version 1
 * @since 17/03/2019
 * @author Abel Kinkela
 * 
 */
public class Node implements IDisplayable, Serializable{
    private Student student;
    private Node next=null;
    private Node previous =null;

    public Node(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return getStudent().getName();
    }
    
    
    
    @Override
    public void display(){
        getStudent().display();
    }
    
    
}
