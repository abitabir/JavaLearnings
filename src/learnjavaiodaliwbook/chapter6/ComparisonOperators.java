package learnjavaiodaliwbook.chapter6;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ComparisonOperators {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int x = reader.nextInt();
        System.out.println("Enter another integer: ");
        int y = reader.nextInt();
        if (x == y) { //if the value that x holds is equal to the value that y holds, this statement evaluates to a true, and so the statement below shall be outputted
            System.out.println("The two integers you entered were the same!");
        } else if (x != y) { //could just use else instead of evaluating the condition again because if they aren't the same, they aren't the same (control statement order), but here I'm recording all the comparison operators, so wish me luck, hey
            System.out.println("The two integers you entered were not the same!");
        }
        if (x >= y) {
            System.out.println("The first integer you entered was greater than or equal to the second.");
        } else if (x > y) {
            System.out.println("Welp, it seems the former was larger than the latter.");
        }
        if (x <= y) {
            System.out.println("The first integer you entered was less than or equal to the second.");
        } else if (x < y) {
            System.out.println("Welp, it seems the former was smaller than the latter.");
        }
        if ((((x % y) == 0) || ((y % x) == 0)) && (x != y)) { //if there is no remainder (when x is divided by y OR when y is divided by x) AND x is unequal to y
            System.out.println("Your two inputs were not of the same value, and the one is a multiple of the second.");
        }
    }
}
