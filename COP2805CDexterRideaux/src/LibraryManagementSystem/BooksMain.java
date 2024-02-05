package LibraryManagementSystem;

import java.util.*;

public class BooksMain {
    public static void main(String[] args) {

        // Create a new Library object
        Library library = new Library();

        // Repeat the main menu until the user quits the program
        do {
            // Display the main menu
            library.displayMainMenu();

            // Get the user's menu choice
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            // Add a book to the library
            if (choice == 1) {
                // Create a new Book object
                Book book = new Book();
                // Display the book menu and get the book's details from the user
                book.bookMenu();
                // Add the book to the library
                library.addBook(book);

            // Remove a book from the library
            } else if (choice == 2) {
                // Ask the user for the serial number of the book they want to delete
                System.out.println("Enter the books serial Number that you want to Delete : ");
                int userChoice = sc.nextInt();
                // Get the Book object from the library using its serial number
                Book book = library.getBook(library.findBook(userChoice));
                // Remove the book from the library
                library.removeBook(book);

            // List all books in the library
            } else if(choice == 3) {
                library.getAllBook();
            } else if(choice == -1) {
            	break;
            }
        } while (true); // Keep repeating the main menu until program 
                        // is terminated by the user.                     
        
        System.out.println("Have a Nice Day!");
  }
}