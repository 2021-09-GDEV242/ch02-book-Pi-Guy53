/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Mihail Vaporakis
 * @version 2021-09-17
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isATextBook)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        courseText = isATextBook;
        refNumber = "";
    }

    /**
     * Set the Referance number
     */ 
    public void setRefNumber(String ref)
    {
        if(ref.length() > 3)
        {
            refNumber = ref;
        }
        else{
            System.out.println("Invalid referance number: Must be at least 3 characters long");
        }
    }

    /**
     * Add one to the number of times this book has been borrowed
     */
    public void borrow()
    {
        borrowed++;
    }

    /**
     * @Return the author
     */
    public String getAuthor()
    {
        return author;
    }

    /**
     * @Return the title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * @Return the number of pages
     */
    public int getPages()
    {
        return pages;
    }

    /** 
     * @Return the referance number
     */
    public String getRefNumber()
    {
        return refNumber;
    }

    /**
     * @Return the number of times this book has been borrowed
     */
    public int getBorrowed()
    {
        return borrowed;
    }

    /**
     * @Returns whether this book is a textbook for a class
     */
    public boolean isCourseText()
    {
        return courseText;
    }

    /**
     * Print the author
     */
    public void printAuthor()
    {
        System.out.println("Book Author: " + author);
    }

    /**
     * Print the title
     */
    public void printTitle()
    {
        System.out.println("Book Title: " + title);
    }

    /**
     * Print the book details
     */
    public void printDetails()
    {
        System.out.println("++++++++++++++");
        System.out.println(title);
        System.out.println("By: " + author);
        System.out.println("Number of pages: " + pages);
        if (refNumber.length() > 0)
        {
            System.out.println("Referance Number: " + refNumber);
        }
        else
        {
            System.out.println("Referance Number: ZZZ");
        }
        System.out.println("This book has been borrowed " + borrowed + " times");
        System.out.println("++++++++++++++");
    }

}
