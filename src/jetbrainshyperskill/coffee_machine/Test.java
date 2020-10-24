package jetbrainshyperskill.coffee_machine;
import java.util.Scanner;

class Main {

    public static long sumInRange(int from, int to) {
        long total = 0;
        for (; from < to; from++) {
            total += from;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int from = scanner.nextInt();
        int to = scanner.nextInt();
        System.out.println(sumInRange(from, to));
    }


}