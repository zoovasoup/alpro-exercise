import java.util.Scanner;

/**
 * soal5
 */
public class soal5 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("pakai suwir ayam (true or false): ");
    boolean suwir = input.nextBoolean();
    System.out.println("\npakai cakue (true or false): ");
    boolean cakue = input.nextBoolean();
    System.out.println("\npakai ati (true or false): ");
    boolean ati = input.nextBoolean();
    System.out.println("\npakai telur (true or false): ");
    boolean telur = input.nextBoolean();
    input.close();

    int totalHarga = 6000;

    if (suwir == true) {
      totalHarga += 3000;
    }

    if (cakue == true) {
      totalHarga += 1500;
    }

    if (ati == true) {
      totalHarga += 4500;
    }

    if (telur == true) {
      totalHarga += 4000;
    }

    System.out.println("\n" + totalHarga);
  }
}
