import java.util.Scanner;

/**
 * soal1
 */
public class soal1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("masukan bilangan 4 digit: ");
    String userInput = input.next();
    System.out.println("masukan bilangan 1 digit: ");
    String userInput2 = input.next();

    String result = userInput.substring(0, 2) + userInput2 + userInput.substring(2);

    System.out.println(result);

  }
}
