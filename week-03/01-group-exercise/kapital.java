import java.util.Scanner;

public class kapital {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("masukan char: ");

    char userInput = input.next().charAt(0);
    input.close();

    boolean result = Character.isUpperCase(userInput);

    System.out.println(result);
  }
}
