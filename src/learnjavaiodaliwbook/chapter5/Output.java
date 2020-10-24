package learnjavaiodaliwbook.chapter5;

public class Output {
    public static void main(String[] args) {
        //println vs print
        System.out.println("Hello"); //prints Hello and a line after it
        System.out.println("How are you?");
        System.out.print("Hullo! ");
        System.out.print("How are you?");

        //mathematical operations
        int number = 3;
        System.out.println(number+4);

        //method
        System.out.println("Oracle".substring(1, 4)); //prints substring from index 1 to and not including index 4 of string

        //concatenation - does no spacing
        System.out.println("Hullo! " + " " + " I do good!" + "Comparatively, how *do* you!?!");
        int result = 75;
        System.out.println("You scored " + result + " marks for yer test =0");

        //combos
        System.out.println("total of 1 and 3 is " + (1+3) + "."); //note paranthesis around mathematical expression, strongly advised
        // in this case of combos as errors, forces compiler to evaluate expression before concatenating result with other two substrings

        //escape sequences - when need to print 'unprintable' characters like tab or newline, so use backslash '\' character
        // to signify that character being printed has not usual meaning e.g "\t" prints tabline vs "t" prints ASCII character t
        //to print tab use '\t'
        System.out.println("Hello\tWorld\t=0");
        //to print newline use '\n'
        System.out.println("Hello\nWorld\n=0");
        //to print backslash character \ itself use '\\'
        System.out.println("\\o/ yaaay");
        //to print double quote " without ending string being printed use '\"'
        System.out.println("Muchu is approx 5'9\" methinks or so he says smh lollies");

        //formatting outputs - sometimes we want greater control over how we format our outputs
        //System.out.println("The answer for 5.45 divided by 3 is " + (5.45/3)); //this outputs the userunfriendly 1.8166666666666667
        // this many decimal places are probably not what we want to display to user, so use printf command
        System.out.printf("The answer for %.2f divided by %d is %.3f", 5.45, 3, 5.45/3); //this outputs 'The answer for 5.45 divided by 3 is 1.817'
        //as you can see we can pass one or more arguments into the printf method
        // the first one is the string to be formatted
        // %.2f, %d and %.3f are format specifiers that serve as placeholders for and are replaced by the arguments that follow
        // the first format specifier (%.2f) is replaced by the first argument that follows (5.45), the second (%d) by the second argument (3) etc
        //format specifiers begin with % and end with a converter (such as f or d), and between these two additional information called flags can be specified (e.g .3 or .2 etc)

        //converters
        //the integer converter d is for formatting integers such as byte, short, int and long
        System.out.printf("%d", 12); //outputs 12 (not: not on a newline)
        //note: error given if sout's println c/f printf, or if d was replaced by f, or if 12 was replace 12.9 cuz they're not floating point number
        //the floatingpointnumber converter is for formatting floating point numbers
        System.out.printf("%f", 12.9);
        //the newline converter f is for moving the cursor to the next line
        System.out.printf("%d%n%d", 12, 3); //outputs 12 and then a 3 on a newline

        //flags
        //the flag width is used to specify the total width
        System.out.printf("%8d", 51); //outputs '      51' - 6 spaces before 51 giving total width of what is printed of 8
        System.out.printf("%8.2", 8.9); //outputs '    8.90' total width of 8 again (including '.' and ' 's), but to two decimal points
        //the thousands separator flag displays numbers with ',' thousands separator
        System.out.printf("%,d", 12345); //outputs 12,345
        System.out.printf("%,.2d", 12345.678910); //outputs 12,345.68; note: cannae format including flag width sadly T.T


    }
}
