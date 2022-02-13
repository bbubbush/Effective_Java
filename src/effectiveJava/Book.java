package effectiveJava;

public class Book {
    // fields
    private String title;
    private String author;

    // constructors
//    public Book(String title) {
//        this.title = title;
//    }

    private Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static Book createBookSetTitle(String bookTitle) {
        return new Book(bookTitle, "");
    }
    public static Book createBookSetAuthor(String author) {
        return new Book("", author);
    }

}
