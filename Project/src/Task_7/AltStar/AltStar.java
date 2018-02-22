package Task_7.AltStar;

import Task_7.Car;
import Task_7.Vehicle;

public class AltStar extends Car {
    public static void main(String[] args) {
        AltStar altStar = new AltStar();
        altStar.colorful();
        int a = altStar.volume(55);
        System.out.println(a);

    }
}
