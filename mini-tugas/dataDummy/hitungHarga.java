/**
 * hitungHarga
 *
 * bikin program untuk menghitung harga dari data pasien yang sudah ada dari
 * data
 *
 * user tidak perlu memasukan data/nama pasien/apapun, cukup menggunakan data
 * yang
 * sudah ada
 *
 * mengambil data dari variable data[][]
 *
 * harga konsultasi dokter adalah Rp50.000/jam dan 30 menit selanjutnya Rp10.000
 * dengan pembulatan waktu ke atas (contoh: 31 menit Rp60.000).
 *
 * kemudian masukan harga ke dalam data pasien
 *
 * kalau bisa tidak usah menambah method atau fungsi lagi
 *
 * jangan lupa untuk mengubah dahulu data yang ada di variable data[i][2] dan
 * data[i][3] menjadi integer
 *
 */
public class hitungHarga {
  public static String[][] data = new String[5][5]; // global var untuk data

  public static void main(String[] args) {
    dataFill(); // mengisi data pasien
    hitungBiaya(); // menghitung harga konsultasi
    printHarga(); // menampilkan harga
  }

  public static void dataFill() {
    // Data pasien 0
    data[0][0] = "Riyan";
    data[0][1] = "Dr. Dani";
    data[0][2] = "0815"; // 08.15
    data[0][3] = "0930"; // 09.30
    data[0][4] = "";

    // Data pasien 1
    data[1][0] = "Andi";
    data[1][1] = "Dr. Budi";
    data[1][2] = "0820"; // 08.20
    data[1][3] = "1000"; // 10.00
    data[1][4] = "";

    // Data pasien 2
    data[2][0] = "Siti";
    data[2][1] = "Dr. Anita";
    data[2][2] = "0900"; // 09.00
    data[2][3] = "1100"; // 11.00
    data[2][4] = "";

    // Data pasien 3
    data[3][0] = "Rudi";
    data[3][1] = "Dr. Citra";
    data[3][2] = "1030"; // 10.30
    data[3][3] = "1200"; // 12.00
    data[3][4] = "";

    // Data pasien 4
    data[4][0] = "Maya";
    data[4][1] = "Dr. Dani";
    data[4][2] = "1115"; // 11.15
    data[4][3] = "1300"; // 13.00
    data[4][4] = "";
  }

  public static void hitungBiaya() {
    for (int i = 0; i < data.length; i++) {
      // Mengubah jam dan menit dari string ke integer
      int jamMasuk = Integer.parseInt(data[i][2].substring(0, 2));
      int menitMasuk = Integer.parseInt(data[i][2].substring(2, 4));
      int jamKeluar = Integer.parseInt(data[i][3].substring(0, 2));
      int menitKeluar = Integer.parseInt(data[i][3].substring(2, 4));

      // Menghitung total menit
      int totalMenitMasuk = jamMasuk * 60 + menitMasuk;
      int totalMenitKeluar = jamKeluar * 60 + menitKeluar;
      int durasi = totalMenitKeluar - totalMenitMasuk;

      // Menghitung biaya
      int biaya = 0;
      if (durasi > 0) {
        biaya = 50000; // Biaya untuk 60 menit pertama
        if (durasi > 60) {
          int menitTambahan = durasi - 60;
          biaya += (int) Math.ceil(menitTambahan / 30.0) * 10000; // Biaya untuk setiap 30 menit tambahan
        }
      }

      // Menyimpan biaya ke dalam data
      data[i][4] = String.valueOf(biaya);
    }
  }

  public static void printHarga() {
    for (int i = 0; i < data.length; i++) {
      System.out.println("Pasien: " + (data[i][0]) + " " + (data[i][4]));
    }
  }
}
