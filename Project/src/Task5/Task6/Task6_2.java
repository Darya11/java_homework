package Task5.Task6;

public class Task6_2 {
    public static void main(String[] args) {
    long p = recursion(30);
        System.out.println(p);
    }
public static long recursion(int n){
        int k = 3;
        if(n == 0){
            return 0;
        }

        return  (n *k) + recursion(n - 1);
}
}


