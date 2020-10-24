package learnjavaiodaliwbook.chapter6;
import java.util.Scanner;

public class DecisionMakingStatements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int armyNo = scanner.nextInt();
        String output = null; //need to initialise class variable outside of conditional scope, elsewise conditional scope
        // variable with variable name output will be initialised and destroyed once program leaves that particular conditional scope
        //so if you initialise output before the conditions, the class variable scope's output will be changed instead of a
        // condition scope specific variable being initialised and subsequently destroyed
        //treat not Java like Python!

        if (armyNo < 1) {
            output = "no army";
        } else if (armyNo < 20) {
            output = "pack";
        } else if (armyNo < 250) {
            output = "throng";
        } else if (armyNo < 1000) {
            output = "zounds";
        } else {
            output = "leigion";
        }

        System.out.print(output);

        Scanner input = new Scanner(System.in);
        //if statement syntax
/*        if (condition 1 is met) {
            do Task
        } else if (condition 2 is met) { //optional case
            do Task B
        } else if (condition 3 is met) {
            do Task C
        } else { //optional case
            do Task D
        }*/
        //if statement demo
        System.out.print("\nPlease enter your age: ");
        int userAge = input.nextInt();
        if (userAge < 0 || userAge > 100) {
            System.out.println("Invalid Age");
            System.out.println("Age must be between 0 and 100");
        } else if (userAge < 18) //note: curly braces are optional if there is only one statement to execute
            System.out.println("Sorry you are underage");
        else if (userAge < 21)
            System.out.println("You need parental consent");
        else {
            System.out.println("Congratulations!");
            System.out.println("You may sign up for the event!");
        }

        //ternary operator (simpler form of if statement) syntax
        //condition ? value to return if condition is true : value to return if condition is false;
        //ternary operator demo
        int myNumber = 3>2 ? 10:5; // if the condition (3 > 2) is true, assign value 10 to myNumber; else assign 5 to it
        //since condition is indeed true, myNumber stores the value 10

        //switch statement (similar to if statement except in that it does not work with a range of values) syntax
/*      switch (variable used for switching) { //variables that can be used for switching are: the primitive type variables byte, short, int, char, and the reference type object String (as of Java 7)
            case firstCase: //can use as many cases as you want in a switch
                do A;
                break;
            case secondCase: //when a certain statement is satisfied, everything starting from the next line is executed, until a break statement is reached
                do B;
                break; //break statement instructs the program to break out of the switch statement and continue executing the rest of the program
            default: //optional case and is executed if no other case applies
                do C;
                break;
        } */
        //switch demo
        System.out.println("Enter your grade: ");
        input.nextLine();
        String userGrade = input.nextLine().toUpperCase(); //calling two methods in the same statement
        switch (userGrade) {
            case "A+":
            case "A":
                System.out.println("Distinction"); //if userGrade == "A+" {sorry not a Java statement ~ boy, I love Python so simple yooo} OR "A" this line will be carried out cuz no break after the first case until after this line
                break;
            case "B":
                System.out.println("Merit");
                break;
            case "C":
                System.out.println("Pass");
                break;
            default:
                System.out.println("Fail");
                break;
        }

    }
}

