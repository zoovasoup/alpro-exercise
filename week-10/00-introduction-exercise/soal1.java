import java.util.Scanner;

public class soal1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int a = input.nextInt();
    int b = input.nextInt();
    input.close();

    System.out.printf("%.3f %.3f", hitung(a, b), hitung(b, a));
  }

  public static double hitung(int a, int b) {
    return Math.sqrt(9 * a / 2.0);
  }
}
