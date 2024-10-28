import java.util.Scanner;

/**
 * soal4
 */
public class soal4 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("masukan nilai n dan m: ");
    int n = input.nextInt();
    int m = input.nextInt();
    input.close();

    if (n < m) {
      ;
      System.out.println("\nderet bilangan: ");
      while (n <= m) {
        System.out.println(n);
        n++;
      }
    } else {
      System.out.println("invalid... n > m");
    }
  }
}
