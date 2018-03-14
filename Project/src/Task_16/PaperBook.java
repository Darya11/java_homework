package Task_16;

import Task_16.sub_package.Book;

public class PaperBook extends Book {
    private String title;
    private int year;

    public PaperBook(String title, int year) {
        this.title = title;
        this.year = year;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void getContent() {
        System.out.println("Incompatible Book Format");

    }
}
