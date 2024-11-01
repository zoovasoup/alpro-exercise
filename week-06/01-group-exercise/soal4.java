import java.util.Arrays;

public class soal4 {
  public static void main(String[] args) {
    int n = 50;
    boolean[] primeNumber = new boolean[n + 1];

    Arrays.fill(primeNumber, true);
    primeNumber[0] = false;
    primeNumber[1] = false;

    int i = 2;
    while (i * i <= n) {
      if (primeNumber[i]) {
        int multipleNumber = i;
        while (multipleNumber <= n) {
          primeNumber[multipleNumber] = false;
          multipleNumber += i;
        }
      }
      i++;
    }

    i = 2;
    while (i <= n) {
      if (primeNumber[i]) {
        System.out.print(i + " ");
      }
      i++;
    }
  }
}
