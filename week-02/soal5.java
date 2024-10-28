import java.util.Scanner;

/**
 * soal5
 */
public class soal5 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("masukan bilangan adik: ");
    int bilAdik = input.nextInt();
    System.out.println("masukan bilangan kaka: ");
    int bilKaka = input.nextInt();
    input.close();

    String result = "Kaka menang";

    if ((bilAdik < 0 || bilAdik > 9) || (bilKaka < 0 || bilKaka > 9)) {
      result = "input invalid";

    } else if ((bilAdik - bilKaka) % 2 != 0) {
      result = "adik menang";

    }

    System.out.println(result);
  }

}
