public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java", "aa");
        Book book2 = new Book("Python");

        EBook b3 = new EBook("C++", "bb",20);
        EBook b4 = new EBook("JavaScript", 15);

        Library library = new Library("부평 국립 ");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(b3);
        library.addBook(b4);

        library.showBooks();

        library.borrowBook("Java");
        library.showBooks();

        library.returnBook("Java");
        library.showBooks();
    }
}
