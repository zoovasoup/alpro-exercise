
/**
 * kesehatan
 *
 * pengguna melakukan input dan menghapus data nama pasien, nama dokter, jam
 * masuk, jam keluar.
 *
 * pengguna harus bisa melakukan pengubahan data dokter, jam masuk, jam keluar.
 *
 * data harga konsulatasi muncul dengan perhitungan 60 menit awal = Rp50.000 dan
 * 30 menit selanjutnya = Rp10.000 dengan pembulatan waktu ke atas (contoh: 31
 * menit Rp20.000).
 *
 * pengguna bisa menampilkan nama pasien beserta data konsultasinya.
 *
 * pengguna bisa menampilkan nama pasien dengan bayaran terbesar.
 */
import java.util.Scanner;

@SuppressWarnings("resource") // Suppress resource warnings.

public class kesehatan {
  public static String[][] dataPasien = new String[4][10];
  public static String[] dataDokter = new String[] { "dani", "budi", "anita", "citra" };

  public static void main(String[] args) {

    while (true) {
      Scanner in = new Scanner(System.in);
      menu();
      System.out.print("Pilih menu: ");
      String pilihMenu = in.next();
      in.nextLine();

      switch (pilihMenu) {
        case "1":
          inputData();
          break;
        case "2":
          editData();
          break;
        case "3":
          hitungHarga();
          break;
        case "4":
          tampilData();
          break;
        case "5":
          tampilTerbesar();
          break;
        case "6":
          return;
        default:
          System.out.println("Menu tidak tersedia");
          break;
      }
    }
  }

  // fungsi tampilan menu
  public static void menu() {
    System.out.println("Menu:");
    System.out.println("1. Input data");
    System.out.println("2. Edit data");
    System.out.println("3. Hitung harga");
    System.out.println("4. Tampil data");
    System.out.println("5. Tampil bayaran terbesar");
    System.out.println("6. Keluar");
  }

  // fungsi input data
  public static void inputData() {
    Scanner in = new Scanner(System.in);

    System.out.println("Ingin input berapa data? (max 10)");
    int jumlahData = in.nextInt();

    if (jumlahData > 10 || jumlahData <= 0) {
      System.out.println("Jumlah data harus antara 1 dan 10.");
      return;
    }

    for (int i = 0; i < jumlahData; i++) {
      System.out.print("Masukkan nama pasien: ");
      dataPasien[0][i] = in.next();

      dataPasien[1][i] = inputDokter(in, "Masukkan nama dokter: ");
      dataPasien[2][i] = inputJam(in, "Masukkan jam masuk (format 24H HH:mm): ");
      dataPasien[3][i] = (inputJam(in, "Masukkan jam keluar (format 24H HH:mm): "));

      if (dataPasien[2][i].compareTo(dataPasien[3][i]) > 0) {
        do {
          System.out.println("Jam keluar harus lebih besar dari jam masuk.");
          dataPasien[3][i] = (inputJam(in, "Masukkan jam keluar (format 24H HH:mm): "));
        } while (dataPasien[2][i].compareTo(dataPasien[3][i]) > 0);
      }

      System.out.println("\n Data berhasil dimasukkan.");
    }
  }

  public static String inputDokter(Scanner in, String message) {
    String dokter;
    boolean validateDokter = false;

    System.out.println("dokter yang tersedia: ");
    for (String i : dataDokter) {
      System.out.printf(" - Dr.%s \n", i.toUpperCase());
    }

    do {
      System.out.print(message);
      dokter = in.next().trim().toLowerCase();

      for (String i : dataDokter) {
        if (dokter.equals(i)) {
          validateDokter = true;
          break;
        }
      }

      if (!validateDokter) {
        System.out.println("nama dokter tidak ada di database");
      }

    } while (!validateDokter);

    return dokter;
  }

  public static String inputJam(Scanner in, String message) {
    String jam;
    boolean validateJam = false;

    do {
      System.out.print(message);
      jam = in.next();
      validateJam = jam.matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$");

      if (!validateJam) {
        System.out.println("format jam salah");
      }
    } while (!validateJam);

    return jam;
  }

  // fungsi edit data - zulfa
  public static void editData() {
  }

  // fungsi hitung harga
  public static int hitungHarga() {
    return 0;
  }

  // fungsi tampil data
  public static void tampilData() {
  }

  // fungsi tampil data bayaran terbesar
  public static void tampilTerbesar() {
  }

}
