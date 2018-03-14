package Task_9;

public class SetChar extends ListChar {
    private char[] setChar;





    SetChar(int size){
        this.setChar = new char[size];
    }

    public boolean set(int index, char c) {
        boolean setIndex = false;
        int count = 0;
        for (char a : setChar) {
            if (a != c) {
                count++;

            }
        }
            if (index <= setChar.length - 1) {
                setChar[index] = c;


            } else if (index >= setChar.length) {
                System.out.println("Out of range!");
                setIndex = false;
            }

            if (count == setChar.length) {
                setIndex = true;
            }

        System.out.println(setChar);
        return setIndex;
        }


}
