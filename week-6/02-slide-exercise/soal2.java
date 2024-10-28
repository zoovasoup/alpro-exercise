import java.util.Scanner;

/**
 * soal2
 */
public class soal2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double totalScore = 0.0;
    int userScore = 0;

    System.out.println("masukan nilai: ");
    int i = 0;
    while (userScore != -1) {
      i++;
      userScore = input.nextInt();
      if (userScore != -1) {
        totalScore = (totalScore + userScore) / i;
      }
    }
    input.close();

    System.out.println(totalScore);
  }
}
