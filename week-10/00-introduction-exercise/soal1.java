import java.util.Scanner;

public class soal1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int a = input.nextInt();
    int b = input.nextInt();
    input.close();

    System.out.printf("%.3f %.3f", penghitung(a, b), penghitung2(a, b));
  }

  public static Double penghitung(int a, int b) {
    double result = Math.sqrt(9 * a / 2.0);
    return result;
  }

  public static Double penghitung2(int a, int b) {
    double result = Math.sqrt(9 * b / 2.0);
    return result;
  }
}
