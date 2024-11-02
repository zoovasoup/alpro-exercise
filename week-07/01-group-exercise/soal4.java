import java.util.Arrays;

public class soal4 {
  public static void main(String[] args) {
    int n = 50;
    boolean[] primeNumber = new boolean[n + 1];

    Arrays.fill(primeNumber, true);
    primeNumber[0] = false;
    primeNumber[1] = false;

    for (int i = 2; i * i < n; i++) {
      if (primeNumber[i]) {
        int multipleNumber = i * i;
        while (multipleNumber <= n) {
          primeNumber[multipleNumber] = false;
          multipleNumber += i;
        }
      }
    }

    for (int j = 2; j < n; j++) {
      if (primeNumber[j]) {
        System.out.print(j + " ");
      }
    }

  }
}
