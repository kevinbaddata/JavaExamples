import java.util.Scanner;

public class numberfinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int[] numbers = { 44, 20, 28, 37, 30, 82, 94, 73, 49, 67, 9, 5, 43, 23, 83, 50, 42, 28, 22, 50, 11, 22, 63, 62,
                16, 82, 77, 45, 63, 13, 51, 72, 26, 38, 87, 85, 38, 26, 17, 97, 6, 44 };
        int count = 0;
        System.out.println("enter a number");
        int control = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (control == numbers[i]) {
                count++;

            }

        }

        if (count == 0) {
            System.out.println("Not found");
        } else {
            System.out.println("we found your number " + count + " times");

        }

    }
}
