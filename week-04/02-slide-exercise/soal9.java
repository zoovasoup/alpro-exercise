import java.util.Scanner;

public class soal9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    boolean kartu, diskon = false, cashback = false;
    System.out.println("masukan total belanja dan ketersedian membuat kartu (contoh 100000 true): ");
    int totalBelanja = input.nextInt();
    kartu = input.nextBoolean();
    input.close();
    cashback = false;

    if (totalBelanja >= 100000) {

      totalBelanja = totalBelanja * 9 / 10;
      diskon = true;
    }

    if (totalBelanja >= 200000 && kartu) {
      totalBelanja -= 75000;
      cashback = true;
    }

    System.out
        .println("\nKartu? " + kartu + "\nDiskon? " + diskon + "\nCashback? " + cashback + "\nRp. " + totalBelanja);
  }

}
