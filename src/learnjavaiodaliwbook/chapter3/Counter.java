package learnjavaiodaliwbook.chapter3;

public class Counter {
    static int counter = 1; // static makes this primitive with variable name counter a member of the class,
    // so can be accessed by the main method  of class counter
    static String name = "Rijju"; //static makes this object a property/attribute of the class,
    // and so psvm and any derived objects from class can use
     String name2 = new String("Abeebee"); //this is a long winded way using the new term that is usually used in object creation,
    // above is the short and snappy usual performanced based method

    public static void main(String[] args) { //program execution begins with psvm
        //note: x++ is the same as x = x + 1; x-- is the same as x = x - 1
        System.out.println(counter); //counter = 1
        System.out.println(counter++); //first prints the original value of counter before incrementing counter by 1,
        // and counter now holds 2
        System.out.println(counter); //prints counter and counter remains unchanged, variable still holds 2
        System.out.println(++counter); //adds 1 to primitive variable counter holding int value 2, counter now holds 3,
        // then prints counter
        System.out.println(counter); //prints counter and counter remains unchanged, variable still holds 3


    }
}
