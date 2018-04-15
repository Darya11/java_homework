package Task_20_21;

public class Start {
    public static void main(String[] args) {
        MyDeque myDeque = new MyDeque();
        myDeque.addFirst("ddd");
        myDeque.addFirst("eee");
        myDeque.addLast("iii");
        myDeque.addLast("kkk");
        myDeque.removeFirst();
        myDeque.removeLast();
        boolean contains = myDeque.contain("ddd");
        System.out.println("***" + contains + "***");
        String first = myDeque.peekFirst();
        System.out.println("***" + first + "***");
        String last = myDeque.peekLast();
        System.out.println("***" + last + "***");
        int size = myDeque.size();
        System.out.println("***" + size + "***");
        myDeque.poll();
        myDeque.pop();


        myDeque.array();
    }


}
