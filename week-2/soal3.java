import java.util.Scanner;

/**
 * soal3
 */
public class soal3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("masukan angka: ");
    int userInput = input.nextInt();
    input.close();

    String result = false + ", bukan negatif ganjil";

    if (userInput % 2 == 0 && userInput < 0) {
      result = true + ", negatif ganjil";
    }

    System.out.println(result);
  }
}
