import java.util.Arrays;
import java.util.Scanner;

/**
 * soal2
 */
public class soal2 {
  public static int[][] data = new int[5][5];

  public static void main(String[] args) {
    bacaArray(data);
    cetakArray2D(data);
  }

  public static void bacaArray(int[][] data) {
    Scanner in = new Scanner(System.in);

    outer: for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[i].length; j++) {
        System.out.print("Masukkan angka: ");
        data[i][j] = in.nextInt();
        if (data[i][j] < 0)
          break outer;
      }
    }
    in.close();
  }

  public static void cetakArray2D(int[][] data) {
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[i].length; j++) { // Loop through columns
        System.out.print(data[i][j] + ", ");
      }
      System.out.println(); // Move to the next row
    }
  }
}
