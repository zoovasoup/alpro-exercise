import java.util.Scanner;

public class soal3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("input jarak mil: ");
    int userInput = s.nextInt();

    double milConverted = userInput * 1.6;

    String resultFormatted = String.format("%.1f", milConverted);

    System.out.println(userInput + " mil sama dengan " + resultFormatted + " kilometer");
  }
}
