import java.util.Scanner;

/**
 * soal2
 */
public class soal2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("masukan nilai n: ");
    int userInput = input.nextInt();
    input.close();

    int result = 0;
    int i = 0;
    while (i < userInput) {
      i++;
      result += i;
    }

    System.out.println(result);
  }
}
