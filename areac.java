import java.util.Scanner;

public class areac {

    static int calculate(int number1, int number2) {
        return number1 * number2;
    }

    static int lenghtcalculate(int number1, int number2) {
        return (number1 + number2) * 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pls enter the side lenght");
            int first = scanner.nextInt();

            System.out.println("Pls enter the lenght of the other side");
            int second = scanner.nextInt();

            System.out.println("Press 1 to calculate the area");
            System.out.println("Press 2 to calculate the lenght");

            int choice = scanner.nextInt();

            if (choice == 1) {
                int area = calculate(first, second);
                System.out.println("Area => " + area);
            } else if (choice == 2) {

                int lenght = lenghtcalculate(first, second);
                System.out.println("Lenght =>" + lenght);

            } else {
                System.out.println("Wrong choice");
            }
        }

    }

    // for (int i = 1; i > 0; i++) {
    // System.out.println("Pls enter the side lenght");
    // int first = scanner.nextInt();

    // System.out.println("Pls enter the lenght of the other side");
    // int second = scanner.nextInt();

    // int area = calculate(first, second);
    // System.out.println("Area => " + area);
    // }

}
