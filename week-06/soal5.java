import java.util.Scanner;

public class soal5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String namalast = "", namakedua = "";
    int nilailast = Integer.MAX_VALUE;
    int nilaikedua = Integer.MAX_VALUE;

    System.out.print("masukkan jumlah siswa: ");
    int jumlahSiswa = scanner.nextInt();
    scanner.nextLine();

    if (jumlahSiswa < 2) {
      System.out.println("jumlah siswa minimal 2");
      return;
    }

    for (int siswa = 1; siswa <= jumlahSiswa; siswa++) {
      System.out.print("masukkan nama siswa " + siswa + ": ");
      String nama = scanner.nextLine();

      System.out.print("masukkan nilai siswa " + siswa + ": ");
      int nilai = scanner.nextInt();
      scanner.nextLine();

      if (nilai < nilailast) {
        nilaikedua = nilailast;
        namakedua = namalast;

        nilailast = nilai;
        namalast = nama;
      } else if (nilai <= nilaikedua) {
        nilaikedua = nilai;
        namakedua = nama;
      }
    }
    System.out.println("Siswa kedua terendah adalah: " + namakedua + " dengan nilai " + nilaikedua);
    System.out.println("Siswa dengan nilai terendah adalah: " + namalast + " dengan nilai " + nilailast);

  }
}
