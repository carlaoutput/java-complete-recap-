public class parsingValueFromString {

    public static void main(String[] args) {


        String numberAsString = "12345"; // convert this string into an integer

        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString +=1;
        number+=1; //12345 + 1 = 12346

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

    }



}
