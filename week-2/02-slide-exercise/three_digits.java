import java.util.Scanner;

public class three_digits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("input number:");
    int userInput = input.nextInt();
    input.close();

    int firstDigit = userInput / 100;
    int secondDigit = (userInput / 10) % 10;
    int lastDigit = userInput % 10;

    System.out.println("\nresult:");
    System.out
        .println("x = " + userInput + " maka d1 = " + firstDigit + ", d2 = " + secondDigit + ", d3 = " + lastDigit);
  }
}
