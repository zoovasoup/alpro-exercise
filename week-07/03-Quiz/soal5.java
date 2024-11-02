import java.util.Scanner;

/**
 * soal5
 */
public class soal5 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int jeruk = 0, mangga = 0, apel = 0;

    int banyakInput = input.nextInt();

    for (int i = 0; i < banyakInput; i++) {
      String userInput = input.next();

      if (userInput.equals("jeruk")) {
        jeruk++;
      } else if (userInput.equals("mangga")) {
        mangga++;
      } else if (userInput.equals("apel")) {
        apel++;
      }
    }
    input.close();

    System.out.printf("%d %d %d", apel, jeruk, mangga);

  }
}
