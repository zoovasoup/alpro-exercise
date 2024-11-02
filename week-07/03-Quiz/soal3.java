import java.util.Scanner;

/**
 * soal3
 */
public class soal3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int stages = input.nextInt();

    String userInput = input.next();
    int scoreA = 0, scoreB = 0;

    if (userInput.matches("[gkb]+") && userInput.length() / 2 == stages) {
      for (int i = 0; i < userInput.length() - 1; i += 2) {

        char a = userInput.charAt(i);
        char b = userInput.charAt(i + 1);

        if (a == 'g' && b == 'k' || a == 'k' && b == 'b' || a == 'b' && b == 'g') {
          scoreA++;
        } else {
          scoreB++;
        }
      }

      System.out.println(scoreA + " " + scoreB);
    } else {
      System.out.println("invalid");
    }

    input.close();
  }
}
