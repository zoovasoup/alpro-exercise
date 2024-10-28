import java.util.Scanner;

/**
 * soal1
 */
public class soal1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    boolean loop = true;
    do {
      System.out.print("masukan nilai anda: ");
      int userInput = input.nextInt();

      String result = "Anda tidak lulus ujian.\n";

      if (userInput >= 60) {
        result = "Anda lulus ujian.\n";
      }

      if (userInput == -1) {
        loop = false;
        result = "Tidak ada nilai yang dimasukan kecuali 0.\n";
      }

      System.out.println(result);
    } while (loop);
    input.close();

  }
}
