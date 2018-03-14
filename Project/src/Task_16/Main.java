package Task_16;

import Task_16.sub_package.Book;
import Task_16.sub_package.Digital;
import Task_16.sub_package.Searchable;

public class Main {
    public static void main(String[] args) {
        DigitalBook digitalBook = new DigitalBook("Gone with the Wind", 1936 );
        DigitalBook digitalBook1 = new DigitalBook("The Da Vinci Code", 2003);
        DigitalBook digitalBook2 = new DigitalBook("The Great Gatsby ", 1925);
        OldDigitalBook oldDigitalBook = new OldDigitalBook("Brave New World ", 1932);
        OldDigitalBook oldDigitalBook1 = new OldDigitalBook("A Thousand Splendid Suns ", 2007);
        OldDigitalBook oldDigitalBook2 = new OldDigitalBook("Fahrenheit 451 ", 1953);
        PaperBook paperBook = new PaperBook("A Tale of Two Cities ", 1859);
        PaperBook paperBook1 = new PaperBook("The Odyssey", 720);
        PaperBook paperBook2 = new PaperBook("Little Women", 1862);
        Book[] books = new Book[]{digitalBook, digitalBook1, digitalBook2, oldDigitalBook, oldDigitalBook1, oldDigitalBook2,
        paperBook, paperBook1, paperBook2};
        for (Book book: books) {
            if (book instanceof Searchable){
                ((Searchable) book).found("1344543");
                if (book instanceof Digital){
                    ((Digital) book).display();
                }
            }
            if (book instanceof Digital &(!(book instanceof  Searchable))){
                ((Digital) book).display();
            }
            if (!(book instanceof Digital)){
                book.getContent();
            }

        }

    }
}
