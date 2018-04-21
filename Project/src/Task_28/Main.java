package Task_28;

import Task_22.Catalog;
import Task_26.BookLst;

public class Main {
    public static void main(String[] args) {
        Message<Catalog.Book> bookMessage = new Message<>(new Catalog.Book("The Color Purple", "Alice Walker", 1982));
        System.out.println(bookMessage);
    }
}
