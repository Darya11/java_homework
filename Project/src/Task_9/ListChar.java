package Task_9;

import java.util.Arrays;

public class ListChar {
    private char[] listChar;
    private int element = 0;
    private int size;

    ListChar() {
        this.listChar = new char[30];

    }

    ListChar(int size) {
        this.listChar = new char[size];
        this.size = size;
    }

    public boolean add(char e) {
        System.out.println("ADD FUNCTION:");
        System.out.println(e);
        boolean newElem = false;
        if (set(element, e)){
            element++;
            newElem = true;

        }
        return newElem;
    }

    public boolean set(int index, char c) {
        if (size < 0){
            return false;
        }
        boolean setIndex = false;
        if (index <= listChar.length - 1) {
            listChar[index] = c;
            setIndex = true;
            // TASK 13
        } else if (index >= listChar.length) {
           listChar = Arrays.copyOf(listChar, size * 2);
           listChar[index] = c;
           setIndex = true;

        }
        System.out.print("Char list: ");
        System.out.println(listChar);
        return setIndex;
    }

    public int get(int index) {
        char element;
        if (index <= listChar.length - 1) {
            element = listChar[index];
        } else {
            return -1;

        }
        System.out.print("Char symbol [" + element + "] equals to the code: ");
        return element;
    }

    public boolean contains(char c) {
        boolean containElem = false;
        System.out.print("Does the array contain this char element? ");
        for (char i : listChar) {
            if (i == c) {
                System.out.println(c);
                containElem = true;
            }
        }
        return containElem;
    }

    public void clear() {
        for (char i = 0; i < listChar.length; i++) {
            listChar[i] = 0;
        }
        System.out.println(listChar);
    }

    public int indexOf(char c) {
        int index;
        System.out.print("The index of element is: ");
        for (index = 0; index < listChar.length; index++) {
            if (listChar[index] == c) {
                return index;
            }
        }
        return -1;
    }

    public int getFullSize() {
        return listChar.length;
    }

    public int getFreeSize() {
        return size - element;
    }

    public int length() {

        return element;
    }

    public boolean isEmpty() {
        boolean empty = false;
        if (element == 0){
            empty = true;
        }
        return empty;
    }

    public void sort(Direction d) {
        for (int i = 0; i < listChar.length; i++) {
            for (int j = i + 1; j < listChar.length; j++) {
                switch (d) {
                    case ASC:
                        if (listChar[i] < listChar[j]) {
                            char min_index = listChar[i];
                            listChar[i] = listChar[j];
                            listChar[j] = min_index;
                            break;
                        }
                    case DESC:
                        if (listChar[j] > listChar[i]) {
                            char min_index = listChar[j];
                            listChar[j] = listChar[i];
                            listChar[i] = min_index;
                            break;
                        }
                }
            }
        }
            System.out.println(listChar);
    }
    public boolean addAll(ListChar listChar) {
        boolean addNewElem = false;
        int lenList1 = element;
        int lenList2 = listChar.length();
        int extendedList = size - element;
        if (lenList2 > extendedList){
            addNewElem = false;
        }
            for (int i = lenList1; i < lenList1 + lenList2; i++) {
                for (int j = 0; j < lenList2; j++) {
                    if (set(i, listChar.listChar[j])) {
                        this.listChar[i] = listChar.listChar[j];
                        i++;
                        addNewElem = true;
                    }
                }
            }


        System.out.println(this.listChar);
        return addNewElem;
    }



    public boolean equals(ListChar c){
        boolean equal = false;
        int g = 0;
        if (this != c){
             equal = false;
        }
        if (this.getFullSize() != c.getFullSize()){
            equal = false;
        }
        for (int i = 0; i < this.getFullSize(); i ++) {

            for (int j = 0; j < c.getFullSize(); j++) {

                if (this.listChar[i] == c.listChar[j]) {
                    if (i == j) {
                        g++;
                    }
                }
            }
        }
        if (g == this.getFullSize()){
            equal = true;
        }

        return equal;
    }
// TASK 12

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        ListChar list = (ListChar) obj;
        if (this.listChar != list.listChar){
            return false;
        }

        return true;
    }
}









