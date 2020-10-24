package software2_practical3b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class ArrayDictionary {

    private Integer[] keys;
    private String[] values;

    public ArrayDictionary() {
        keys = new Integer[100];
        values = new String[100];
    }

    public ArrayDictionary(int size) {
        keys = new Integer[size];
        values = new String[size];
    }

//{key1:value1, key2:value2,…}

    @Override
    public String toString() {
        String returning = "{";
        for (int i = 0; i < keys.length; i++) {
            if (keys[i] != null) {
                returning += keys[i] + ": " + values[i];
            }
            if (i != keys.length - 1) {
                returning += ", ";
            }
        }
       
        returning += "}";
        return returning;

    //    public ArrayDictionary(Integer key, String value) {
//        this.key = key;
//        this.value = value;
//
//        if (key == null) {
//            throw new RuntimeException("Key can not be null");
//        }
//
//        if (value == null) {
//            throw new RuntimeException("Value can not be null");
//        }
    }

}
