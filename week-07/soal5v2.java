import java.util.Scanner;

/**
 * soal5
 */
public class soal5v2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String userInput = input.next();
    input.close();

    if (Integer.parseInt(userInput) < 0) {
      System.out.println("invalid input. input must or higher than 0");
      return;
    }

    int lastCount = -1;
    int selisih = 1;

    int i = 0;
    while (i < userInput.length()) {

      int inputValue = Character.getNumericValue(userInput.charAt(i));

      if (lastCount != -1) {
        selisih = Math.abs(inputValue - lastCount);
      }

      if (selisih != 1) {
        System.out.printf("Selisih %d dengan %d adalah %d", lastCount, inputValue, selisih);
        return;
      }

      lastCount = inputValue;
      i++;
    }

    System.out.println("Selisih setiap digit adalah 1");
  }
}
