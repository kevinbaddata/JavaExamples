import java.util.Scanner;

public class LoopandArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // int[] list = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // int sum = 0;
        // for (int i = 0; i < list.length; i++) {
        // sum = sum + list[i];
        // }
        // System.out.println("Sum:" + sum);

        int[] list = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        int i = 0;
        while (i < list.length) {
            sum = sum + list[i];
            i++;
        }
        System.out.println("Sum:" + sum);

        // To do For will be while both of them

        String[] names = { "Kaitlan", "Weir", "Dora", "Ayala", "Maya", "Zuniga", "Jozef", "Spears", "Harlee", "Walter",
                "Kacey", "Fields", "Marianna", "Decker" };

        System.out.println("Pls enter a name");
        String name = scanner.nextLine();

        int j = 0;
        while (j < names.length) {
            if (name.equals(names[j])) {
                System.out.println("Name found!");
                System.out.println(j + 1);
            }
            j++;
        }

        // for (int j = 0; i < names.length; j++) {
        // if (name.equals(names[j])) {
        // System.out.println("Name found!");
        // System.out.println(j + 1);

        // }
        // }

    }
}