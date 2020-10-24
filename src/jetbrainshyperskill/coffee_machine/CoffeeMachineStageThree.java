package jetbrainshyperskill.coffee_machine;

import java.util.Scanner;

//One cup of coffee made on this coffee machine contains 200 ml of water, 50 ml of milk, and 15 g of coffee beans.
public class CoffeeMachineStageThree {

    private static final int WATER_IN_ML_PER_CUP = 200;
    private static final int MILK_IN_ML_PER_CUP = 50;
    private static final int COFFEE_BEANS_IN_G_PER_CUP = 15;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:\n");
        int water_in_ml = scanner.nextInt();
        int cups_per_water = water_in_ml/WATER_IN_ML_PER_CUP;
        System.out.println("Write how many ml of milk the coffee machine has:\n");
        int milk_in_ml = scanner.nextInt();
        int cups_per_milk = milk_in_ml/MILK_IN_ML_PER_CUP;
        System.out.println("Write how many grams of coffee beans the coffee machine has:\n");
        int coffee_beans_in_g = scanner.nextInt();
        int cups_per_coffee_beans = coffee_beans_in_g/COFFEE_BEANS_IN_G_PER_CUP;
        System.out.println("Write how many cups of coffee you will need:\n");
        int cups_wanted = scanner.nextInt();
        int cups_can_make = Math.min(cups_per_water, Math.min(cups_per_milk, cups_per_coffee_beans));
        if (cups_wanted > cups_can_make) {
            System.out.println("No, I can only make " + cups_can_make + " cup(s) of coffee.\n");
        } else if (cups_wanted == cups_can_make) {
            System.out.println("Yes, I can make exactly " + cups_can_make + " cup(s) of coffee.\n");
        } else { //if (cups_desired < cups_can_make)
            System.out.println("Yes, I can make " + cups_wanted + " cups(s) - and also " + (cups_can_make - cups_wanted)
                    + " cup(s) more than that!");
        }
    }
}
