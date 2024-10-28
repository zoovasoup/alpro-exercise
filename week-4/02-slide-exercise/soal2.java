import java.util.Scanner;

public class soal2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("masukan nilai: ");
    int userInput = input.nextInt();
    input.close();

    if (userInput % 3 == 0) {
      System.out.println("Kelipatan 3");
    }

    if (userInput % 5 == 0) {
      System.out.println("Kelipatan 5");
    }

  }

}

