package learnjavaiodaliwbook.chapter5;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //Scanner reader = new Scanner(System.in); //creating new Scanner object and passing System.in as an argument into it
        //'System.in' denotes to the compiler that you want to get input from the standard input device, usually a keyboard

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int myInt = input.nextInt(); //the .nextInt() method is used to read the integer
        //int myInt2 = String.parseString(input.next()); to convert input.next() which defaults to String object type into int primitive type
        System.out.printf("%nSo you entered %d, did you now. How about a double now: ", myInt); //here we use printf method to display the user input
        double myDoub = input.nextDouble(); //the next double that comes along is assigned to myDoub
        System.out.printf("%nDid you mean to enter %.2f (to 2dp)? Enter y for yes or n for no. ", myDoub);
        input.nextLine(); //without this line, the user doesn't get a chance to key in any string, and myStr stores "", ie "\n" {newline character}
        // that is basically entered by the enter key when the user acc submitted their input to the earlier .myDouble() method
        //both .nextInt() and .nextDouble() only read in an int or a double respectively, and do not consume the ""/"\n" - by defacto are able to
        // ignore the lines '\n' entered via the escape/enter key before them since it does not fit into the criteria of what they are looking for
        String myStr = input.nextLine(); //in calling the .nextLine() method twice, the first call consumes this unwanted newline character and the second call gets to the line we need
        System.out.printf("%nYou entered \"%s\", you did, own up to it, dint ye? {now this one's rhetorical, toodles + buhbyeooo}", myStr);

        //so, whenever we need to use the nextLine() method after the nextDouble() method, we should always have an additional nextLine() method to consume the
        //previous newline character; the same applies to the nextInt() method, amongst others (nextByte(), nextShort(), nextLong(), nextFloat(), nextBoolean()),
        // and each of these methods expect to read in values of their respective data types (e.g .nextDouble() expects to read in a double)
        // but if user enters not a value of the correct datatype, the method will attempt to convert the input into the correct datatype; if failing this, the method result in an error;

    }
}
