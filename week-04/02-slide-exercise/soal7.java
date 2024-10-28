import java.util.Scanner;

public class soal7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("masukan 4 nilai (contoh: 1 2 3 4): ");
    int a, b, c, d, minGoal, maxGoal;

    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();
    d = input.nextInt();
    input.close();

    minGoal = a;

    if (b < minGoal)
      minGoal = b;

    if (c < minGoal)
      minGoal = c;

    if (d < minGoal)
      minGoal = d;

    maxGoal = a;
    if (b > maxGoal)
      maxGoal = b;

    if (c > maxGoal)
      maxGoal = c;

    if (d > maxGoal)
      maxGoal = d;

    System.out.println(maxGoal + " " + minGoal);
  }

}
