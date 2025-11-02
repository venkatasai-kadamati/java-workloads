package Core.JavaDocTopic;

/**
 * @author Venkatasai Kadamati
 * @version 2.0
 * @since 2025
 **/
public abstract class Book {
    static int val = 10;

    /**
     * Parameterized Constructor
     *
     * @param s Book Name
     */
    public Book(String s) {
    }

    /**
     * Issue a book to a Student
     *
     * @param roll Roll Number of a Student
     * @throws Exception
     */
    public void issue(int roll) throws Exception {
    }

    /**
     * @param str
     * @return
     */
    public boolean available(String str) {
        return true;
    }

    /**
     *
     * @param id Book identifier
     * @return if book is available returns true else false
     */
    public String getName(int id) {
        return "";
    }

    /**
     * Abstract data type
     *
     * @param val No of books to print date wise
     */
    abstract void printBookDates(int val);
}
