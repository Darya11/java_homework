package Task_23;

import java.util.TreeSet;

public class Begin {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.printStack();
        stack.getNumber();
        stack.getNumber();
        stack.getNumber();
        stack.getNumber();
        stack.reversedNumber();

        //SETS
        Sets set = new Sets();
        set.addElementToSet(1);
        set.addElementToSet(2);
        Sets set2 = new Sets();
        set2.addElementToSet(2);
        set2.addElementToSet(1);

        set.getCommonSet(set2.getSet());
        set.printSets();
        set2.printSets();
        set.printCommonSet();


        //BOOKS

        List list = new List();
        list.addBook(new List.Book("Moby Dick", "Herman Melville"));
        list.addBook(new List.Book("The Odyssey", "Homer"));
        list.addBook(new List.Book("The Odyssey", "Homer"));
        list.printBooksArray();
        list.deleteDuplicates();
        list.printBooksSet();

        // COMPARABLE

        TreeSet<List.Book> treeSet = new TreeSet<>(list.getBookList());
        treeSet.add(new List.Book("In Search of Lost Time", "Marcel Proust"));
        System.out.println(treeSet);

        // STACK SYMBOLS
        String string = "[](}{)";
        Stacks stacks = new Stacks(string);
        stacks.addToStack();





    }
}
