import java.util.Scanner;

/**
 * soal1
 */
public class soal1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("masukan char: ");
    String userInput = in.next().toLowerCase();
    in.close();

    String result = "konsonan";

    if (userInput.equals("a") || userInput.equals("i") || userInput.equals("u") || userInput.equals("e")
        || userInput.equals("o")) {
      result = "vokal";
    }
    System.out.println(result);
  }

}
