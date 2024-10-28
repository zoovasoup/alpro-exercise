import java.util.Scanner;

public class permukaanBola {
  public static void main(String[] args) {
    final double pi = 22.0 / 7.0;

    System.out.println("Masukan jari-jari bola");
    Scanner input = new Scanner(System.in);
    double radius = input.nextDouble();
    input.close();

    double result = 4 * pi * radius * radius;

    System.out.println(result);
  }
}
