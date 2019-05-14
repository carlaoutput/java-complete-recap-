import java.util.Scanner;

public class readingUserInput { // 56 - challenge

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = 0;
        int sum = 0;

     //   while(true) { // another option that works too, w/ the break statement
        while(inputCount <10) {
            int order = inputCount +1;
            System.out.println("Enter number #" + order +":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int userInput = scanner.nextInt();
                inputCount++;

                sum = sum + userInput;

//                    if(inputCount == 10){
//                        break;
//                    }
            } else {
                System.out.println("Invalid Input ");
            }

            scanner.nextLine(); // handle end of line (the enter key)

        }// end while

        System.out.println("The sum is = " + sum);
        scanner.close();
    } // end met
} // end class