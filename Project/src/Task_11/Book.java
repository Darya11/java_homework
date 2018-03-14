package Task_11;

public class Book  {
    private String article;
    private int pages;
    private Author author;
    private static int counter;


    public Book(String article, int pages, Author author) {
        this.article = article;
        this.pages = pages;
        this.author = author;
        // TASK 15
        counter++;

    }
// TASK 15

    public static int getCounter() {
        System.out.print("Amount of books is: " + counter);
        return counter;
    }

    public String toString(){
        return article + " "+  pages + " " + author;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Book b = (Book) obj;
        return article.equals(b.article) &&
                author.equals(b.author) && pages == b.pages;
    }


}
