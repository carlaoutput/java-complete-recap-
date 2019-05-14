
import java.lang.String;

public class overloading
{
    private static final String INVALID_INPUT = "Invalid imput value";

    public static void main(String[] args)
    {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(30, 61));
        System.out.println(getDurationString(65, 9));
    }
    public static String getDurationString(long minutes, long seconds)
    {
        if ((minutes >= 0) && (seconds >= 0 && seconds <= 60)) {
            long hour = minutes / 60;
            long minRemaining = (minutes % 60);

            String hourString = hour + "h ,";
            if (hour<10){
                hourString = "0" + hourString;
            }
            String minuteString = minRemaining + "m, ";
            if (minRemaining<10){
                minuteString = "0" + minuteString;
            }
            String secString = seconds + "s. ";
            if (seconds<10){
                secString = "0" + secString;
            }
            return hourString + minuteString + secString;
        } else {
            return INVALID_INPUT;
        }
    }

    public static String getDurationString(long seconds2) {
        if (seconds2 >= 0) {
            long minutes = seconds2 / 60;
            long secRemaining = seconds2 % 60;
            return getDurationString(minutes, secRemaining);
        } else {
            return INVALID_INPUT;
        }
    }
}
//    public static void main(String[] args)
//    {
//        int NewScore = calculateScore("Tim", 500);
//        System.out.println("New Score is " + NewScore);
//        calculateScore(75);
//        calculateScore("Carla",100);
//        calculateScore();
//        calcFeetAndInchesToCentimeters(6,0);
//        calcFeetAndInchesToCentimeters(157);

//    }
//}
//    public static int calculateScore(String playerName, int score)
//    {
//        System.out.println("Player " + playerName + " scored " + score + " points");
//        return score * 1000;
//    }
//    public static int calculateScore(int score)
//    {
//        System.out.println("Unname Player scored " + score + " points");
//        return score * 1000;
//    }
//    public static int calculateScore()
//    {
//        System.out.println("NO parameter Player scored ");
//        return 0;
//    }
//// Challenge overloading = calcFeeAndInchesToCentimeters
//    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
//    {
//            if ((feet >= 0) && (inches >=0 && inches <=12))
//            {
//                double centimeters = (feet * 12) * 2.54;
//                centimeters = centimeters + inches * 2.54;
//                System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm ");
//
//                return centimeters;
//            }
//            else{
//                System.out.println("Invalid feet or inches parameters");
//                return -1;
//            }
//    }
//    public static double calcFeetAndInchesToCentimeters(double inchs) // 1 foot = 12 inch
//    {
//        if (inchs >= 0)
//        {
//            double feet = (int) inchs / 12;
//            double remainingInches = (int) inchs % 12;
//            System.out.println(inchs + " inches is = to "+ feet + " feet and "+remainingInches+" inches");
//            return calcFeetAndInchesToCentimeters(feet, remainingInches);
//        }
//        else{
//            System.out.println("Invalid parameter ");
//            return -1;
//        }
//    }
//// Challenge overloading = Second and minutes challenge