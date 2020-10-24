package learnjavaiodaliwbook.chapter4;


import java.util.ArrayList;
import java.util.List;

public class ArrayAndListCreation {

    public static void main(String[] args) {

        //how to create arrays
        int[] evenIntegers; //longwinded way: this statement declares an array of int with variable name ints, could also use C/C++ style statement: int ints[];
        evenIntegers = new int[] {2, 4, 6, 8}; //this statement creates array {2, 4, 6, 8} and assigns it to evenIntegers
        int[] oddIntegers = new int[] {1, 3, 5, 7, 9}; //shortcut syntax
        int[] integers = {1, 2, 3, 4}; //can even further simplify the statement above to this; that is, one can omit the words new int[] if you declare and initialize an array in the same statement

        String[] strings = {"Mathew", "Mark", "Luke", "John"}; //[] indicates that the variable is an array instead of a normal variable
        // String indicates that this variable contains only string objects
        int[] integers2 = {1, 2, 3, 4}; //int indicates that this variable stores int values
        float[] floats = {1.0f, 2, 3, 4}; //need to write f after int, but compiler won't complain if you don't because int can fit into float
        // (but will complain if vice versa because float cannae fit into double)
        double[] doubles = {1, 2.0, 3.00, 4.00}; //note: floating point computation has precision issues e.g rounding errors
        for (double num : doubles) {
            System.out.println(num);
        }

        List listOfStringElements = new ArrayList<>(); //must have imported the appropriate utility classes - List *and* ArrayList
        //List is an interface, and ArrayList is an (one of many, other kinds of Lists being LinkedLists and DeQues etc) implementation of List
        //List and ArrayList have loose coupling (c/f compare with the markedly less flexible close coupling that exists in inheritance between child and parent classes)
        // - loose coupling occurs when a class implements an interface - this loose coupling allows for great flexibility that Java systems are known for,
        // such that when one unit of software is changed, one does not have to change the whole module {note: abstract terms, software is an abstraction, it's not real, these are all models we have come up with to try and explain relationships and intricacies {so wordings cannae be wholly specific and true to words}
        listOfStringElements.add("Fire");
        listOfStringElements.add("Water");
        listOfStringElements.add("Earth");
        listOfStringElements.add("Lightening");
        listOfStringElements.add("Wind");
        System.out.println(listOfStringElements);


    }
}
