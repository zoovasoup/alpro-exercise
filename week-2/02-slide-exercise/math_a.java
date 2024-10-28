import java.util.Scanner;

public class math_a {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("input x = ");
    int x = input.nextInt();

    System.out.println("input y = ");
    int y = input.nextInt();
    input.close();

    double result = 1.0 / ((3 * Math.pow(x, 2)) + 10) + (10 * y) + 7;
    System.out.println("\nthe result is: " + result);

  }
}
