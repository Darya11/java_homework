package Task5.Task6;

public class Task6_1 {
    public static void main(String[] args) {
        char[] first = new char[]{'b', 'a', 'p', 'd'};
        char[] second = new char[]{'b', 'a', 'p', 'd'};
        boolean isBoolean = isEqual(first, second);
        System.out.println(isBoolean);
    }

    public static boolean isEqual(char[] a, char[] b) {
        boolean bool = false;
        int len1 = a.length;
        int len2 = b.length;
        int l = 0;
        int k = 0;
        int g = 0;
        if (len1 != len2) {
            return bool;
        }

        for (char i : a) {
            k++;
            for (char j : b) {
                if (i == j) {
                    l++;

                    if (l == k) {
                        g++;
                    }
                }
            }
        }
        if (g == len1){
            bool = true;
        }
        return bool;
    }
}

