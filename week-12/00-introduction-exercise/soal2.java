import java.util.Scanner;

/**
 * soal2
 */
public class soal2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numberList[] = new int[11];

    for (int i = 0; i < numberList.length; i++) {
      numberList[i] = input.nextInt();
    }

    for (int i = 0; i < numberList.length - 1; i++) {

      String result = (numberList[i] > numberList[10]) ? "greater"
          : (numberList[i] < numberList[10]) ? "smaller"
              : "equal";

      System.out.printf("\n%d is %s than %d", numberList[i], result, numberList[10]);
    }
  }
}
