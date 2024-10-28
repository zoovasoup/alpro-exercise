import java.util.Scanner;

/**
 * soal4
 */
public class soal6 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("masukan banyak bilangan: ");
    int n = input.nextInt();

    int total = 1;
    int i = 0;
    System.out.println("\nmasukan bilangan: ");
    while (i < n) {
      int m = input.nextInt();
      total *= m;
      i++;
    }
    input.close();
    System.out.println("\ntotal perkalian: ");
    System.out.println(total);

  }
}
