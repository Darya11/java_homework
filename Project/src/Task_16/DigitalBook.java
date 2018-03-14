package Task_16;

import Task_16.sub_package.Book;
import Task_16.sub_package.Digital;
import Task_16.sub_package.Searchable;

import java.util.Random;

public class DigitalBook extends Book implements Digital, Searchable {
    private String title;
    private int year;
    private int foundNumber;

    public DigitalBook(String title, int year) {
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

    @Override
    public int found(String text) {
        foundNumber = 1 + (int)(Math.random() * (1001 - 1));
        System.out.println(foundNumber);
        return foundNumber;
    }
}
