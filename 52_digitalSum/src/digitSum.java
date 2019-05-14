public class digitSum {


    public static void main(String[] args) {


       // System.out.print(sumDigits(1));
        System.out.print(" ") ;
        System.out.println("Sum of digits in 125 is = " + sumDigits(125));
        System.out.println("Sum of digits in 125 is = " + sumDigits(-125));
        System.out.println("Sum of digits in 125 is = " + sumDigits(4));
        System.out.println("Sum of digits in 125 is = " + sumDigits(32123));

    }


    public static int sumDigits(int number) {
            if (number < 10) {
                return -1;
            }
            int sum=0;

                while(number > 0){

                int n = number % 10; // ex. 125 % 10 = 5 -> extract the least sign digit
                sum = sum + n;

                number = number / 10;                // drop the least sign digit
                }
        return sum;

    } // end method sumDigts
} // end class
