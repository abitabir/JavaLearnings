package learnjavaiodaliwbook.chapter4;

import java.util.Arrays; //importing built in java package for Arrays

public class ArraysMethods {

    public static void main(String[] args) {

        //.equals()
        int[] arr1 = {0,2,4,6,8,10};
        int[] arr2 = {0,2,4,6,8,10};
        int[] arr3 = {10,8,6,4,2,0};
        boolean result1 = Arrays.equals(arr1, arr2); //should store True as are equal
        boolean result2 = Arrays.equals(arr1, arr3); //should store false as arrays are not the same
        System.out.println(result1 + " " + result2);

        //.toString() method returns String that displays/represents contents of array nicely
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers); //prints pretty much gibberish to average user
        System.out.println(Arrays.toString(numbers)); //prints somt more user friendly

        //.copyOfRange() method allows you to copy the contents of one array into another
        int [] source = {12, 1, 5, -2, 16, 14, 18, 20, 25};
        int[] dest = Arrays.copyOfRange(source, 3, 7);
        //first argument, source, is the array that provides the values to be copied
        //second and third arguments tell the compiler at which index to start before and stop copying before respectively
        //in this case elements from index 3 to index 6 are copied (but the element at index 7 is not)
        System.out.println(Arrays.toString(dest));

        //.sort()
        int [] numbers2 = {12, 1, 5, -2, 16, 14};
        Arrays.sort(numbers2); //changes numbers so that it is sorted
        System.out.println(Arrays.toString(numbers2));

        //.binarySearch() binary search is much more efficient method of searching than iterating through array or any collection, really
        int[] myInt = {21, 23, 34, 45, 56, 78, 99}; //already sorted array
        int foundIndex = Arrays.binarySearch(myInt, 78); //to find index of element 78, variable holds 5
        int foundIndex2 = Arrays.binarySearch(myInt, 39);//to find index of element 39, but not in array
        // variable holds -4 - minus indicates not found, but 4 indicates the index+1 where 39 should be if it were to be in the array
        System.out.println(foundIndex);

    }
}
