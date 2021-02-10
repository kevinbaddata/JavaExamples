public class arithmeticmethods {
    static void add(int number1, int number2) {
        System.out.println(number1 + number2);
    }

    static void multiply(int number3, int number4) {
        System.out.println(number3 * number4);

    }

    static void minus(int number5, int number6) {
        System.out.println(number5 - number6);

    }

    static void division(int number7, int number8) {
        System.out.println(number7 / number8);

    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        add(3, 5);
        multiply(10, 10);
        minus(99, 56);
        division(50, 5);
    }
}