import java.util.Scanner;

/**
 * soal1
 */
public class soal1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String userPass = "admin";
    String userId = "admin";

    int userAttempt = 0;
    while (true) {
      String userInputId = input.next();
      String userInputPass = input.next();

      if (userInputId.equals(userId) && userInputPass.equals(userPass)) {
        System.out.println("\n" + userAttempt);
        System.out.println("login berhasil");
        break;
      }

      userAttempt += 1;
    }
    input.close();

  }

}
