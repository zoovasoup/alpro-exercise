/**
 * tambilTerbesar
 *
 * bikin program untuk menampilkan data pasien yang memiliki biaya konsultasi
 * terbesar
 *
 * user tidak usah memasukan input apa"
 *
 * hanya gunakan data yang ada dari variable data[][] dan tampilkan data pasien
 * yang memiliki biaya konsultasi terbesar
 *
 * jika ada lebih dari 1 pasien yang memiliki biaya konsultasi terbesar, maka
 * tampilkan semua pasienn tersebut
 *
 * kalau bisa tidak usah menambah method atau fungsi lagi
 *
 * jangan lupa untuk mengubah dahulu data yang ada di variable data[i][4]
 * menjadi integer
 *
 */
public class tambilTerbesar {
  public static String[][] data = new String[5][5];

  public static void main(String[] args) {
    dataFill();
    int maxFee = 0;

    for (int i = 0; i < data.length; i++) {
      int fee = Integer.parseInt(data[i][4]);
      if (fee > maxFee) {
        maxFee = fee;
      }
    }

    System.out.println("Pasien dengan biaya konsultasi terbesar:");
    for (int i = 0; i < data.length; i++) {
      int fee = Integer.parseInt(data[i][4]);
      if (fee == maxFee) {
        System.out.println("Nama: " + data[i][0] + ", Dokter: " + data[i][1] + ", Waktu Mulai: " + data[i][2]
            + ", Waktu Selesai: " + data[i][3] + ", Biaya: " + data[i][4]);
      }
    }
  }

  // untuk dummy data
  public static void dataFill() {
    // Data pasien 0
    data[0][0] = "Riyan";
    data[0][1] = "Dr. Dani";
    data[0][2] = "08.15";
    data[0][3] = "09.30";
    data[0][4] = "80000";

    // Data pasien 1
    data[1][0] = "Andi";
    data[1][1] = "Dr. Budi";
    data[1][2] = "08.20";
    data[1][3] = "10.00";
    data[1][4] = "80000";

    // Data pasien 2
    data[2][0] = "Siti";
    data[2][1] = "Dr. Anita";
    data[2][2] = "09.00";
    data[2][3] = "11.00";
    data[2][4] = "80000";

    // Data pasien 3
    data[3][0] = "Rudi";
    data[3][1] = "Dr. Citra";
    data[3][2] = "10.30";
    data[3][3] = "12.00";
    data[3][4] = "70000";

    // Data pasien 4
    data[4][0] = "Maya";
    data[4][1] = "Dr. Dani";
    data[4][2] = "11.15";
    data[4][3] = "13.00";
    data[4][4] = "70000";
  }
}
