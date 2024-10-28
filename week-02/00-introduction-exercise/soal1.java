import java.util.Scanner;

public class soal1 {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Banyak Kue yang dibuat Ibu");
    int y = s.nextInt(); // banyak kue yang dibuat Ibu

    System.out.println("Berapa jumlah anggota keluarga:");
    int x = s.nextInt(); // jumlah anggota keluarga

    System.out.println("Sisa kue adalah:");
    int mod = y % x;

    System.out.println(mod);
  }
}
