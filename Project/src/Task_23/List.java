package Task_23;

import java.util.*;

public class List {
    private ArrayList<Book> bookList;
    private int counter;
    private Set<Book> unique = new LinkedHashSet<>();

    public List() {
        this.bookList = new ArrayList<>();
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void addBook(Book book){
        bookList.add(book);
        counter++;
    }

    public void remove(int index){
        if (counter < 1){
            return;
        }
        bookList.remove(index);
    }

    public void deleteDuplicates(){
        unique.addAll(bookList);
    }

    public void printBooksArray(){
        System.out.println(bookList);
    }

    public void printBooksSet(){

        System.out.println(unique);
    }


    public static class Book implements Comparable<Book>{
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        @Override
        public int compareTo(Book o) {
            return title.compareTo(o.title);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return Objects.equals(title, book.title) &&
                    Objects.equals(author, book.author);
        }

        @Override
        public int hashCode() {
            return Objects.hash(title, author);
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    '}';
        }
    }

}
