import java.util.Scanner;

public class soal5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double a, b, c, d, e;
    System.out.println("masukan 5 nilai temp (contoh 1 2 3 4 5): ");
    a = input.nextDouble();
    b = input.nextDouble();
    c = input.nextDouble();
    d = input.nextDouble();
    e = input.nextDouble();
    input.close();

    String result = "Tidak stabil";

    if (a < b && b < c && c < d && d < e) {
      result = "Stabil naik";
    } else if (a > b && b > c && c > d && d > e) {
      result = "Stabil turun";
    }

    System.out.println(result);
  }

}
