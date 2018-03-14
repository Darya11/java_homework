package Task_11;

public class Program {
    public static void main(String[] args) {
        Author author = new Author("Benjamin", 1998);
        Book book1 = new Book("Consequence", 570, author);
        Book book2 = new Book("Attitude", 543, author);
        BookShelf bookShelf = new BookShelf();
        Book book3 = new Book("Consequence", 570, author);
        Book book4 = new Book("Labor", 320, author);
        Book book5 = new Book("Attitude", 543, author);



        bookShelf.add(book1);
        bookShelf.add(book3);
        bookShelf.add(book5);
        bookShelf.add(book2);
        bookShelf.add(book4);

        Book.getCounter();

    }
}
