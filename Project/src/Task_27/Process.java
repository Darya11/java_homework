package Task_27;

import java.util.Arrays;

public class Process {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 5, -1, 9, 8};

        try {
            processPositiveNumbers(numbers, '+');
        }catch (NonZeroArgsException e){
            e.printStackTrace();
        }
        finally {
            System.out.println(Arrays.toString(numbers));
        }
    }
    public static long processPositiveNumbers(int[] nums, char op) throws NonZeroArgsException {
        long result = 0;
        for (int num : nums) {
            if (num < 0) {
                throw new NonZeroArgsException("Arguments are less zero.");
            }
            switch (op) {
                case '+' :
                    result += num;
                    break;
                case '-' :
                    result -= num;
                    break;
                case '*':
                    result *= num;
                    break;
                default:
                    throw new InvalidOperationException("Not supported operation.");
            }
        }
        System.out.println(result);
        return result;
    }

}
