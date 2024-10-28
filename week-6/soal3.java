import java.util.Scanner;

/**
 * soal3
 */
public class soal3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Jumlah siswa: ");
    int totalStudent = input.nextInt();

    int scoreLowest = 0;
    String scoreLowestName = "";

    int scoreLowestSecond = 0;
    String scoreLowestSecondName = "";

    System.out.println("Nama dan nilai: ");
    int i = 0;
    while (i < totalStudent) {
      System.out.print("Siswa " + (i + 1) + ": ");
      String userName = input.next();
      int userScore = input.nextInt();

      if (userScore <= scoreLowest || (scoreLowest == 0 && scoreLowestSecond == 0)) {
        scoreLowestSecond = scoreLowest;
        scoreLowestSecondName = scoreLowestName;

        scoreLowest = userScore;
        scoreLowestName = userName;

      } else if (userScore < scoreLowestSecond && userScore > scoreLowest) {
        scoreLowestSecond = userScore;
        scoreLowestSecondName = userName;

      }

      i++;
    }

    System.out.printf("\nSiswa dengan nilai terendah: %s \nSiswa dengan nilai kedua terendah: %s", scoreLowestName,
        scoreLowestSecondName);
    input.close();
  }
}
