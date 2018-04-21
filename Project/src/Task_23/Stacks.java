package Task_23;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

public class Stacks {
    private Queue<Character> stack;
    private String string;
    private int count;

    public Stacks(String string) {
        this.stack = Collections.asLifoQueue(new ArrayDeque<>());
        this.string = string;
    }

    public void addToStack(){
        for (char ch: string.toCharArray()
             ) {
            if (ch == '(' || ch == '{' || ch == '['){
                stack.add(ch);
            }
            if (ch == ')'|| ch == '}'|| ch == ']'){
                if (pair(stack.peek(), ch)){
                    stack.remove();
                }
            }

        }
        System.out.println(stack);

    }

    public boolean pair(char open, char close){
        if (open == '(' && close == ')'|| open == '{' && close == '}' || open == '[' && close == ']'){
            return true;
        }
        return false;
    }




}
