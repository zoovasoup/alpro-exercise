import java.util.Scanner;

public class digitGanda {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Masukan nilai: ");
    int userInput = input.nextInt();
    input.close();

    int d1 = userInput / 10;
    int d2 = userInput % 10;

    System.out.println(d1 * 1000 + d1 * 100 + d2 * 10 + d2);
  }
}
