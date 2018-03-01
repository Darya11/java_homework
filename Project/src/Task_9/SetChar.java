package Task_9;

public class SetChar extends ListChar {
    private char[] setChar;
    private int element = 0;


    SetChar(int size){
        this.setChar = new char[size];
    }

    @Override
    public boolean add(char e) {
        boolean newElem = false;
        int count = 0;
        System.out.println(setChar);
        for (char a: setChar) {
            if (a != e){
                count++;
            }
        }
        if (element <= setChar.length - 1) {
            setChar[element] = e;
            element++;

        } else if (element > setChar.length) {
            System.out.println("Out of range!");
            newElem = false;
        }
         if (count == setChar.length){
            newElem = true;
        }
        return newElem;
    }
}
