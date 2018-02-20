public class Cycles {
    public static void finalCycle(){
        for(int i = 0; i < 20; i++) {
            if(i % 6 != 0 || i == 0) System.out.println("Race " + i);
        }
    }
    public static void doWhile(){
        System.out.println("Eagle or tails?");
        double a;
        do{
            a = Math.random();
            if(a > 0.5) System.out.println( "eagle");
            else if (a < 0.5) System.out.println( "tails");
        }while (a != 0);

    }
    public static void counting(){
        System.out.println("Counting from 10 to 1");
        int m = 10;
        do{
            System.out.println(m);
        }while (--m > 0);
    }
    public static void multiplicationTable(){
        System.out.println("Multiplication table");
        int l = 0, d = 1;
        while(d <= 9 ) {
            l++;
            System.out.println("Result of " + l + " and " + d + " = " + l*d);
            if(l == 9){
                l =0;
                d++;
            }

        }
    }



}


