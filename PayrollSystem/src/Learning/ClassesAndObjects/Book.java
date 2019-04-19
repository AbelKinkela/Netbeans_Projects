/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.ClassesAndObjects;

/**
 *
 * @author Marcelo
 */
public enum Book {
    //declare constants of enum type
    JHTP("Java How to Program", "2012"),
    CHTP("C How to Program", "2007"),
    IW3HTP("Internet & World Wide Web How to Program", "2008"),
    CPPHTP("C++ How to Program", "2012"),
    VBHTP("Visual Basic How to Prgram", "2011"),
    CSHARPHTP("Visual C# 2010 How to Program", "2011");
    
    private final String title;
    private final String copyrightYear;

    private Book(String bookTitle, String year) {
        title = bookTitle;
        copyrightYear = year;
    }//end Book constructor

    public String getTitle() {
        return title;
    }//end method getTitle

    public String getCopyrightYear() {
        return copyrightYear;
    }//end method getCopyrightYear    
    
}//end enum Book
