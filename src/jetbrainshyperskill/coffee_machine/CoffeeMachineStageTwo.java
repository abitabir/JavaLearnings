package jetbrainshyperskill.coffee_machine;
import java.util.Scanner;
//One cup of coffee made on this coffee machine contains 200 ml of water, 50 ml of milk, and 15 g of coffee beans.
public class CoffeeMachineStageTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need: \n");
        int cups = scanner.nextInt();
        int water_in_ml = 200*cups, milk_in_ml = 50*cups, coffee_beans_in_g = 15*cups;
        System.out.println("For " + cups + " cups of coffee you will need to provide me:\n" + water_in_ml + "ml of water\n"
                + milk_in_ml + "ml of milk\n" + coffee_beans_in_g + "g of coffee beans");
        System.out.println("Starting to make a coffee\nGrinding coffee beans\nBoiling water\nMixing boiled water with crushed coffee beans\nPouring coffee into the cup\nPouring some milk into the cup\nCoffee is ready!");
    }
}
