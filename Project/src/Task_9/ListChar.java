package Task_9;

import java.util.Arrays;

public class ListChar {
    private char[] listChar;

    public char[] getListChar() {
        return listChar;
    }

    private int element = 0;

    ListChar() {
        this.listChar = new char[30];


    }

    ListChar(int size) {
        this.listChar = new char[size];

    }

    public boolean add(char e) {
        boolean newElem = false;
        if (element <= listChar.length - 1) {
            listChar[element] = e;
            element++;
            newElem = true;
        } else if (element > listChar.length) {
            System.out.println("Out of range!");
            newElem = false;
        }
        return newElem;
    }

    public boolean set(int index, char c) {
        boolean setIndex = false;
        if (index <= listChar.length - 1) {
            listChar[index] = c;
            setIndex = true;
        } else if (index >= listChar.length) {
            System.out.println("Out of range!");
            setIndex = false;
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
//        System.out.print("Array full size is: ");
        return listChar.length;
    }

    public int getFreeSize() {
        int i;
        int currentSize = 0;
        int freeLen;
        for (i = 0; i < listChar.length; i++) {
            if (listChar[i] != 0) {
                currentSize += 1;
            }
        }
        freeLen = listChar.length - currentSize;
//        System.out.print("Number of free elements of the list: ");
        return freeLen;
    }

    public int length() {
        int i;
        int currentSize = 0;

        for (i = 0; i < listChar.length; i++) {
            if (listChar[i] != 0) {
                currentSize += 1;
            }
        }
//        System.out.print("Current size equals to: ");
        return currentSize;
    }

    public boolean isEmpty() {
        boolean empty = false;
        int i;
        int currentSize = 0;
        for (i = 0; i < listChar.length; i++) {
            if (listChar[i] != 0) {
                currentSize += 1;
                empty = false;
            }
        }
        if (currentSize == 0) {
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
        int lenList1 = this.length();
        int lenList2 = listChar.length();
        int extendedList = this.getFreeSize();
        if (lenList2 > extendedList){
            addNewElem = false;
        }
        else {
            for (int i = lenList1; i < lenList1 + lenList2; i++) {
                for (int j = 0; j <lenList2; j++) {
                    this.listChar[i] = listChar.listChar[j];
                    i++;
                   addNewElem = true;
                }
            }
        }
        System.out.println(this.getListChar());
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









