package learnjavaiodaliwbook.chapter4;

public class ReferenceDataType {
    public static void main(String[] args) { //main() method
        String text = "Hello World";
        int myLength = "Hello World".length();
        String lowCase = text.toLowerCase(); //can replace actual string with variable name holding String
        String upCase = text.toUpperCase();
        String remainingSubstring = "Hello World".substring(6); //prints remaining string from index 6 onwards
        String alternateSubstring = "Hello World".substring(3, 4); //prints string from index 3 to before 4 (compiler stops at position 4)
        char myCharmander = text.charAt(7);
        boolean identicalTextOrNot = text.equals("Hullo World"); //identicalTextOrNot holds False
        String[] arrayOfStrings = text.split(" "); //regex = regular expression

        System.out.println(text);
        System.out.println(myLength);
        System.out.println(lowCase);
        System.out.println(upCase);
        System.out.println(remainingSubstring);
        System.out.println(alternateSubstring);
        System.out.println(myCharmander);
        System.out.println(identicalTextOrNot);
        System.out.println(arrayOfStrings); //this prints array of strings without formatting it,
        // from the object class from which all objects extend [if you access it you get this:
        // public String toString() { return getClass().getName() + "@" + Integer.toHexString(hashCode()); } ],
        // but does not have user friendly implementation, so we can do the following:

        for (int i = 0; i < arrayOfStrings.length; i++) { //this is a rough implementaion of @Overide toString()
            if (i == 0) {
                System.out.print("{");
            }
            System.out.print("\"" + arrayOfStrings[i] + "\"");
            if (i != arrayOfStrings.length - 1) {
                System.out.print(", ");
            } else {
                System.out.print("}");
            }
        }


    }
}
