/**
 * soal3
 */
public class soal3 {
  public static void main(String[] args) {
    int total = 0;
    double average = 0;
    for (int i = 0; i <= 500; i++) {
      total += i;
      if (i == 500) {
        average = total / 500.0;
      }
    }

    System.out.printf("Total: %d%nRata-rata: %.1f", total, average);
  }
}
