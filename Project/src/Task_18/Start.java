package Task_18;

public class Start {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertBefore("kkk");
        linkedList.insertBefore("aaa");
        linkedList.insertBefore("bbb");
        linkedList.insertBefore("yyy");
        linkedList.insertAfter("sss");
        linkedList.insertAfter("fff");
        linkedList.insertAfter("ddd");
        linkedList.remove("yyy");
        Node p = linkedList.find("bbb");
        System.out.println(p.getValue());
        boolean l = linkedList.contains("aaa");
        System.out.println(l);


        linkedList.array();


    }
}
