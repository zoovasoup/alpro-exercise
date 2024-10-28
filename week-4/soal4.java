import java.util.Scanner;

public class soal4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("masukan true/false: ");
    String userInput = input.next();
    input.close();

    String result = "User input is: ";

    switch (userInput) {
      case "true":
        result += true;
        break;

      case "false":
        result += false;
        break;

      default:
        result += "Invalid (only true or false with lowercase)";
        break;
    }

    System.out.println(result);
  }
}
