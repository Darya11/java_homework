package Task_22;

import Task_16.sub_package.ModernDigital;

import java.util.Collections;

public class Start {
    public static void main(String[] args) {
        //PAYMENT
        Payment payment = new Payment();
        payment.check(new Payment.Goods("Milk", 11));
        payment.check(new Payment.Goods("Sauce", 5));
        payment.check(new Payment.Goods("Chicken", 12));
        payment.check(new Payment.Goods("Milk", 11));
        payment.print();

        //CATALOG
        Catalog catalog = new Catalog();
        catalog.catalogise( new Catalog.Book("The Way We Live Now", "Anthony Trollope", 1875));
        catalog.catalogise( new Catalog.Book("The Way We Live Now", "Anthony Trollope", 1875));
        catalog.catalogise( new Catalog.Book("Three Men in a Boat", "Jerome K Jerome", 1889));
        catalog.printSet();


        //COMPUTER
        Computer computer = new Computer();
        Computer.Characteristics comp1 = computer.new Characteristics("Microsoft", "Intel Core i7",
                "Kingston DDR3-1600");
        Computer.Characteristics comp2 = computer.new Characteristics("Linux", "AMD FX-Series",
                "AMD DDR4-2133");
        computer.getInfo(comp1);
        computer.getInfo(comp2);
        computer.printInfo();

        //MOVIE
        Movie movie = new Movie();
        movie.seePoster();
        movie.printPoster();






    }
}
