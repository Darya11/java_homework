package Task_11;

public class Author  {
    private String name;
    private int yearOfBirth;

    public Author(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }
    public String toString(){
        return name + " "+  yearOfBirth;
    }

}
