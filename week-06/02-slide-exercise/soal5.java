import java.util.Scanner;

/**
 * soal4
 */
public class soal5 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("masukan nilai n dan m: ");
    int n = input.nextInt();
    int m = input.nextInt();
    input.close();

    if (n < m) {
      int total = 0;
      System.out.println("\ntotal bilangan: ");
      while (n <= m) {
        total += n;
        n++;
      }
      System.out.println(total);
    } else {
      System.out.println("invalid... n > m");
    }
  }
}
