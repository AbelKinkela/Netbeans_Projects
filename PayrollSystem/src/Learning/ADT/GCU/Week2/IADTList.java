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
public interface IADTList {
    int length();
    void createList( );
    void printList( );
    void insert( String s );
    void remove( String s );
    boolean find( String s );
}

