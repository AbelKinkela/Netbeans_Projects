/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.ADT.GCU.Week2;

/**
 *
 * @author Marcelo
 */
public class Test {
    public static void main(String[] args) {
        IADTList mList = new ADTList();
       
        System.out.println(mList);
        //creating a List
        mList.createList();
        //see object list content
        mList.printList();
        //add some elements to the object list
        mList.insert("Abel");
        mList.insert("Makanzu");
        mList.insert("Kinkela");
        mList.printList();
    }
}
