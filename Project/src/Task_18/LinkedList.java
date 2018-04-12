package Task_18;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void insertBefore(String data){
        Node current = new Node(data);
        if (head == null){
            head = current;
            tail = head;
            size++;
            return;
        }
        head.setPrevious(current);
        current.setNext(head);
        head = current;
        size++;
    }

    public void insertAfter(String data){
        Node current = new Node(data);
        if (head == null){
            head = current;
            tail = head;
            size++;
            return;
        }

        current.setPrevious(tail);
        tail.setNext(current);
        tail = current;
        size++;
    }

    public Node find(String data){
        Node current = head;
        while (current != null){
            if (current.getValue().equals(data)){
                return current;
            }
            current = current.getNext();

        }
        return null;
    }

    public boolean contains(String data){
        return (find(data)!= null);
    }

    public void remove(String data){
        Node current = find(data);

        if (current == head){
            Node newNode = head.getNext();
            head.setNext(null);
            newNode.setPrevious(null);
            head = newNode;
            size--;
            return;
        }

        if (current == tail){
            Node newNode = tail.getPrevious();
            tail.setPrevious(null);
            newNode.setNext(null);
            tail = newNode;
            size--;
            return;
        }

        current.getPrevious().setNext(current.getNext());
        current.getNext().setPrevious(current.getPrevious());
        current.setPrevious(null);
        current.setNext(null);
        size--;

        }


    public void clear(){
        Node current = head;
        while (current != null){
            current = current.getNext();
            current.setPrevious(null);
            size--;
        }

    }

    public Node[] array(){
        Node current = head;
        Node[] arr = new Node[size];
        for (int i = 0; i < size ; i++) {
            arr[i] = current;
            System.out.println(arr[i].getValue());
            current = current.getNext();

        }
        return  arr;
    }


}
