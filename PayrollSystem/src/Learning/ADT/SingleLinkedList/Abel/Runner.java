/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.ADT.SingleLinkedList.Abel;

import Learning.ADT.SingleLinkedList.Abel.AbelLinkedList;

/**
 *
 * @author Marcelo
 */
public class Runner {
    public static void main(String[] args) {
        AbelLinkedList myList = new AbelLinkedList();
        Student john = new Student("John");
        Student peter = new Student("Peter");
        Student abel = new Student("Abel");
        Student andrew = new Student("Andrew");
        
        myList.addFirst(john);
        myList.addFirst(peter);
        myList.addLast(abel);
        myList.addAt(andrew, peter); // raising a null pointer exception
        
        
        System.out.println(myList);
    }
}
