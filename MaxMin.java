import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        // Clears console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        // Define an array
        int numbers[] = { 0, 0, 0, 0, 0 };
        int min;
        int max;

        // Get array values
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter " + (i + 1) + ". number");
            numbers[i] = scanner.nextInt();
        }

        min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("max number is " + max + " min is " + min);
    }

}