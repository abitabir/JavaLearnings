package learnjavaiodaliwbook.chapter6;

public class LoopingStatements { //the four most commonly used looping statements in Java
    public static void main(String[] args) {
        //for statement (executes a block of code repeatedly until the test condition is no longer valid) syntax
        /* for (initial value; test condition; modification to value) {
            Do Some Task
        } */
        //for statement demo 1
        for (int i = 0; i <= 5; i++) { //first things first: declaring and initialising an integercontaining variable named i; testing if i is smaller than or equal to 5 - if true statements within curly braces will be executed; after outputting i, program increments value of i by 1;
            // after the increment, program tests i against the condition, carrying out block of statements then incrementing, then testing... and so on - this process of testing and incrementing the loop counter is repeated until the condition i < 5 is no longer true, after which the program exits the for statement and continues to execute other commands after the statement
            System.out.println(i);
        }
        //for statement demo 2
        int[] myNumbers = {10, 20, 30, 40, 50}; //for statement commonly used to loop through an array
        for (int i = 0; i < myNumbers.length;  i++) { //remember last element of array is at index 4 which is less than myNumbers.length (which is 5), so iterated through whole array
            System.out.println(myNumbers[i]);
        }

        //enhanced for statement (can also use this statement when working with arrays and Collections, very useful for when we want to get information from an array without making any changes to it) syntax
        /*for (variable declaration : name of array) {
        }*/
        //enhanced for statement demo
        for (int item : myNumbers) { //kinda like the equivalent of Python's for i in myNumbers c/f Python's for i in range(len(myNumbers))
        //here, we declared an int variable item; the first time the loop runs, the integer 10 is assigned to item;
        // the subsequent times the loop runs, the next element in the myNumbers array is assigned to the variable item - this continues until all the elements in the array have been printed.
            System.out.println(item);
        }

        //while statement (repeatedly executes instructions inside the loop while a certain condition remains valid) syntax {note: every for loop can be written as a while loop and vice versa}
      /*while (condition is true) {
            do A
        } */
        //most of the time when we use a while statement, we first need to declare a variable to function as a loop counter
        //while statement demo
        int counter = 5;
        while (counter > 0) { //the statements inside the curly braces are executed again and again as long as counter is less than zero - if false, then loop is stahped
            System.out.println("counter = " + counter);
            counter -= 1; //this line is crucial, decreasing the value of counter by one in every iteration - we need this line so that this condition (counter > 0) will eventually evaluate to false
            //if we forget to think of closing the loop, the loop will continue to run endlessly, resulting in a nasty infinite loop
            // - program will keep printing 'counter = 5' until you somehow kill the program - an unpleasant experience especially if you have a looot of code to scour through for the mishap, hum
        }

        //do while statement (similar to while loop statement, with the difference that the code within the curly braces is executed at least once) syntax
      /*do {
            do A //basically, it carries out the block of code within the curly braces before checking to see if the condition is true, and continuing the loop if it is, but breaking free of the loop if it isn't {basically n + 1 ye get me sigma notation}
        } while (condition is true); */
        //do while statement demo
        counter = 100; //reassigning counter from demos above to 100 - possible to reassign in methods but not in classes
        do {
            System.out.println("counter = " + counter);
            counter++;
        } while (counter<0); //as the test condition (while (counter<0)) is placed after the closing curly brace, it is tested after the code inside the curly braces is executed
        // and as 101 < 0 is false, the program exits the loop having performed the block of code within the curly braces only once
        //even though the original value of counter did not meet the test condition (counter < 0), the code inside the curly braces is still executed once
        // note that for a do while statement, a semi-colon (;) is required after the test condition =0

    }
}
