
public class MegaBytesConverter {

//    public static boolean shouldWakeUp(boolean isbarking, int hoursOfDay) {
//
//        if (hoursOfDay < 0 || hoursOfDay > 23) {
//            System.out.println("false");
//            return false;
//        }
//        if (isbarking == true && (hoursOfDay < 8 || hoursOfDay > 22)) {
//            System.out.println("true");
//            return true;
//        }
//        System.out.println("false");
//        return false;
//    }
//    public static void main(String[] args) {
//        shouldWakeUp(true, 1);
//        shouldWakeUp(false, 2);
//        shouldWakeUp(true, 8);
//        shouldWakeUp(true, -1);
//    }
//}

//
//    public static void printMegaBytesandKiloBytes(int kiloBytes){
//
//        if(kiloBytes < 0){
//            System.out.println("Invalid Value");
//        }
//
//        int megaVal = kiloBytes / 1024;
//        int megaRemain = kiloBytes % 1024;
//        System.out.println(kiloBytes + " KB = " + megaVal + "MB and " + megaRemain + " KB");
//    }
//
//    public static void main(String[] args) {
//        printMegaBytesandKiloBytes(2500);
//        printMegaBytesandKiloBytes(-1024);
//        printMegaBytesandKiloBytes(5000);
//    }
//}
// *****************
//    public static boolean isLeapYear(int year) {
//
//        if (year < 0 || year > 9999) {
//            System.out.println("false");
//            return false; }
//
//        if (year % 4 == 0)
//        {
//            if (year % 100 == 0)
//            {
//                if (year % 400 == 0)
//                {
//                    System.out.println("true");
//                    return true;
//                }
//                System.out.println("false");
//                return false;
//
//            }
//            System.out.println("true");
//            return true;
//
//        }
//        System.out.println("false");
//        return false;
//
//    }
//    public static void main(String[] args) {
//        isLeapYear(-1600);
//        isLeapYear(1600);
//        isLeapYear(2017);
//        isLeapYear(2000);
//
//    }
//} // **************

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
    //using String substring(begIndex, endIndex):

        String st1 = Double.toString(num1);
        String st2 = Double.toString(num2);
        st1 = st1.substring(0, 5);
        st2 = st2.substring(0, 5);
//        System.out.println(st1);
//        System.out.println(st2);


        if (st1.equals(st2))
        {
            System.out.println("true");
            return true;
        }

        System.out.println("false");
        return false;

    }
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756,-3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
     //   areEqualByThreeDecimalPlaces(3.0, 3.0);
       areEqualByThreeDecimalPlaces(-3.123, 3.123);

    }
}