import java.util.Scanner;

public class energi {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Masukan nilai E0, c dan E1 secara berurutan (contoh: 1000 0 5)");
    int E0 = input.nextInt();
    int c = input.nextInt();
    int E1 = input.nextInt();
    input.close();

    int result = (E0 - E1) / c;

    System.out.println("cc is: " + result);
  }
}
