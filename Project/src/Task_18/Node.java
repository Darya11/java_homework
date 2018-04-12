package Task_18;

public class Node {
    private Node next;
    private Node previous;
    private String value;

    public Node(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
