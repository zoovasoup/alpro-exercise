import java.util.Scanner;

/**
 * soal1
 */
public class soal1 {
  public static void hitungLuasPersegi(int sisi) {
    int luas = sisi * sisi;
    System.out.println(luas);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int userInput = input.nextInt();
    input.close();

    hitungLuasPersegi(userInput);
  }
}
