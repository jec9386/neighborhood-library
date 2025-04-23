package com.pluralsight;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    // accessible to any method
    private static Book[] library = getPopulatedLibrary();

    public static void main(String[] args) {


        ShowScreenHome();


    }

    private static void ShowScreenHome(){
        String homeScreenPrompt = "Welcome to the library!\n" +
                "Please select an option from the following:\n" +
                "   1 - Show Available Books\n" +
                "   2 - Show Checked Out Books\n" +
                "   0 - Exit App\n" +
                "(1,2,0): ";
        //ask at least once
        int option;

        do {
            System.out.print(homeScreenPrompt);
            option = scanner.nextInt();
            scanner.nextLine();
            if(option == 1 ){
                ShowScreenAvailableBooks();
            } else if (option == 2){
                ShowScreenCheckedOutBooks();
            }else if (option == 0){
                System.out.println("Exiting the library, have a nice day!");
            }else{
                System.out.println("Not a valid option, please try again.");
            }
        } while(option != 0);

    }

    private static void ShowScreenAvailableBooks(){
        System.out.println("...todo available books menu here");
    }

    public static void ShowScreenCheckedOutBooks(){
        System.out.println("...todo checked out books menu here...");
    }


    //method to help access book array, keep private, give array of books
    private static Book[] getPopulatedLibrary(){
        Book[] library = new Book[20];

        library[0] = new Book(1, "ISBN 978-1-78862-355-1", "Nginx Http Server");
        library[1] = new Book(2, "ISBN 978-0-13-468599-1", "Effective Java");
        library[2] = new Book(3, "ISBN 978-1-4919-1889-0", "Learning Python");
        library[3] = new Book(4, "ISBN 978-1-59327-599-0", "Automate the Boring Stuff with Python");
        library[4] = new Book(5, "ISBN 978-0-321-35668-0", "Clean Code");
        library[5] = new Book(6, "ISBN 978-1-491-93739-2", "Fluent Python");
        library[6] = new Book(7, "ISBN 978-1-449-36150-3", "JavaScript: The Good Parts");
        library[7] = new Book(8, "ISBN 978-0-13-235088-4", "Clean Architecture");
        library[8] = new Book(9, "ISBN 978-1-4493-6140-4", "You Don’t Know JS");
        library[9] = new Book(10, "ISBN 978-1-4919-1886-9", "Head First Java");
        library[10] = new Book(11, "ISBN 978-0-596-52068-7", "Programming Perl");
        library[11] = new Book(12, "ISBN 978-0-321-93473-4", "Introduction to Algorithms");
        library[12] = new Book(13, "ISBN 978-1-4919-0218-9", "Java: The Complete Reference");
        library[13] = new Book(14, "ISBN 978-1-4919-4517-9", "Designing Data-Intensive Applications");
        library[14] = new Book(15, "ISBN 978-1-4919-1889-8", "Python Crash Course");
        library[15] = new Book(16, "ISBN 978-0-201-61622-4", "The Mythical Man-Month");
        library[16] = new Book(17, "ISBN 978-0-201-70353-6", "Refactoring");
        library[17] = new Book(18, "ISBN 978-1-4919-1886-7", "Test-Driven Development by Example");
        library[18] = new Book(19, "ISBN 978-1-449-37459-6", "Eloquent JavaScript");
        library[19] = new Book(20, "ISBN 978-1-4919-5642-5", "The Pragmatic Programmer");

        return library;
    }

}