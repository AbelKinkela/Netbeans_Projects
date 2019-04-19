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
public interface IAbel<E> {
    //addFirst() 
    public void addFirst(E e);
    //addAt()
    public void addAt(E e, E position);
    //addLast()
    public void addLast(E e);
    //size()
    public int size();
    //removeFirst()
    public void removeFirst();
    //removeLast()
    public void removeLast();
    //removeAt()
    public void removeAt(E position);
    //getHead()
    public E getHead();
    //getAt()   
    public E getAt(E position);
       
}
