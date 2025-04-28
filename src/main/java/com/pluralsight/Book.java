package com.pluralsight;

public class Book {//Book is a type, strictly  used to manage data for book. Keep track of data. This code defines/describes data for a single book each time a new instance is created.
    //instance variables = information it stores about itself.
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    //constructor
    public Book(int id, String isbn, String title) {//removed the last 2 values because we want each new book created to have a predefined value.
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        //default value set for below 2 variables
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }


    //getter and setters
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


    /////////////////////////////////////////////////////////////////////////////////////
    //removed setter dont want person to directly chagen value, want them to use methods I created.
    /*Removed because we dont want a scenario where someone checks it out without it actually being set out. Restrict what user can do. They can use the checkout and checkin method.
    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }*/
    ////////////////////////////////////////////////////////////////////////////////////////


    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    /*we wouldnt do this without affecting checkOut method. We can return a value but when it comes to changing(setting the value we want it to be done with our methods.
    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }*/


    //methods(functions) - perform certain actions(for check in and check out)

    public void checkOut(String name){
        //change property when book is checked out. isCheckedOut value is changed to true and checkOutTo is set to the name input.
        //why it's void. You are updating the book's information inside itself,not returning anything to someone else.
        //If someone later wants to see who checked it out. They can use a different method (like a getCheckedOutTo() method) to ask the Book. You don’t need to return it during the check-out process itself.
        this.isCheckedOut = true;
        //in order to check out a book we have to know who is checking it out.
        this.checkedOutTo = name;
        //add later on- how to throw error if book isnt here.
    }

    public void checkIn(){
        this.isCheckedOut = false;
        this.checkedOutTo = "";// "" means nobody
    }


    public String getFormattedBookText(){
        //a book can know how to display itself
        //return  "ID: " + this.id + ", Title: " +  this.title  + ", IBSN: " + this.isbn ;

        return String.format("%-5d %-51s %21s", this.id, this.title, this.isbn);
    }

    public static String getFormattedBookTextHeader(){
        return    "ID     TITLE                                              ISBN\n"
                + "----- --------------------------------------------------- ---------------------";
    }

}