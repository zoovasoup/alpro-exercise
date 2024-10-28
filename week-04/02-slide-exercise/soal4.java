import java.util.Scanner;

public class soal4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("masukan angka: ");
    int userInput = input.nextInt();
    input.close();

    if (userInput < 0) {
      userInput *= -1;
    }

    System.out.println(userInput);

  }

}
