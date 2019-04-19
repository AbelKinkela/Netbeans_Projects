/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.ArraysAndLists.ArrayList;
import java.util.ArrayList;

/**
 *
 * @author Marcelo
 */
public class ArrayListCollection {
    public static void main(String[] args) {
        //create a new arrayList of Strings with initial capacity of 10
        ArrayList<String>items = new ArrayList<String>();
        
        items.add("red"); //append new item to the list
        items.add(0, "yellow"); //insert the value at index 0
        
        
        System.out.print("Display list contents with counter-controlled loop:");
        
        for(int i = 0; i<items.size(); i++){
            System.out.printf(" %s", items.get(i));
        }
        
        //display colors using foreach in the display method
        display(items, "\nDisplay list contents with enhanced for statement:");
        
        items.add("green");
        items.add("yellow");
        display(items, "\nList with two new elements:");
        
        items.remove("yellow"); //remove the first yellow
        display(items, "\nRemoved first instance of yellow:");
        
        items.remove(1);
        display(items, "\nRemoved second list element (green)");

        System.out.printf("\n\"red\" is %sin the list\n", items.contains("red") ? "": "not ");
        
        //display the number of elements in the list
        System.out.printf("Size: %d\n", items.size());
                
    }//end of main
    
    public static void display(ArrayList<String> items, String header){
        System.out.println(header); //display header
        items.forEach((item) -> {
            System.out.printf(" %s", item);
        });
    }
}//end of ArrayListCollection
