public class GetSeason {
    public static void checkSeason(int number) {
        System.out.print("Your season is: ");

        String season;
        if (number == 1 || number == 2 || number == 12) {
            season = "winter";
        } else if (number == 3 || number == 4 || number == 5) {
            season = "spring";
        } else if (number == 6 || number == 7 || number == 8) {
            season = "summer";

        } else if (number == 9 || number == 10 || number == 11) {
            season = "autumn";

        } else
            season = "wrong number!";
        System.out.println(season);

    }

    public static void checkSeason1(int number1) {
        System.out.print("Your season is: ");
        String season1;
        switch (number1) {
            case 1:
            case 2:
            case 12:
                season1 = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season1 = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season1 = "summer";
                break;
            case 9:
            case 10:
            case 11:
                season1 = "autumn";
                break;
            default:
                season1 = "Your number is wrong!";
        }
        System.out.println(season1);



    }

}
