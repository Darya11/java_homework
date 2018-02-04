public class MyCalc {
    public static void main(String []args){
        System.out.println("Addition result: " + add(1.8, 3.5));
        System.out.println("Subtraction result: " + sub(8.9, 6.7));
        System.out.println("Multiplication result: " + mul(23.5, 55.7));
        System.out.println("Division result: " + div(522.5, 375.2));
        System.out.println("Module result: " + mod(326.7, 221.1));
        System.out.println("Average result: " + avg(11.5, 12.3));
        System.out.println("Power result: " + pow(22.2));
        System.out.println("Percentage result: " + percent(163.8, 55.1));
        System.out.println("Cast to long result: " + castToLong(35553.67));
        System.out.println("Check sign result: " + checkSign((byte)-127));
        System.out.println("Check even number result: " + checkEvenNumber(332.51));
        System.out.println("Bit wise division by four: " + bitWiseDivByFour(2343.56));
    }
    public static double add(double val1, double val2){
        return val1 + val2;
    }
    public static double sub(double val1, double val2) {
        return val1 - val2;
    }
    public static double mul(double val1, double val2) {
        return val1 * val2;
    }
    public static double div(double val1, double val2) {
        return val1 / val2;
    }
    public static double mod(double val1, double val2) {
        return val1 % val2;
    }
    public static double avg(double val1, double val2) {
        return (val1 + val2) / 2;
    }
    public static double pow(double val1) {
        return Math.pow(val1, 2);
    }
    public static double percent(double val1, double percent) {
        return val1 * percent / 100;
    }
    public static long castToLong(double val){
        return (long) val;
    }
    public static byte checkSign(byte b){
        if(b < 0)
            return -128;
        else
            return 0;
    }
    public static int checkEvenNumber(double val){
        val = (int)val & 1;
        if(val == 1)
            return 0;
        else
            return 1;

    }
    public static long bitWiseDivByFour(double number){
        return (long) number >> 2;
    }


}
