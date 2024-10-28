import java.util.Scanner;

/**
 * soal4
 */
public class soal4v2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("masukan biaya kuliah saat ini: ");
    double yearTuition = input.nextDouble();
    input.close();

    double totalTuition = 0;
    double year10Tuition = 0;

    int i = 0;
    while (i < 14) {
      i++;
      yearTuition = (yearTuition * 1.06);

      if (i > 10) {
        totalTuition += yearTuition;
      } else {
        year10Tuition = yearTuition;
      }
    }

    System.out.printf("\ntahun ke-10: Rp.%,d \nTotal biaya untuk empat tahun setelah tahun ke-10: Rp.%,d",
        (int) Math.round(year10Tuition),
        (int) Math.round(totalTuition));
  }
}
