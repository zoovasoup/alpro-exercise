import java.util.Scanner;

/**
 * soal6
 */
public class soal6 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int tankSize = input.nextInt();
    boolean tankFull = false;

    while (!tankFull) {
      int bucket = input.nextInt();

      if (bucket < 0) {
        System.out.println("invalid input. bucket must be highe than 0");
        return;
      } else {
        tankSize -= bucket;
      }

      if (tankSize <= 0) {
        tankFull = !tankFull;
      }
      System.out.println(tankFull);
    }

    input.close();
  }
}
