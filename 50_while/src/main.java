
public class main {

    public static void main(String[] args) {

        int number = 4;
        int evenNumFound = 0;
        int lastN = 20; int numbRecorded = 0;

        while (number <= lastN) {
                number++;
                if (!isEvenNumer(number)) {
                    continue;
                }
                System.out.print("Even Numb Found = " + number + "\n");

                evenNumFound++;
                if (evenNumFound >= 5) {
                    break;
                }
        }
        System.out.print("Total Numbers found = " + evenNumFound + "\n");
    }


    public static boolean isEvenNumer (int number) {
        if (number % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

}

//            while(number<=lastN) {
//                number++;
//                    if (!isEvenNumer(number)) {
//                        continue;
//                    }
//                    else{
//                    System.out.print("The number is = " + number + " and is Even" + "\n");
//                    }
//            }