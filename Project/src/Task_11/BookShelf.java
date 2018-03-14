package Task_11;

import java.util.Arrays;

public class BookShelf {
    private Book[] bookshelf;
    private Book[] emptyBookShelf;
    private int i;
    private int y;


    public BookShelf() {
        this.bookshelf = new Book[5];
        this.emptyBookShelf = new Book[5];


    }
    public boolean contains(Book book){
        for (Book presentBook: bookshelf) {
            if (presentBook == null) {
                return false;
            }
            if (presentBook.equals(book)) {
                    return true;
                }
            }
        return false;
    }

    public Book[] add(Book b) {
        if (contains(b)){
            emptyBookShelf[y] = b;
            y++;
            i--;
        }
        if  (i < bookshelf.length - 1) {
            bookshelf[i] = b;
            i++;
        }
        System.out.println("FIRST BOOKSHELF");
        for (Book e : bookshelf
                ) {
            System.out.println(e);
        }

        System.out.println("SECOND BOOKSHELF");
        for (Book e : emptyBookShelf
                ) {
            System.out.println(e);
        }

        return bookshelf;
    }



//
//    public boolean sameBook(){
//        for (int j = 0; j < bookshelf.length ; j++) {
//            for (int k = j + 1; k < bookshelf.length; k++) {
//                if (bookshelf[j].equals(bookshelf[k])){
//                    return true;
//            }
//        }
//
//        }
//        return false;
//    }
//
//    public boolean remove() {
//        System.out.println("REEEEEEEMOOOOOOOOOOVE");
//        boolean same = false;
//        for (int i = 0; i < bookshelf.length; i++) {
//            for (int j = i + 1; j < bookshelf.length; j++) {
//                if (bookshelf[i] == null){
//                    break;
//                }
//                if (this.bookshelf[i].equals(this.bookshelf[j])){
//                   emptyBookShelf[y] = this.bookshelf[j];
//                   y++;
//
//                    same = true;
//                }
//            }
//        }
//        for (Book e : emptyBookShelf
//                ) {
//            System.out.println(e);
//        }
//
//        return same;
//        }
}
