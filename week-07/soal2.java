import java.util.Scanner;

/**
 * soal2
 */
public class soal2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int totalSaldo = 0;
    while (true) {
      int userInput = input.nextInt();

      if (userInput == 0) {
        break;
      }

      totalSaldo += userInput;
    }
    input.close();

    System.out.println("\n" + totalSaldo);

  }
}
