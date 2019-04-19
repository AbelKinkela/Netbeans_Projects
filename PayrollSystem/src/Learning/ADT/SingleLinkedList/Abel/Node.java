/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.ADT.SingleLinkedList.Abel;

/**
 *
 * @author Marcelo
 */
public class Node <E>{
    private E data;
    Node<E> next;
    
    public Node(){
        //I am not sure about this constructor but it seems to work
        //this.data= (E) new Object();
    }
    public Node(E e) {
        this.data = e;
        this.next = null;
    }

    @Override
    public String toString() {
        return data + ", next=" + next;
    }
    
   
    
    
}
