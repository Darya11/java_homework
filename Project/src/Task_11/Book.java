package Task_11;

public class Book  {
    private String article;
    private int pages;
    private Author author;




    public Book(String article, int pages, Author author) {
        this.article = article;
        this.pages = pages;
        this.author = author;
    }

    public String toString(){
        return article + " "+  pages + " " + author;
    }


}
