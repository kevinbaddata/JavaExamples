public class retrunvalues {
    static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        int x = add(3, 5);
        System.out.println(x);
    }
}