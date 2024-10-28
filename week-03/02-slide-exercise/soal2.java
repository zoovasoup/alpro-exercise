import java.util.Scanner;

/**
 * soal2
 */
public class soal2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("masukan banyak minggu: ");
    int banyakMinggu = input.nextInt();
    int result, week1, week2, week3, week4, week5;

    System.out.println("masukan week 1:");
    week1 = input.nextInt();
    System.out.println("masukan week 2:");
    week2 = input.nextInt();
    System.out.println("masukan week 3:");
    week3 = input.nextInt();
    System.out.println("masukan week 4:");
    week4 = input.nextInt();

    result = week1 + week2 + week3 + week4;

    if (banyakMinggu == 5) {
      System.out.println("masukan week 5:");
      week5 = input.nextInt();
      result += week5;
    }
    input.close();

    System.out.println("total: \n" + result);

  }
}
