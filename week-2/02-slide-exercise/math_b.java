import java.util.Scanner;

public class math_b {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("input x:double = ");
    double x = input.nextDouble();
    input.close();

    double result = (Math.pow(x, 3) + (3 * x)) / (Math.pow(x, 4) - 3 * Math.pow(x, 2) + 4);
    System.out.println(result);
  }
}
