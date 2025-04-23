package com.pluralsight;

public class Book {
    private int id ;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }


    public String getCheckedOutTo() {
        return checkedOutTo;
    }



    //create methods, how the book should reflect these actions, can change data through one og these 2 methods.
    public void checkOut(String name){
        this.isCheckedOut = true;
        this.checkedOutTo = name;
    }

    public void checkIn(){
        this.checkedOutTo = "";
        this.isCheckedOut = false;
    }
}
