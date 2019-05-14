public class Main {

    public static void main(String[] args) { // type psv, shortcut

        long miles = SpeedConverter.toMilesPerHour(10.5);
//        miles = SpeedConverter.toMilesPerHours(10.25);
//        miles = SpeedConverter.toMilesPerHours(-5.6);
        System.out.println("Miles = " + miles); // type sout, shortcut

        SpeedConverter.printConversion(10.5);
//        SpeedConverter.printConversion(10.25);
//        SpeedConverter.printConversion(-5.6);
//        SpeedConverter.printConversion(75.114);
    }
}
