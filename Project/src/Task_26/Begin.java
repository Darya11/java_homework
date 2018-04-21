package Task_26;

public class Begin {
    public static void main(String[] args) {
        BookLst bookLst = new BookLst();
        BookLst.Book book1 = bookLst.new Book("Animal Farm", "George Orwell", 1945);
        BookLst.Book book2 = bookLst.new Book("The Diary of a Young Girl", "Anne Frank", 1947);
        BookLst.Book book3 = bookLst.new Book("The Hobbit", " J.R.R. Tolkien", 1937);
        BookLst.Book book4 = bookLst.new Book("A Tree Grows in Brooklyn", "Betty Smith", 1943);
        BookLst.Book book5 = bookLst.new Book("The Color Purple", "Alice Walker", 1982);
        bookLst.addBook(book1);
        bookLst.addBook(book2);
        bookLst.addBook(book3);
        bookLst.addBook(book4);
        bookLst.addBook(book5);
        bookLst.printBookList();
        bookLst.sorted();
        bookLst.printBookList();
    }
}
