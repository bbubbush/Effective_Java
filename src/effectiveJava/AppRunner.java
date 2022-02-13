package effectiveJava;

public class AppRunner {
    // methods
    public static void main(String args[]) {
//        Book book1 = new Book("Effective Java");
//
//        Book book2 = new Book("", "Joshua Bloch");

        /**
         * book3 and book4 function like book1 and book2
         */
        Book book3 = Book.createBookSetTitle("Effective Java");

        Book book4 = Book.createBookSetAuthor("Joshua Bloch");

        System.out.println("Hello World!");
    }
}
