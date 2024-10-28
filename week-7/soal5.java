import java.util.Scanner;

/**
 * soal5
 */
public class soal5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String userInput = input.next();
    input.close();

    int lastCount = 0;
    int validation = 0;

    int i = 0;
    while (i < userInput.length()) {

      int inputValue = Character.getNumericValue(userInput.charAt(i));

      if (i == 0) {
        lastCount = inputValue;
        validation = lastCount;
      } else {
        if (inputValue > lastCount) {
          validation = inputValue - lastCount;
        } else {
          validation = lastCount - inputValue;
        }
        lastCount = inputValue;

      }

      System.out.println(lastCount + " " + inputValue);

      if (validation != 1) {
        System.out.printf("Selisih %d dengan %d adalah %d", lastCount, inputValue, lastCount - inputValue);
        break;
      }

      i++;
    }

    if (validation == 1) {
      System.out.println("Selisih setiap digit adalah 1");
    }
  }
}
