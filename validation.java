import java.util.Scanner;

public class validation {

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner in = new Scanner(System.in);

        String name1;
        String name2;
        int password1;
        int password2;

        System.out.println("Pls choose a username");
        name1 = in.nextLine();

        System.out.println("Reenter ur username pls");
        name2 = in.nextLine();

        System.out.println("Pls choose a password");
        password1 = in.nextInt();

        System.out.println("Reenter ur password pls");
        password2 = in.nextInt();

        if (name1.equals(name2) && password1 == password2) {
            System.out.println("Enter is succesfull");
        } else if (!(name1.equals(name2)) && password1 == password2) {
            System.out.println("username denied");

        } else if (name1.equals(name2) && password1 != password2) {
            System.out.println("password denied");

        }

        else {
            System.out.println("Your access has been denied");
        }

    }

}
