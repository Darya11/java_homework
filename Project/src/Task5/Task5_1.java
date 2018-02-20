package Task5;

public class Task5_1 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][2];
        array(matrix);
        swap(0, 1, matrix);
        printArray(matrix);
    }

    public static void array(int[][] items){
        int k= 0;
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                items[i][j] = k;
                k++;
            }
            }
    }
    public static void swap(int a, int b, int[][] elements){
        for (int i = 0; i < elements.length ; i++) {

                int temp = elements[i][a];
                elements[i][a] = elements[i][b];
                elements[i][b] = temp;
            }
        }
    public static void printArray(int[][] a) {
        for (int[] i : a) {
            for (int j : i) {
                System.out.printf("%3d", j);
            }
            System.out.println();
        }
    }
    }

