package com.company;

public class Main
{
    public static void main(String[] args)
    {
//        for (int i=8;i>1;i--){
//            double x = calculateInterest(10000, i);
//            System.out.println("10,000 at " + i + "% is = " + x);
        int count = 1; int sum=0;
        for (int i = 1; (i <= 1000 && count<6); i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
               count++;
               System.out.println("Value of i = " + i);
                sum=sum+i;
            }
        }
        System.out.println("The sum is = " + sum);
    }
}
// 45. The Switch statement Challenge/practice 
//    printDayOfTheWeek(-1); printDayOfTheWeek(1);
//        printDayOfTheWeek(0); printDayOfTheWeek(3);
//        printDayOfTheWeek(9); printDayOfTheWeek(6);
//    }
//    public static double calculateInterest(double amount, double interesRate){
//
//        return (amount*(interesRate/100));
//
//    }
//	public static void printDayOfTheWeek(int day){
//
//	    switch (day) {
//            case 1:
//                System.out.println("Monday");  break;
//            case 2:
//                System.out.println("Tuesday"); break;
//            case 3:
//                System.out.println("Wednesday"); break;
//            case 4:
//                System.out.println("Thursday"); break;
//            case 5:
//                System.out.println("Friday"); break;
//            case 6:
//                System.out.println("Saturday"); break;
//            case 7:
//                System.out.println("Sunday"); break;
//            default:
//                System.out.println("Invalid Input");
//        }
//    }

//}
