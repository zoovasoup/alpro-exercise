import java.util.Scanner;

/**
 * soal2
 */
public class soal2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int userInput = input.nextInt();
    input.close();

    for (int i = 0; i < userInput; i++) {

      for (int n = 0; n < i; n++) {
        System.out.print("*");

      }

        System.out.println();
    }
  }
}
