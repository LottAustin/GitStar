package q3;

/**
 * <p>The Class is used to build books and update them.</p>
 *
 * @author Austin Lott, 1C
 * @version 1.0
 */
public class Book {

    /**
     * <p>Variable that holds the name of the author.</p>
     * 
     * @value author Name of the author
     */
    private String author;
    
    /**
     * <p>Variable that holds the title of the book.</p>
     * 
     * @value title Name of the book
     */
    private String title;
    
    /**
     * <p>Variable that holds the Publishers name.</p>
     * 
     * @value publisher Name of the publisher
     */
    private String publisher;
    
    /**
     * <p>Variable that holds the date.</p>
     * 
     * @value publishingDate date of publishing
     */
    private String publishingDate;

    /**
     * <p>Constructor that builds the book.</p>
     * 
     * @param book Name of the book that is passed in
     * @param authorName Name that is passed in
     * @param publisherName Publisher that is passed in
     * @param date Date that is passed in
     */
    public Book(String book, String authorName, String publisherName,
            String date) {

        title = book;
        author = authorName;
        publisher = publisherName;
        publishingDate = date;
    }

    /**
     * <p>Constructor that does nothing and has no parameters.</p>
     */
    public Book() {

    }

    /**
     * <p>Setter that sets the title.</p>
     *
     * @param book Title of the book.
     */
    public void setTitle(String book) {
        title = book;
    }

    /**
     * <p>Getter for the title.</p>
     * 
     * @return Returns the title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>Setter for the authors name.</p>
     *
     * @param authorName Authors name.
     */
    public void setAuthor(String authorName) {
        author = authorName;
    }

    
    /**
     * <p>Getter for the authors name.</p>
     * 
     * @return Returns the authors name.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * <p>Setter for the publishers name.</p>
     *
     * @param publisherName Publisher name.
     */
    public void setPublisher(String publisherName) {
        publisher = publisherName;
    }

    /**
     * <p>Getter for the publishers name.</p>
     * 
     * @return Returns the publisher name.
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * <p>Setter for the Date of publishing.</p>
     *
     * @param date Date of publishing.
     */
    public void setDate(String date) {
        publishingDate = date;
    }

    /**
     * <p>Getter for the Date.</p>
     * 
     * @return Returns the publishing date.
     */
    public String getDate() {
        return publishingDate;
    }

    /**
     * <p>Method that formats the contents of Book objects.</p>
     * 
     * @return Returns a formated string of a Book object.
     */
    public String toString() {
        return (title + "\t" + author + "\t" + publisher 
                + "\t" + publishingDate);
    }

}
