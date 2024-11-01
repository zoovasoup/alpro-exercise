import java.util.Scanner;

public class soal2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] inputScore = new int[11];

    for (int i = 0; i < 11; i++) {
      System.out.print("masukan bilangan bulat ke-" + (i + 1) + ": ");
      inputScore[i] = input.nextInt();

    }

    input.close();

    for (int j = 0; j < inputScore.length; j++) {
      String result = "sama dengan";

      if (inputScore[j] > inputScore[10]) {
        result = "lebih besar";

      } else if (inputScore[j] < inputScore[10]) {
        result = "lebih kecil";

      }

      System.out.printf("\nBilangan ke-%d %s dari bilangan ke-11", j + 1, result);

    }

  }
}
