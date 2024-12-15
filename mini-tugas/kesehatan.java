
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

public class kesehatan {
  public static String[][] data = new String[4][10];

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while (true) {
      menu();
      System.out.print("Pilih menu: ");
      int pilihMenu = in.nextInt();
      in.nextLine();

      switch (pilihMenu) {
        case 1:
          inputData();
        case 2:
          editData();
        case 3:
          hitungHarga();
        case 4:
          tampilData();
        case 5:
          tampilTerbesar();
        case 6:
          break;
        default:
          System.out.println("Menu tidak tersedia");
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

    for (int i = 0; i < jumlahData; i++) {
      for (int j = 0; j < 4; j++) {
        if (data[i][0] == "") {
          System.out.print("Masukkan nama pasien: ");
          data[i][0] = in.next();
          System.out.print("Masukkan nama dokter: ");
          data[i][1] = in.next();
          System.out.print("Masukkan jam masuk: ");
          data[i][2] = in.next();
          System.out.print("Masukkan jam keluar: ");
          data[i][3] = in.next();
          System.out.println("");
        }
      }
    }
    in.close();
  }

  public static void inputDataValitation(String validate) {

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
