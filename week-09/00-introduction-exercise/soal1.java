import java.util.Scanner;

/**
 * soal1
 */
public class soal1 {
  public static void hitungLuasPersegi(int sisi) {
    System.out.println(sisi * sisi);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    hitungLuasPersegi(input.nextInt());
    input.close();
  }
}
