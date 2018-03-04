package Task_11;

import java.util.Arrays;

public class BookShelf {
    private Book[] bookshelf;
//    private Book[] emptyBookShelf;
//    private Book book;


    public BookShelf() {
        this.bookshelf = new Book[5];


    }

    public void printBooks() {
        for (int i = 0; i < this.bookshelf.length; i++) {
            System.out.println(bookshelf[i]);
        }


    }

    public Book[] add(Book b) {
        int i = 0;
        if (i <= bookshelf.length - 1) {
            bookshelf[i] = b;
//            i++; е

            System.out.println(i);
            System.out.println(bookshelf[i]);
        }



        return bookshelf;
    }
}
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj){
//            return true;
//        }
//        if (obj == null){
//            return false;
//        }
//        if (getClass() != obj.getClass()){
//            return false;
//        }
//        Book b = (Book) obj;
//        if (this.book != b.Book){
//            return false;
//        }
//
//        return true;
//    }
//}
