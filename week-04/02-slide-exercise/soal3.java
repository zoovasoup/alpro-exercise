import java.util.Scanner;

/**
 * soal3
 */
public class soal3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, b, c;

    System.out.println("masukan nilai sisi: (contoh: 1 2 3)");
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();
    input.close();

    String result = "segitiga sama kaki";

    if (a == b && b == c && c == a) {
      result = "segitiga sama sisi";
    } else if (a != b && b != c && c != a) {
      result = "segitiga sembarang";
    }

    System.out.println(result);

  }
}
