import java.util.Scanner;

public class LoopandArray {
    public static void main(String[] args) {

        // int[] list = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // int sum = 0;
        // for (int i = 0; i < list.length; i++) {
        // sum = sum + list[i];
        // }
        // System.out.println("Sum:" + sum);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        String[] names = { "Kaitlan", "Weir", "Dora", "Ayala", "Maya", "Zuniga", "Jozef", "Spears", "Harlee", "Walter",
                "Kacey", "Fields", "Marianna", "Decker" };

        System.out.println("Pls enter a name");
        String name = scanner.nextLine();

        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                System.out.println("Name found!");
                System.out.println(i + 1);

            }
        }
    }

}
