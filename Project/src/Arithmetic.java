public class Arithmetic {
    public static void sumNumber(int number){
        System.out.print("The sum of your number is: ");
        int sumOfNumber = 0;
        while(number > 0) {
            int r = number % 10;
            sumOfNumber += r;
            number = number / 10;
        }
        System.out.println(sumOfNumber);

    }
    public static void factorial(int number){
        System.out.print("Factorial of number " + number + " is: ");
        int i = 0;
        int k = 1;
        while (++i > 0 && i <= number ){
            k *= i;

        }
        System.out.println(k);

    }
    public static void arithmeticalProgression(int number){
        System.out.println("Arithmetical Progression from 10 to 38: ");
        while(number <=38){
            number+=2;

        }

    }
}
