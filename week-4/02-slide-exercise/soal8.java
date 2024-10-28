import java.util.Scanner;

public class soal8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int h1, m1, h2, m2;
    System.out.println("jam buka parkir adalah jam 7 pagi sampai 5 sore");
    System.out.println("masukan jam parkir (contoh 7 00 12 00)(format 12 jam): ");
    h1 = input.nextInt();
    m1 = input.nextInt();
    h2 = input.nextInt();
    m2 = input.nextInt();
    input.close();

    boolean validation1 = false;
    boolean validation2 = false;
    boolean validation3 = false;
    int resultH = 0;
    int resultM = 0;
    String result = "";

    if ((7 <= h1 && h1 <= 12) || (1 <= h1 && ((h1 <= 4) || h1 == 5 && m1 == 0))) {
      validation1 = true;
    }
    if ((7 <= h2 && h2 <= 12) || (1 <= h2 && ((h2 <= 4) || h2 == 5 && m2 == 0))) {
      validation2 = true;
    }
    if (m2 <= 60 && m1 <= 60 && m2 >= 0 && m1 >= 0) {
      validation3 = true;
    }

    if (validation1 == true && validation2 == true && validation3 == true) {
      if (h1 <= 5) {
        h1 += 12;
      }
      if (h2 <= 5) {
        h2 += 12;
      }

      resultH = h2 - h1;
      resultM = m2 - m1;

      if (resultM < 0) {
        resultM = (m2 + 60) - m1;
        resultH -= 1;
      }

      result = resultH + " jam " + resultM + " menit ";

    } else {
      result = "input invalid";
    }

    System.out.println(result);
  }
}
