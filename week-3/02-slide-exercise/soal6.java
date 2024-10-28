import java.util.Scanner;

/**
 * soal6
 */
public class soal6 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("apakah memiliki fisik sehat (true or false) : ");
    boolean fisik = input.nextBoolean();
    System.out.println("\napakah memiliki perbekalan cukup (true or false) : ");
    boolean bekal = input.nextBoolean();
    System.out.println("\napakah cuaca bagus (true or false) : ");
    boolean cuaca = input.nextBoolean();
    input.close();

    String result = "berkemah";

    if (cuaca != true || fisik != true || bekal != true) {
      result = "tidak berkemah";
    }

    System.out.println("\n" + result);
  }
}
