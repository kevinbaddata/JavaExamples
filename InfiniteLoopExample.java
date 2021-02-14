import java.util.Scanner;

public class InfiniteLoopExample {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("\033[H\033[2J");
    System.out.flush();

    String input = "1 2 3 oops 4 5 6";
    Scanner sc = new Scanner(input);
    while (sc.hasNext()) {
      if (sc.hasNextInt()) {
        int num = sc.nextInt();
        System.out.println("Got " + num);
      } else {
        System.out.println("it wont stop");
      }
    }

  }
}
