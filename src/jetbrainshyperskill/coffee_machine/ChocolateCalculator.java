package jetbrainshyperskill.coffee_machine;

import java.util.Scanner;

public class ChocolateCalculator {
    /*
    Imagine a chocolate bar. Remember how it is usually split into smaller bits by a special grid? Now think of chocolate as an N x M rectangle divided into little segments: N segments in length and M in width. Each segment is 1x1 and unbreakable. Find out whether it is possible to break off exactly K segments from the chocolate with a single straight line: vertical or horizontal. Input data format The program gets an input of three integers: N, M, K. Output data format The program must output one of the two words: YES or NO. Sample Input 1: 4 2 6 Sample Output 1: YES Sample Input 2: 2 10 7 Sample Output 2: NO Sample Input 3: 7 4 21 Sample Output 3: YES
     */

    private static final String NO = "NO"; //private means cannot be accessed/changes/isn't visible outside of this class, public means can be accessed outside of the class, static tells you whether it belongs to instance or class, final means cannot be changed anywhere not even inside the class - it is a constant
    private static final String YES = "YES";

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt(), k = scanner.nextInt();
        if (doesBreakingHorizontallyIterativelyGiveChocolateChunkOfDesiredNumber(n, m, k) == true ||
                doesBreakingVerticallyIterativelyGiveChocolateChunkOfDesiredNumber(n, m, k) == true) {
            System.out.println(YES);
        } else {
            System.out.println(NO);
        }
    }

    private static boolean doesBreakingHorizontallyIterativelyGiveChocolateChunkOfDesiredNumber(int length, int width,
                                                                                         int desiredNumberOfSegmentsInChunk) {
        int currentNumberOfSegmentsInChunk = 0;
        for (int n = 0; n < length; n++) {
            currentNumberOfSegmentsInChunk = n * width;
            if (currentNumberOfSegmentsInChunk == desiredNumberOfSegmentsInChunk) {
                return true;
            }
        }
        return false;
    }

    private static boolean doesBreakingVerticallyIterativelyGiveChocolateChunkOfDesiredNumber(int length, int width,
                                                                                       int desiredNumberOfSegmentsInChunk) {
        int currentNumberOfSegmentsInChunk = 0;
        for (int m = 0; m < length; m++) {
            currentNumberOfSegmentsInChunk = m * length;
            if (currentNumberOfSegmentsInChunk == desiredNumberOfSegmentsInChunk) {
                return true;
            }
        }
        return false;
    }

    //import java.util.Scanner;

    public class ChocolateCalculatorCutRightDown {
        public void main(String... args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            if (k <= m*n && (k % m == 0 || k % n == 0)) { //and takes precedence over or; basically, if k is a multiple of either height and width and is also less than the number of total segments in the chocolate bar, it passes
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }


}
