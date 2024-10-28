import java.util.Scanner;

/**
 * soal3
 */
public class soal3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("masukan prajurit viking: ");
    int vikingTotal = input.nextInt() * 4;
    System.out.println("masukan prajurit saxon: ");
    int saxonTotal = input.nextInt();
    input.close();

    String result = "viking menang";

    if (vikingTotal < saxonTotal) {
      result = "saxon menang";
    } else if (vikingTotal == saxonTotal) {
      result = "imbang";
    }

    System.out.println(result);
  }
}
