package Task_8;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Press number from 1 to 12");
        int input1 = scanner.nextInt();
        if (input1<= 0 | input1 >12){
            return;
        }
        System.out.println("Press the year");
        int input2 = scanner.nextInt();
        if (input2 <= 0){
            return;
        }


        int ord = 0;
        for (Date date : Date.values()) {
            ord = date.ordinal();
            if (input1 -1 == ord ){
                System.out.print(" "+ date);
                System.out.print(" "+ input2 + " - ");
                switch (date){
                    case January: case March: case May: case July: case August: case October: case December:
                        System.out.println("31 days on that date");
                        break;
                    case April: case June: case September: case November:
                        System.out.println("30 days on that date");
                        break;
                    case February:
                        if (input2 %4 == 0 & input2 % 100 !=0 || input2 % 400 == 0){
                            System.out.println("29 days on that date");
                        }
                        else {
                            System.out.println("28 days on that date");
                            break;
                        }


                }
            }

        }

        }
    }

