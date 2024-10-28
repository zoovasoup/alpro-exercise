import java.util.Scanner;

/**
 * soal4
 */
public class soal4 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("masukan 3 nilai mata dadu: (contoh: 3 2 6)");
    int diceOne = input.nextInt();
    int diceTwo = input.nextInt();
    int diceThree = input.nextInt();
    input.close();

    String result = false + ", mata dadu bukan konsekutif";

    if ((diceThree <= 0 || diceTwo <= 0 || diceOne <= 0) || (diceThree > 6 || diceTwo > 6 || diceOne > 6)) {
      result = "input invalid";

    } else if ((diceThree - diceTwo == 1 && diceTwo - diceOne == 1)
        || (diceThree - diceTwo == -1 && diceTwo - diceOne == -1)) {
      result = true + ", mata dadu konsekutif";

    }
    System.out.println(result);
  }
}
