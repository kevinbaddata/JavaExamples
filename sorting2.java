import java.util.Scanner;

public class sorting2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner scanner = new Scanner(System.in);

        int[] numbers = { 0, 0, 0, 0, 0 };
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter " + (i + 1) + ".number");
            numbers[i] = scanner.nextInt();

        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) { // swap elements if not in order
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
