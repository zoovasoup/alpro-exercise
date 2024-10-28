import java.util.Scanner;

/**
 * soal2
 */
public class soal4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int m = input.nextInt();
    int x = input.nextInt();
    int y = input.nextInt();
    input.close();

    int totalCoffe = 0;

    if (x <= n && y <= m) {
      while (n >= x && m >= y) {
        n -= x;
        m -= y;
        totalCoffe += 1;
      }

      System.out.println(totalCoffe);

    } else {
      System.out.println("invalid input");

    }

  }
}
