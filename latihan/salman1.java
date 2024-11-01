import java.util.Scanner;

public class salman1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int userPin = 1234;
    int attempt = 3;
    boolean valid = false;

    while (attempt != 0) {
      int userInputPin = input.nextInt();

      if (userInputPin != userPin) {
        attempt--;
      } else {
        valid = true;
        break;
      }

    }

    while (valid) {
      System.out.println("masuk coy");

    }

  }

}
