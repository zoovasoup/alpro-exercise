import java.util.Scanner;

public class soal3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double ipk = input.nextDouble();
    int masaStudi = input.nextInt();
    boolean publikasi = input.nextBoolean();
    input.close();

    String result = "Invalid Input";

    if (cumlaude(ipk, masaStudi, publikasi)) {
      result = "Cumlaude";
    } else if (sangatMemuaskan(ipk, masaStudi, publikasi)) {
      result = "Sangat memuaskan";
    } else if (memuaskan(ipk, masaStudi, publikasi)) {
      result = "Memuaskan";
    }

    System.out.println(result);
  }

  public static boolean cumlaude(double a, int b, boolean c) {
    return (a >= 3.51 && a <= 4.00 && b <= 8 && c);
  }

  public static boolean sangatMemuaskan(double a, int b, boolean c) {
    return (a >= 2.76 && a <= 4.00 && b <= 14);
  }

  public static boolean memuaskan(double a, int b, boolean c) {
    return (a >= 2.00 && a <= 2.75 && b <= 14);
  }

}
