import java.util.Scanner;

public class soal4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("masukan biaya kuliah saat ini: ");
    double totalTuition = input.nextDouble();
    input.close();

    int i = 0;
    while (i < 10) {
      totalTuition = totalTuition * 1.06;

      i++;
    }

    double totalTuition2 = totalTuition;
    double totalTuitionAfter = 0;

    i = 0;
    while (i < 4) {
      totalTuition2 = (totalTuition2 * 1.06);
      totalTuitionAfter += totalTuition2;

      i++;
    }
    System.out.println("tahun ke-10: Rp. " + String.format("%,d", (int) Math.round(totalTuition)).replace(',', '.'));

    System.out.println("total biaya untuk empat tahun seletah tahun ke-10: Rp." +
        String.format("%,d", (int) Math.round(totalTuitionAfter)).replace(',', '.'));
  }
}
