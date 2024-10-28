import java.util.Scanner;

/**
 * soal4
 */
public class soal4 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("masukan a: ");
    int a = input.nextInt();
    System.out.println("masukan b: ");
    int b = input.nextInt();
    System.out.println("masukan c: ");
    int c = input.nextInt();
    input.close();

    int result = c;

    if (a > b) {
      result = a;
    } else if (b > c) {
      result = b;
    }

    System.out.println(result);
  }
}
