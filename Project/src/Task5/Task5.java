package Task5;



public class Task5 {
    public static void main(String args[]) {
        System.out.println(palidpome(123321));
        int[][] arr = new int[10][10];
        matrix(arr);


    }

    public static int palidpome(int number) {


        int k, all = 0;

        int temp = number;
        while (number > 0) {
            k = number % 10;
            all = (all * 10) + k;
            number = number / 10;
        }
        if (temp == all)
            return 1;
        else
            return 0;
    }

    public static void matrix(int[][] items) {
        int len = items.length;
        int a = -20;
        int b = 21;
        int k;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                k = a + (int)(Math.random() * (b - a));
                items[i][j] = k;
                System.out.printf("%3d ", k);
            }

            System.out.println();
        }
        int sumOfElements = sum(items);
        System.out.println("Sum of elements is: " + sumOfElements);
        double averageOfElements = average(items);
        System.out.println("Average of elements is: " + averageOfElements);
        int minimum = minElement(items);
        System.out.println("Min element is: " + minimum);
        int maximum = maxElement(items);
        System.out.println("Max element is: " + maximum);
        int plusnumbers = positiveNumbers(items);
        System.out.println("Number of positive numbers is: " + plusnumbers );
        int minusnumbers = negativeNumbers(items);
        System.out.println("Number of negative numbers is: " + minusnumbers );

    }
    public static int sum(int[][] elements){
        int summary = 0;
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                summary += elements[i][j];



            }
        }
        return summary;

    }
    public static double average(int[][] items){
       double avrg = 0;
        for (int i = 0; i < items.length ; i++) {
            for (int j = 0; j < items.length; j++) {
                avrg += items[i][j];


            }

        }
        return avrg / Math.pow(items.length, 2);
    }
    public static int minElement(int[][]numbers){
        int minNumber = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(numbers[i][j] < minNumber){
                    minNumber = numbers[i][j];

                }

            }
        }

        return minNumber;
    }
    public static int maxElement(int[][]numbers) {
        int maxNumber = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i][j] > maxNumber) {
                    maxNumber = numbers[i][j];
                }

            }
        }
        return maxNumber;
    }
    public static int positiveNumbers(int[][]elem) {
        int positive = 0;
        for (int i = 0; i < elem.length; i++) {
            for (int j = 0; j < elem.length; j++) {
                if (elem[i][j] >= 0) {
                    positive++;
                }

            }
        }
        return positive;
    }
    public static int negativeNumbers(int[][]elem) {
        int negative = 0;
        for (int i = 0; i < elem.length; i++) {
            for (int j = 0; j < elem.length; j++) {
                if (elem[i][j] < 0) {
                    negative++;
                }

            }
        }
        return negative;
    }



}




