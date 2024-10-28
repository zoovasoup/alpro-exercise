import java.util.Scanner;

public class soal1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan jumlah mahasiswa: ");
    int totalStudent = input.nextInt();
    int[] scoreStudent = new int[totalStudent];
    int highestStudent = 0;

    int i = 0;
    while (i < totalStudent) {
      scoreStudent[i] = input.nextInt();

      if (scoreStudent[i] > highestStudent) {
        highestStudent = scoreStudent[i];
      }

      i++;
    }

    i = 0;
    while (i < totalStudent) {
      String result = "F";
      if (scoreStudent[i] >= highestStudent) {
        result = "A";

      } else if (scoreStudent[i] >= highestStudent - 5) {
        result = "B";

      } else if (scoreStudent[i] >= highestStudent - 10) {
        result = "C";

      } else if (scoreStudent[i] >= highestStudent - 15) {
        result = "D";

      } else if (scoreStudent[i] >= highestStudent - 20) {
        result = "E";

      }

      System.out.printf("Mahasiswa %d memiliki nilai %d dan mendapat nlai %s\n", i, scoreStudent[i], result);

      i++;
    }

    input.close();
  }
}