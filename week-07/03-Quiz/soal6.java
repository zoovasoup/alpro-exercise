import java.util.Scanner;

/**
 * soal6
 */
public class soal6 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int userInput, totalNegative = 0, totalPositive = 0;

    for (userInput = -1; userInput != 0;) {
      userInput = input.nextInt();

      if (userInput < 0) {
        totalNegative++;
      } else if (userInput > 0) {
        totalPositive++;
      }

    }

    System.out.printf("%d %d", totalPositive, totalNegative);

  }

}
