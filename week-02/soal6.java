import java.util.Scanner;

/**
 * soal6
 */
public class soal6 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("masukan 4 digit kode: ");
    String[] userInput = input.next().split("");
    input.close();

    boolean diskon = false;
    boolean cashback = false;
    boolean voucher = false;

    int angkaSatu = Integer.parseInt(userInput[0]);
    int angkaDua = Integer.parseInt(userInput[1]);
    int angkaTiga = Integer.parseInt(userInput[2]);
    int angkaEmpat = Integer.parseInt(userInput[3]);

    if (angkaTiga % 2 == 0) {
      diskon = true;
    }

    if (angkaEmpat != 0 && (angkaSatu + angkaTiga) % angkaEmpat == 0) {
      cashback = true;
    }

    if (diskon != cashback) {
      voucher = true;
    }

    System.out.println(diskon + " " + cashback + " " + voucher);
  }
}
