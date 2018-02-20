package Task5;

public class Task5_2 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][5];
        Task5_1.array(matrix);
        Task5_1.printArray(matrix);
        sumAndMax(matrix);

    }

    public static void sumAndMax(int [][]items) {
        int column1 = 0, column2 = 0, column3 = 0, column4 =0, column5 = 0;
        for (int i = 0; i < items.length; i++) {
            column1 += items[i][0];
            column2 += items[i][1];
            column3 += items[i][2];
            column4 += items[i][3];
            column5 += items[i][4];
            }
        System.out.println("Sum of column1 is: " + column1);
        System.out.println("Sum of column2 is: " + column2);
        System.out.println("Sum of column3 is: " + column3);
        System.out.println("Sum of column4 is: " + column4);
        System.out.println("Sum of column15 is: " + column5);

        int max [] = new int[]{column1, column2, column3, column4, column5};
        int maximum = 0;
        for (int i = 0; i < max.length; i++) {
            if(max[i]>maximum){
                maximum = max[i];
            }
        }System.out.println("Maximum sum of colums is: " + maximum);
    }

}





