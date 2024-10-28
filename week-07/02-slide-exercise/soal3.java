import java.util.Arrays;
import java.util.Scanner;

/**
 * soal3
 */
public class soal3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] userInput = input.nextLine().split(" ");
    input.close();

    int[] userInputArray = new int[userInput.length];

    int i = 0;
    while (i < userInput.length) {
      userInputArray[i] = Integer.parseInt(userInput[i]);

      if (userInputArray[i] < 0 || userInputArray[i] > 50) {
        System.out.println("invalid input.");
        return;
      }

      i++;
    }

    if (userInputArray[userInput.length - 1] != 0) {
      System.out.println("invalid input.");
      return;
    }

    Arrays.sort(userInputArray);

    i = 1;
    int numberCount = 0;
    int currentNumber = -1;
    while (i < userInput.length) {

      if (currentNumber != userInputArray[i] && currentNumber != -1) {
        System.out.printf("%n%d muncul %d kali", currentNumber, numberCount);
        numberCount = 0;
      }

      currentNumber = userInputArray[i];
      numberCount++;

      i++;
    }
    System.out.printf("%n%d muncul %d kali", currentNumber, numberCount);

  }
}
