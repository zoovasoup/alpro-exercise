import java.util.Scanner;

/**
 * soal1
 */
public class soal1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int score[] = new int[100];
    int sum = 0;
    int count = 0;
    int aboveAvg = 0;
    int belowAvg = 0;
    int equalAvg = 0;

    for (count = 0; count < 100; count++) {
      int userInput = input.nextInt();
      if (userInput < 0) {
        break;
      }
      score[count] = userInput;
      sum += userInput;
    }

    double average = sum / count;

    for (int i = 0; i < count; i++) {
      if (score[i] < average) {
        belowAvg++;
      } else if (score[i] > average) {
        aboveAvg++;
      } else {
        equalAvg++;
      }

    }

    System.out.printf("%d scores above the average\n", aboveAvg);
    System.out.printf("%d scores equals the average\n", equalAvg);
    System.out.printf("%d scores below the average", belowAvg);
  }

}
