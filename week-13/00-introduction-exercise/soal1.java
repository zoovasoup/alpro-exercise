import java.util.Arrays;
import java.util.Scanner;

/**
 * soal1
 */
public class soal1 {
  public static int[] number = new int[20];
  public static int totalIndex = 0;

  public static void main(String[] args) {

    bacaArray(number);
    printArray(number, max(number), min(number));
  }

  public static void bacaArray(int[] number) {
    Scanner in = new Scanner(System.in);
    for (int i : number) {
      System.out.print("Masukkan bilangan: ");
      number[totalIndex] = in.nextInt();
      if (number[totalIndex] <= 0)
        break;

      totalIndex++;
    }
    in.close();
  }

  public static int max(int[] number) {
    int max = number[0];
    for (int num : number) {
      max = (num > max) ? num : max;
    }

    return max;
  }

  public static int min(int[] number) {
    int min = number[0];
    for (int num : number) {
      min = ((num < min) && (num > 0)) ? num : min;
    }
    return min;
  }

  public static void printArray(int[] number, int max, int min) {
    System.out.printf("\nelement array: %s", Arrays.toString(Arrays.copyOf(number, totalIndex)));
    System.out.printf("\nnilai max: %d\nmin: %d", max, min);
  }
}
