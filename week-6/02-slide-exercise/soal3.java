import java.util.Scanner;

/**
 * soal2
 */
public class soal3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int totalSum = 0;
    int userScore = 1;

    System.out.println("masukan nilai: ");
    while (userScore != 0) {
      userScore = input.nextInt();
      if (userScore != 0) {
        totalSum += userScore;
        ;
      }
    }
    input.close();

    System.out.println(totalSum);
  }
}
