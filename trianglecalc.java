import java.util.Scanner;

public class trianglecalc {

    static int calculate(int a, int b, int c) {
        int s = (a + b + c) / 2;
        double result = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return (int) result;
    }

    static int lenghtcalculate(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

        while (true) {

            System.out.println("Pls enter the side lenght");
            int first = scanner.nextInt();

            System.out.println("Pls enter the lenght of the other side");
            int second = scanner.nextInt();

            System.out.println("Pls enter the lenght of the third side");
            int third = scanner.nextInt();

            System.out.println("Press 1 to calculate the area");
            System.out.println("Press 2 to calculate the lenght");

            int choice = scanner.nextInt();

            if (choice == 1) {
                int area = calculate(first, second, third);
                System.out.println("Area => " + area);
            }

            else if (choice == 2) {
                int lenght = lenghtcalculate(first, second, third);
                System.out.println("Lenght =>" + lenght);
            }

            else {
                System.out.println("Wrong choice");
            }

        }
    }
}