import java.util.Scanner;

public class soal2 {

  public static void tampilkanPesan(String message, int repeater) {
    for (int i = 0; i < repeater; i++) {
      System.out.println(message);
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    tampilkanPesan(input.nextLine(), input.nextInt());
    input.close();
  }
}
