package Task_20_21;

public class MyDeque {
    private Node head;
    private Node tail;
    private int size;

    public boolean addFirst(String element){
        Node current = new Node(element);
        if (head == null){
            head = current;
            tail = head;
            size++;
            return true;
        }
        current.next = head;
        head.previous = current;
        head = current;
        size++;
        return true;
    }

    public boolean addLast(String element){
        Node current = new Node(element);
        if (head == null){
            head = current;
            tail = head;
            size++;
            return true;
        }
        current.previous = tail;
        tail.next = current;
        tail = current;
        size++;
        return true;

    }

    public boolean removeFirst(){
        if (head == null){
            return false;
        }
        if (head == tail){
            head = tail = null;
            size --;
            return true;
        }
        head = head.next;
        head.previous = null;
        size--;
        return true;
    }

   public boolean removeLast(){
        if (tail == null){
            return false;
        }
        if (tail == head){
            tail = head = null;
            size--;
            return true;
        }
        tail = tail.previous;
        tail.next = null;
        size--;
        return true;
   }

    public String peekFirst(){
        if (head == null){
            return null;
        }
        return head.value;
    }

    public String peekLast(){
        if (tail == null){
            return null;
        }
        return tail.value;
    }
    public String pop(){
        String lastElem = peekLast();
        removeLast();
        return lastElem;
    }

    public String poll(){
        String firstElem = peekFirst();
        removeFirst();
        return firstElem;
    }

   public boolean contain(String element){
        Node current = head;
        while (current!= null){
            if (current.value.equals(element)){
                return true;
            }
            current = current.next;
        }
        return false;
   }

   public int size(){
        return size;
   }

    private static class Node{
        private Node previous;
        private Node next;
        private String value;

        public Node(String value) {
            this.value = value;
        }
    }

    public Node[] array() {
        Node current = head;
        Node[] arr = new Node[size];
        for (int i = 0; i < size; i++) {
            arr[i] = current;
            System.out.println(arr[i].value);
            current = current.next;

        }
        return arr;
    }
}

