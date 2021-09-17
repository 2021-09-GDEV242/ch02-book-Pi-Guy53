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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }

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
    
    public void borrow()
    {
        borrowed++;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getTitle()
    {
        return title;
    }

    public int getPages()
    {
        return pages;
    }

    public String getRefNumber()
    {
        return refNumber;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }

    public void printAuthor()
    {
        System.out.println("Book Author: " + author);
    }

    public void printTitle()
    {
        System.out.println("Book Title: " + title);
    }

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
