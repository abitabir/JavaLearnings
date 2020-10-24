package learnjavaiodaliwbook.chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArraysAndListOutputting {

    public static void main(String[] args) {

        String names = "Peter, John, Andy, David";
        String[] arrayOfStrings = names.split(", "); //regex = regular expression at which array to be split
        System.out.println(arrayOfStrings); //results in array {"Peter", "John", "Andy", "David"}

        List<String> listOfStrings = Arrays.asList(arrayOfStrings); //converting array of strings into list of strings
        // {all elements in array must be of same data type} into list of strings {only strings!} as array length is fixed,
        // so cannot add more elements to it after all its space has been used up

        // Four ways of iterating:

        // 1. iterating over an array via standard for loop using index (without formatting)
        for (int i = 0; i < arrayOfStrings.length; i++) { //note: .length is a field/property, and not a method
            // (c/f as .size() is for list), as it remains unchanged for an array
            System.out.println(arrayOfStrings[i]);
        }

        // 2. iterating over a list via standard for loop using index
        for (int i = 0; i < listOfStrings.size(); i++) {
            System.out.println(listOfStrings.get(i));
        }

        // 3. iteration over an array via for each loop
        for (String string: arrayOfStrings) { //for each element of the array, assign the element to a variable called string; could replace String with more inclusive of data types var as of Java 11
            System.out.println(string);
        }

        // 4. iteration over a list via for each loop
        for (String string: listOfStrings) {
            System.out.println(string);
        }

        // 5. iteration over an array via forEach method that only takes lambda as argument
        // (most compact and snazzy and latest form of for loop)
        // functional programming introduced in Java 8 (this is Java 11)
        listOfStrings.forEach(e -> System.out.println(e)); //for list of any data type, but e will call the toString() method of that data type
        Arrays.asList(arrayOfStrings).forEach(e -> System.out.println(e)); //for array of strings (converted into list of strings first since cannot do this forEach() method (note: not loop!) with array)


    }


}
