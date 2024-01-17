/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

public class Lab3 {
    public static void main(String[] args) {
       
        Book myBook = new Book("MyBook", 50);
        
        
        myBook.openFirstPage();
        myBook.displayCurrentPage();
        myBook.openLastPage();
        myBook.displayCurrentPage();
        myBook.openTo(20);
        myBook.displayCurrentPage();
        myBook.openBookmarkPage();
        myBook.displayCurrentPage();
        myBook.openNextPage();
        myBook.displayCurrentPage();
        myBook.openPreviousPage();
        myBook.displayCurrentPage();
        myBook.insertBookmark(15);
        myBook.displayTotalPages();
        myBook.displayCurrentPage();
        myBook.displayBookmarkPage();
         
    }
}