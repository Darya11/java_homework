package Task_23;

import java.util.*;

public class Stack {
    private Queue<Integer> stack;
    private String a = "";
    private int count = 0;

    public Stack() {
        this.stack = Collections.asLifoQueue(new ArrayDeque<>());
    }

    public void printStack(){
        System.out.println(stack);
    }

    public void push(int number){
        stack.add(number);
        count++;
    }

    public void getNumber() {
        if (count < 1){
            return;
        }
        a = a.concat(stack.remove().toString());
        count--;
    }

    public void reversedNumber(){
        System.out.println(a);
    }
}
