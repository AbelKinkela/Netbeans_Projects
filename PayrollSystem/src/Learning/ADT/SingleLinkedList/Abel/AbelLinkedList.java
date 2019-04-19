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
public class AbelLinkedList<E> implements IAbel<E>{
    Node<E> head;
    int length=0;    

    public AbelLinkedList() {
        this.head = new Node<>();
        length=0;
    }
    
    
    
    @Override
    public void addFirst(E e){
        /*get the object
        put it in a temporary variable
        make it point to the current head
        make it the head
        
        */
        Node<E> temp = new Node<>(e);
        temp.next = head;
        head = temp;
        length++;
               
    }
    @Override
    public void addAt(E e, E position){
        //create a node pointer that will go up to the position we want
        //and create a store for preserving the pointer of the node at the position
        //make the the node at that position point to the new node and make the new node point to the position stored
        Node<E>newNode = new Node<>(e);
        Node<E>temp = new Node<>();
        temp.next=head;
        while(temp.next != position){
            temp = temp.next;
        }
        
        Node<E>storeNext;
        storeNext = temp.next;
        temp.next =newNode;
        newNode.next =storeNext;
        length++;
    }
    //addLast()
    public void addLast(E e){
        Node<E>newNode = new Node<>(e);
        Node<E>temp = new Node<>();
        temp.next = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next= null;
        length++;
    }
    //size()
    public int size(){
        return length;
    }
    //removeFirst()
    public void removeFirst(){
        //
        Node<E> p = new Node<>();
        Node<E> q = new Node<>();
        
        q = head;
        p = head.next;
        head = p;
        
    }
    //removeLast()
    @Override
    public void removeLast(){
        Node<E> p = new Node<>();
        Node<E> q = new Node<>();
        q = head;
        p = head.next;
        while(p.next != null){
            q = q.next;
            p = p.next;
        }
        q.next = null;
    }
    //removeAt()
    public void removeAt(E position){
        Node<E> p = new Node<>();
        Node<E> q = new Node<>();
        q = head;
        p = head.next;
        while(p.next != position){
            q = q.next;
            p = p.next;
        }
        
        q.next = p.next;
        
    }
    //getHead()
    public E getHead(){
        return (E) head;
    }
    //getAt()    
    public E getAt(E position){
        //still to complete
        Node<E> p = new Node<>();
        p.next = head;
        
        while(p.next != position){
            p = p.next;
        }
        return (E) p;
    }

    @Override
    public String toString() {
        return "head=" + head + ", length=" + length;
    }



    
    
    
}
