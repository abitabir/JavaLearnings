package learnjavaiodaliwbook.chapter3;

public class TypeCasting {
    //sometimes it is necessary in programs to convert from one data type to another - this is called typecasting
    //we need not do anything explicitly when wanting to convert from a smaller datatype to a larger datatype
    // e.g from int/short to double
    short age = 10; //2 bytes
    double myDouble = age; //8 bytes
    //however when converting a large data type into smaller data type, we need to indicate this explicitly using a pair of paranthesis
    // - this is known as narrowing primitive conversion
    int x = (int) 20.9; //here we are casting a double (8 bytes) into an int (4 bytes)
    //note: narrowing conversion is not safe and should be avoided unless absolutely necessary,
    // as narrowing conversion can result in a loss of data e.g when we cast 20.9 (a non int) into an int,
    // the resulting value held by the variable x is 20, not 21; the decimal portion is truncated after the conversion.

    //can also cast double into a float (recall how all non integers are treated as double by default in Java, and so
    // if we want to assign a number like 20.9 to a float, we need to add a suffix ‘F’ to the number;
    // another way to do this is to use a cast, as follows
    float aFloat = (float) 20.9; //value of aFloat will be 20.9

}
