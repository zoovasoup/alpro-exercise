import java.util.Scanner;

/**
 * soal4
 */
public class soal4 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int score = 0;

    for (int i = 0; i < 10; i++) {
      String userInput = input.next();

      if (userInput.matches("[OT]+") && userInput.length() == 3) {

        if (userInput.matches(".*O.*")) {
          score++;
        } else {
          break;
        }

      } else {
        System.out.println("invalid");
      }
    }

    System.out.println("Poin = " + score);

    input.close();
  }
}
