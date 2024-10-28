import java.util.Scanner;

/**
 * soal2
 */
public class soal3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int totalSum = 0;
    String totalString = "";
    String userInput = input.next();

    int i = 0;
    while (i < userInput.length()) {

      char inputChar = userInput.charAt(i);

      if (inputChar == '-') {
        System.out.println("invalid input");
        return;
      }

      totalString = inputChar + " " + totalString;
      totalSum += Character.getNumericValue(inputChar);

      i++;
    }
    input.close();

    System.out.println(totalString);
    System.out.println(totalSum);

  }
}
