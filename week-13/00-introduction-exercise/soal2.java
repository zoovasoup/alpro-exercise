import java.util.Scanner;

public class soal2 {
  public static int[][] data = new int[5][5];

  public static void main(String[] args) {
    bacaArray(data);
    cetakArray2D(data);
    cariMaximum2D(data);
  }

  public static void bacaArray(int[][] data) {
    Scanner in = new Scanner(System.in);

    outer: for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[i].length; j++) {
        System.out.printf("Masukkan bilangan untuk baris %d kolom %d: ", i + 1, j + 1);
        data[i][j] = in.nextInt();
        if (data[i][j] <= 0)
          break outer;
      }
    }
    in.close();
  }

  public static void cetakArray2D(int[][] data) {
    for (int i = 0; i < data.length; i++) {
      System.out.printf("\n[ %d, %d, %d, %d, %d ]", data[i][0], data[i][1], data[i][2], data[i][3], data[i][4]);
    }
  }

  public static void cariMaximum2D(int[][] data) {
    int max = data[0][0];
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[i].length; j++) {
        max = (data[i][j] > max) ? data[i][j] : max;
      }
    }

    System.out.printf("\n\nNilai maximum: %d", max);
  }
}
