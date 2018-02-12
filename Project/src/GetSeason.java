public class GetSeason {
    public static String checkSeason(int number) {
        System.out.print("Your season is: ");

        String season = "";
        if (number == 1 || number == 2 || number == 12) {
            season = "winter";
            System.out.println(season);
        } else if (number == 3 || number == 4 || number == 5) {
            season = "spring";
            System.out.println(season);
        } else if (number == 6 || number == 7 || number == 8) {
            season = "summer";
            System.out.println(season);

        } else if (number == 9 || number == 10 || number == 11) {
            season = "autumn";
            System.out.println(season);

        } else
            System.out.println("wrong number!");
        return season;

    }

    public static String checkSeason1(int number1) {
        System.out.print("Your season is: ");
        String season1 = "";
        switch (number1) {
            case 1:
            case 2:
            case 12:
                season1 = "winter";
                System.out.println(season1);
                break;
            case 3:
            case 4:
            case 5:
                season1 = "spring";
                System.out.println(season1);
                break;
            case 6:
            case 7:
            case 8:
                season1 = "summer";
                System.out.println(season1);
                break;
            case 9:
            case 10:
            case 11:
                season1 = "autumn";
                System.out.println(season1);
                break;
            default:
                System.out.println("Your number is wrong!");
        }
        return season1;



    }

}
