import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        // get 5 numbers from user
        // keep it in a array
        // order them
        // eg user entered 3, 2, 4 ,1 and 5
        // output is 1,2,3,4,5
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int a, b, c, d, e;

        // Prompt the user to enter three floating-point numbers
        System.out.println("Please enter five numbers:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        e = scanner.nextInt();

        // Display inputs in sorted order
        System.out.println("The inputs in sorted order are:");
        for (int i = 0; count != 5; i++) {
            if (i == a || i == b || i == c || i == d || i == e) {
                System.out.println(i);
                count++;
            }

        }
    }
}