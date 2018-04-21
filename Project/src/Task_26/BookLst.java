package Task_26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookLst {
    private List<Book> list;

    public BookLst() {
        this.list = new ArrayList<>();
    }

    public void addBook(Book book){
        list.add(book);
    }

    public void removeBook(int index){
        list.remove(index);
    }

    public void sorted(){
        Collections.sort(list);
    }

    public void printBookList(){
        System.out.println(list);
    }

    public class Book implements Comparable<Book>{
        private String title;
        private String author;
        private int year;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        @Override
        public int compareTo(Book o) {
            if (year < o.year){
                return -1;
            }
            if (year > o.year){
                return 1;
            }
            else
            return 0;
        }

        @Override
        public String toString() {
            return "{Title: '" + title + "\', " + "author: '" + author + "\', " + "year: "+ year + "}";
        }
    }
}
