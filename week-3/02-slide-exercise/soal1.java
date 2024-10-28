import java.util.Scanner;

public class soal1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("masukan total keterlambatan hari: ");
    int userInput = input.nextInt();
    input.close();

    int result = 0;

    if (userInput > 0 && userInput <= 10) {
      result = userInput * 2500;
    }

    if (userInput > 10) {
      result = userInput * 5000;
    }

    System.out.println(result);

  }
}
