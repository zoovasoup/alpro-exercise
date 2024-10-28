import java.util.Scanner;

public class soal3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("masukan tahun: (contoh: 2002)");
    int year = input.nextInt();

    System.out.println("masukan bulan: (tiga huruf, huruf pertama kapial)");
    String month = input.next();

    input.close();

    String[] listMonth = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Des" };
    int[] totalDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    String result = "\nInvalid Month. \n\nhere is the list of valid month:\n" + String.join(", ", listMonth);

    if (year % 4 == 0) {
      totalDays[1] = 29;
    }

    for (int i = 0; i < totalDays.length; i++) {
      if (month.equals(listMonth[i])) {
        result = month + " " + year + " memiliki " + totalDays[i] + " hari";
      }
    }

    System.out.println(result);

  }
}
