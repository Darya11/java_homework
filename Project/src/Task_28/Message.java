package Task_28;

import java.util.Arrays;

public class Message <T> {
    private T obj;

    public Message(T obj) {
        this.obj = obj;
    }

    public Message() {
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return Arrays.asList(obj).toString();
    }
}
