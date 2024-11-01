import java.util.Scanner;

public class soal2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] inputScore = new int[11];

    int i = 0;
    while (i < 11) {
      System.out.print("masukan bilangan bulat ke-" + (i + 1) + ": ");
      inputScore[i] = input.nextInt();

      i++;
    }
    input.close();

    i = 0;
    while (i < 11) {
      String result = "sama dengan";

      if (inputScore[i] > inputScore[10]) {
        result = "lebih besar";

      } else if (inputScore[i] < inputScore[10]) {
        result = "lebih kecil";

      }

      System.out.printf("\nBilangan ke-%d %s dari bilangan ke-11", i + 1, result);

      i++;
    }

  }
}
