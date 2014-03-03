package q3;

import java.util.Scanner;

/**
 * <p>This program is a updates and creates "books".</p>
 *
 * @author Austin Lott, 1C
 * @version 1.0
 */
public class Bookshelf {
    
    /**
     * <p>Variable that holds the title of the book.</p>
     * 
     * @value title Name of the book
     */
    private static String title;
    
    /**
     * <p>Variable that holds the name of the author.</p>
     * 
     * @value author Name of the author
     */
    private static String author;
    
    /**
     * <p>Variable that holds the Publishers name.</p>
     * 
     * @value publisher Name of the publisher
     */
    private static String publisher;
    
    /**
     * <p>Variable that holds the date.</p>
     * 
     * @value date date of publishing
     */
    private static String date;
    
    /**
     * <p>The scanner that takes user input.</p>
     * 
     * @value scan takes in user input
     */
    private static Scanner scan = new Scanner(System.in);
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        /* ask for information for the first book */
        System.out.print("Enter a book title: ");
        title = scan.nextLine();
        
        System.out.print("Enter the author(s) name: ");
        author = scan.nextLine();
        
        System.out.print("Enter the publisher: ");
        publisher = scan.nextLine();
        
        System.out.print("Enter the Publishing date(s): ");
        date = scan.nextLine();
        
        /* Build and out put book */
        Book book1 = new Book(title, author, publisher, date);
        System.out.println(book1);
        
        /* ask for information for the second book */
        System.out.print("Enter another book title: ");
        title = scan.nextLine();
        
        System.out.print("Enter the author(s) name: ");
        author = scan.nextLine();
        
        System.out.print("Enter the publisher: ");
        publisher = scan.nextLine();
        
        System.out.print("Enter the Publishing date(s): ");
        date = scan.nextLine();
        
        /* build and output both books */
        Book book2 = new Book(title, author, publisher, date);
        System.out.println(book2);
        /* update and output book 1 */
        System.out.println("Update the first book: ");
        update(book1);
        System.out.println(book1);
        
        /* update and output book 2 */
        System.out.println("Update the second book: ");
        update(book2);
        System.out.println(book2);
        
        
    }
    
    /**
     * <p>This is the update method. It is used to update the books.</p>
     *
     * @param book Book that is passed in to be updated.
     */
    public static void update(Book book) {
        
        System.out.print("Update the book title: ");
        title = scan.nextLine();
        book.setTitle(title);
        
        System.out.print("Update the book publisher: ");
        publisher = scan.nextLine();
        book.setPublisher(publisher);
        
        System.out.print("Update the book author: ");
        author = scan.nextLine();
        book.setAuthor(author);
        
        System.out.print("Update book date: ");
        date = scan.nextLine();
        book.setDate(date);
    }

}
