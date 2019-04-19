/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.ADT.GCU.Week2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcelo
 */
public class ADTList implements IADTList{
    private List myList;
    @Override
    public int length(){
        return myList.size();
    };
    @Override
    public void createList( ){
        setMyList((List) new ArrayList());
    };
    @Override
    public void printList(){
        getMyList().forEach((element) -> {
            System.out.println(element);
        });
    };

    public void insert( String s ){
        getMyList().add(s);
    };
    
    public void insertInt(int a){
        getMyList().add(a);
    }
    @Override
    public void remove( String s ){
        getMyList().remove(s);
    };
    @Override
    public boolean find( String s ){
        if(getMyList().contains(s)){
            return true;
        }
        return false;        
    };    

    /**
     * @return the myList
     */
    public List getMyList() {
        return myList;
    }

    /**
     * @param myList the myList to set
     */
    public void setMyList(List myList) {
        this.myList = myList;
    }
}
