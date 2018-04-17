package Task_22;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Catalog {
    private Set<Book> catalog;

    public Catalog() {
        this.catalog = new LinkedHashSet<>();
    }

    public void printSet(){
        System.out.println(catalog);
    }

    public void catalogise(Book book){
        if (!catalog.contains(book)){
            catalog.add(book);
        }
    }
    public static class Book{
        private String title;
        private String author;
        private int year;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }
        @Override
        public String toString() {
            return "Title: " + "\"" + title + "\"," + "  Author: " + author + ", year: " + year;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return year == book.year &&
                    Objects.equals(title, book.title) &&
                    Objects.equals(author, book.author);
        }

        @Override
        public int hashCode() {
            return Objects.hash(title, author, year);
        }
    }

}
