package com.pluralsight;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.Scanner;

public class Main {

    private static Console console = new Console();
    private static Book[] library = getPopulatedBooks();

    public static void main(String[] args) {

        showScreenHome();

    }

    private static void showScreenHome() {

        String homeScreenPrompt = "Welcome to the library!\n" +
                "Please select an option from the following:\n" +
                "    1 - Show Available Books\n" +
                "    2 - Show Checked Out Books\n" +
                "    0 -  Exit App\n" +
                "(1,2,0): ";

        int option;

        do {
            option = console.promptForInt(homeScreenPrompt);
            if (option == 1) {
                showScreenAvailableBooks();
            } else if (option == 2) {
                showScreenCheckedOutBooks();
            } else if (option == 0) {
                System.out.println("Exiting the library, have a nice day!");
            } else {
                System.out.println("Invalid entry, please try again!");
            }

        } while (option != 0);
    }

    private static void showScreenAvailableBooks() {

        // greet user to this menu
        System.out.println("Available Books:");

        // show all of the books that are currently available
        displayAvailableBooks();

        // ask if user wants to check one out.
        String userPrompt = "Select a option: \n" +
                "  Y - If you want to select a book to check out\n" +
                "  N - To go back to the home screen\n" +
                "(Y,N): ";

        String option;

        do {
            option = console.promptForString(userPrompt);
            if (option.equalsIgnoreCase("Y")) {
                // if yes - prompt for which book, and who will check it out then modify data to reflect current state of app
                showScreenCheckOutBookYes();
            } else if (!option.equalsIgnoreCase("N")) {
                System.out.print("Please choose from the available options!\n");
            }

        } while (!option.equalsIgnoreCase("N")); // keep asking until a no
        //on no, exit to main.
    }

    private static void showScreenCheckOutBookYes() {

        int bookId = console.promptForInt("Please enter the book Id: ");
        String name = console.promptForString("What is your name: ");

        Book theSelectedBook = getBookById(library, bookId);

        assert theSelectedBook != null;

        theSelectedBook.checkOut(name);

        System.out.printf("%s you have checked book out successfully.\n", name);
    }

    private static void displayAvailableBooks() {
        System.out.println(Book.getFormattedBookTextHeader());
        for (Book book : library) {
            if (!book.isCheckedOut()) {
                System.out.println(book.getFormattedBookText());
            }
        }
    }

    private static Book getBookById(Book[] books, int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    private static void showScreenCheckedOutBooks() {
        System.out.println("");
    }


    private static Book[] getPopulatedBooks() {
//
//        Book b1 = new Book(1, "ISBN 978-1-78862-355-1", "Nginx HTTP Server");
//        Book b2 = new Book(2, "ISBN 978-1-4919-1889-0", "Learning React");
//        Book b3 = new Book(3, "ISBN 978-0-13-468599-1", "Effective Java");
//        Book b4 = new Book(4, "ISBN 978-1-4919-1881-4", "Fluent Python");
//
//        Book[] allTheBooks = { b1, b2, b3, b4};
//
//        return allTheBooks;

        Book[] library = new Book[20];

        library[0] = new Book(1, "ISBN 978-1-78862-355-1", "Nginx HTTP Server");
        library[1] = new Book(2, "ISBN 978-1-4919-1889-0", "Learning React");
        library[2] = new Book(3, "ISBN 978-0-13-468599-1", "Effective Java");
        library[3] = new Book(4, "ISBN 978-1-4919-1881-4", "Fluent Python");
        library[4] = new Book(5, "ISBN 978-1-59327-599-0", "Automate the Boring Stuff with Python");
        library[5] = new Book(6, "ISBN 978-0-321-35668-0", "Clean Code");
        library[6] = new Book(7, "ISBN 978-0-596-52068-7", "Head First Design Patterns");
        library[7] = new Book(8, "ISBN 978-1-59327-950-9", "Black Hat Python");
        library[8] = new Book(9, "ISBN 978-0-13-235088-4", "Clean Architecture");
        library[9] = new Book(10, "ISBN 978-1-59327-424-5", "Hacking: The Art of Exploitation");
        library[10] = new Book(11, "ISBN 978-0-13-110362-7", "The C Programming Language");
        library[11] = new Book(12, "ISBN 978-1-59327-144-2", "The Linux Command Line");
        library[12] = new Book(13, "ISBN 978-1-4919-1882-1", "Python Cookbook");
        library[13] = new Book(14, "ISBN 978-1-4919-1885-2", "Designing Data-Intensive Applications");
        library[14] = new Book(15, "ISBN 978-1-4493-6144-3", "You Don't Know JS");
        library[15] = new Book(16, "ISBN 978-0-596-52068-7", "JavaScript: The Good Parts");
        library[16] = new Book(17, "ISBN 978-1-4919-5600-7", "Site Reliability Engineering");
        library[17] = new Book(18, "ISBN 978-1-4919-3412-8", "Kubernetes: Up & Running");
        library[18] = new Book(19, "ISBN 978-0-321-93413-1", "Refactoring: Improving the Design of Existing Code");
        library[19] = new Book(20, "ISBN 978-0-262-03384-8", "Introduction to Algorithms");

        return library;
    }

}