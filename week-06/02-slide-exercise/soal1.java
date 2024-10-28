import java.util.Scanner;

/**
 * soal1
 */
public class soal1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int totalGoal = 0;
    int goal = 0;

    System.out.println("masukan banyak goal: ");
    while (goal != -1) {
      goal = input.nextInt();
      if (goal != -1) {
        totalGoal += goal;
      }
    }
    input.close();

    boolean dapatHadiah = totalGoal >= 10;

    System.out.println(dapatHadiah);
  }
}
