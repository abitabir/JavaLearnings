package learnjavaiodaliwbook.chapter4;

public class DataTypes {
    //primitive type variables store the actual data c/f reference type variables store addresses/references to the data - does
    // not tell compiler value of data, tells where to find value of data

    String message = "Hello"; //here the variable (name) 'message' does not acc store the string "Hello"
    // instead string "Hello" is created and stored elsewhere in the computer’s memory and
    // the variable message stores the address of that memory location
    //strings are immutable (in Java and most other languages), meaning the value of a string cannot be changed
    //note: cannot reassign variable outside of a method - psvm or nonpsvm method
    String messageWithWhiteSpace = "   He l l    o    ";
    boolean isEqual = (messageWithWhiteSpace.replaceAll("\\s+", "")).equals(message); //stores true
    //wouldn't remove \n whitespace from string
    //note: "" is not a char so '' is invalid
    //note: the regexes \\s and \\s+ are not the same: former matches single whitespace character, latter matches sequence of one or more whitespace characters (as in one whitespace and subsequent)
    //in this case matters not which one being used, but from although it would be better to use \\s+ from an efficiency point of view, but if you were replacing with a non-empty string, the two would behave differently

    public void reassign() {
        message = "World"; //i.e when we update a string variable the compiler does not acc go to the location
    }
    // where "Hello" is stored to change its value to "World", instead, it creates a new string "World" and
    // stores it somewhere else in the computer’s memory, the new address of this is then assigned to message
    // so now there are two strings now: "Hello" and "World", with message storing the address of "World"
    // and if "Hello" is no longer needed in the program, it is eventually destroyed so as to free up that memory
    // location - this process is known as garbage collection and is handled automatically by Java =0

}
