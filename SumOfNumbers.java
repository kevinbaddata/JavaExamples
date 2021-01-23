import java.util.Scanner;

public class SumOfNumbers {
    // This program gives a total number count between two selected numbers
    public static void main(String[] args) {

        // Cleans the Terminal from text
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Define variables
        Scanner in = new Scanner(System.in);
        int number1;
        int number2;
        int total = 0;
        int small = 0;
        int big = 0;

        // Get number1 from user
        System.out.println("Enter first number");
        number1 = in.nextInt();

        // Get number2 from user
        System.out.println("Enter second number");
        number2 = in.nextInt();

        // Detects big and small numbers
        // If number one equals number two program will finish
        if (number1 > number2) {
            big = number1;
            small = number2;
        } else if (number1 < number2) {
            small = number1;
            big = number2;
        } else {
            System.out.println("Failed Entrance");
            System.exit(0);
        }

        // Loop starts with the small number
        // Total will add with i
        // Loop finish with the big number
        for (int i = small; i <= big; i++) {
            total = total + i;
        }

        // Give info about total
        System.out.println("The total of " + small + " between " + big + " is => " + total);
    }

}
