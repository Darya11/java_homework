package Task_29;


import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Juicer juicer = new Juicer();
        Collection<Apple> apples = Arrays.asList(new Apple(), new Apple());
        Collection<AppleQuince> appleQuinces = Arrays.asList(new AppleQuince(), new AppleQuince());
        Collection<Fruit> mixedFruits = Arrays.asList(new Apple(), new Apricot(), new AppleQuince());
        Collection<Apricot> apricots = Arrays.asList(new Apricot(), new Apricot());
        juicer.makeJuice(apricots);
    }


}
