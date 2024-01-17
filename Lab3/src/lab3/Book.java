/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

public class Book { 
  private String title;
  private int totalPages;
  private int currentPage;
  private Integer bookmarkPage;

  public Book(String title, int totalPages) {
    this.title = title;
    this.totalPages = totalPages;
    this.currentPage = 1; 
    this.bookmarkPage = null;
  }

  public void openFirstPage() {   //เปิดหน้าเเรก
    this.currentPage = 1;
  }

  public void openLastPage() {    //เปิดหน้าสุดท้าย
    this.currentPage = this.totalPages;
  }
  public void openTo(int pageNumber) { //เปิดไปหน้าที่ต้องการ
    if (pageNumber >= 1 && pageNumber <= this.totalPages) {
      this.currentPage = pageNumber;
    } else {
      System.out.println("Invalid page number");
    }
  }

  public void openNextPage() { //เปิดหน้าถัดไป
    if (this.currentPage < this.totalPages) {
      this.currentPage++;
    }
  }

  public void openPreviousPage() { //เปิดหน้าก่อนหน้านี้
    if (this.currentPage > 1) {
      this.currentPage--;
    }
  }
  public void insertBookmark(int pageNumber) { //ใส่ที่คั่นหนังสือ
    if (pageNumber >= 1 && pageNumber <= this.totalPages) {
      this.bookmarkPage = pageNumber;
    } else {
      System.out.println("Invalid page number for bookmark");
    }
  }

  public void displayTotalPages() { //เเสดงหน้าที่มีทั้งหมดในหนังสือ
    System.out.println("Total pages: " + this.totalPages);
  }

  public void displayCurrentPage() { //เเสดงหน้าปัจจุบัน
    System.out.println("Current page: " + this.currentPage);
  }
   public void openBookmarkPage() { //ไปหน้าที่มีที่คั่นหนังสือ
        if (this.bookmarkPage != null) {
            this.currentPage = this.bookmarkPage;
        } else {
            System.out.println("No bookmark. Cannot open to bookmark page.");
        }
    }

  public void displayBookmarkPage() { //เเสดงหน้าที่มีที่คั่นหนังสือ
    if (this.bookmarkPage != null) {
      System.out.println("Bookmark page: " + this.bookmarkPage);
    } else {
      System.out.println("No bookmark.");
    }
  }
}




