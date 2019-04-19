package com.alueducation.cs.asciimation;

import java.util.Scanner;
import java.io.File;

public class CopyPaste {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter file or directory name: ");
        analyzePath(input.nextLine());

    } // end main
    
    public static void analyzePath(String path){
        File file = new File(path);
    if(file.exists()){
        System.out.printf("%s%s\n",
                file.getName()," Exists");
        
    }
    }
}