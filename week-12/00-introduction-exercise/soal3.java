import java.util.Scanner;

public class soal3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int score[] = new int[input.nextInt()];
    int bestScore = 0;

    for (int i = 0; i < score.length; i++) {
      score[i] = input.nextInt();
      bestScore = (score[i] > bestScore) ? score[i] : bestScore;
    }
    input.close();

    for (int i = 0; i < score.length; i++) {
      String result = (score[i] >= bestScore - 5) ? "A"
          : (score[i] >= bestScore - 10) ? "B"
              : (score[i] >= bestScore - 15) ? "C" : (score[i] >= bestScore - 20) ? "D" : "F";

      System.out.printf("\nStudent %d score is %d and grade is %s", i + 1, score[i], result);
    }
  }
}
