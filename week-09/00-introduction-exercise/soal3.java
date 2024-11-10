import java.util.Scanner;

public class soal3 {
  public static void tampilkanMenuKopi() {
    System.out.println("====== MENU KOPI ======");
    System.out.println("1. Kopi Hitam - Rp 15.000");
    System.out.println("2. Kopi Susu - Rp 20.000");
    System.out.println("3. Cappuccino - Rp 25.000");
    System.out.println("4. Espresso - Rp 30.000");
    System.out.println("5. Mochaccino - Rp 35.000");
    System.out.println("=======================");
  }

  public static void main(String[] args) {
    tampilkanMenuKopi();
    Scanner input = new Scanner(System.in);

    System.out.print("Silahkan pilih nomor kopi yang ingin dipesan: ");
    int userInput = input.nextInt();
    input.close();

    String outputConfirmation = "Anda telah memesan ";

    if (userInput == 1) {
      outputConfirmation += "Kopi Hitam";

    } else if (userInput == 2) {
      outputConfirmation += "Kopi Susu";

    } else if (userInput == 3) {
      outputConfirmation += "Cappuccino";

    } else if (userInput == 4) {
      outputConfirmation += "Espresso";

    } else if (userInput == 5) {
      outputConfirmation += "Mochaccino";

    } else {
      outputConfirmation = "invalid input";
    }

    System.out.println(outputConfirmation);
  }
}
