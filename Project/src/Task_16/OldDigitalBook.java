package Task_16;

import Task_16.sub_package.Book;
import Task_16.sub_package.Digital;

public class OldDigitalBook extends Book  implements Digital{
    private String title;
    private int year;

    public OldDigitalBook(String title, int year) {
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
        System.out.println("[" + getTitle() + "] - " + "[" + getYear() + "]" );
    }

    @Override
    public void display() {
        getContent();
    }
}
