package Task_11;

public class Program {
    public static void main(String[] args) {
        Author author = new Author("Benjamin", 1998);
        Book book = new Book("ghh", 570, author);
        Book book2 = new Book("fg", 543, author);
        BookShelf bookShelf = new BookShelf();


        bookShelf.add(book);
        bookShelf.add(book2);


    }
}
