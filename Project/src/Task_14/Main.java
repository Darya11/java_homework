package Task_14;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(1, "Jack", 2, 15, "brown", true);
        Cat cat = new Cat(2, "Simka", 8, 10, "ginger", true);
        Guide_dog guide_dog = new Guide_dog(3, "Muhtar", 3, 20, "black", true, true);
        Hamster hamster = new Hamster(4, "Sam", 1, 1, "white", false);
        Crocodile crocodile = new Crocodile(5, 20, 100, "green", true);
        Fish fish = new Fish(6, 2, 2, "blue", false);
        Giraffe giraffe = new Giraffe(7, 15, 90, "ginger", false);
        Lion lion = new Lion(8, 9, 85, "ginger", true);
        Wolf wolf = new Wolf(9, 5, 65, "gray", true);
        Domestic[] domestics = new Domestic[]{dog, cat, guide_dog, hamster};
        for (Domestic animal: domestics) {
            animal.voice();
        }
        System.out.println();
        Wild[] wilds = new Wild[]{fish, crocodile, lion, wolf, giraffe};
        for (Wild animal: wilds) {
            animal.voice();
        }
    }
}
