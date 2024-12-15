/**
 * tampilData
 *
 * bikin program untuk menampilkan data pasien dan keseluruhan data
 *
 * user diminta untuk melakukan pilihan
 * jika 1 maka akan menampilkan seluruh data pasien
 *
 * jika 2 maka user diminta untuk memasukan nama pasien lalu program akan
 *
 * menampilkan data pasien tersebut
 * 
 * kalau bisa tidak usah menambah method atau fungsi lagi
 *
 * tampilan outputnya adalah
 * nama pasien: ....
 * nama dokter: ....
 * jam masuk: ....
 * jam keluar: ....
 * total biaya: ....
 *
 */

public class tampilData {
  public static String[][] data = new String[5][5]; // global var untuk data

  public static void main(String[] args) {
    dataFill(); // bikin di bawah ini...

  }

  // untuk dummy data
  public static void dataFill() {
    // Data pasien 0
    data[0][0] = "Riyan";
    data[0][1] = "Dr. Dani";
    data[0][2] = "08.15";
    data[0][3] = "09.30";
    data[0][4] = "Rp50.000";

    // Data pasien 1
    data[1][0] = "Andi";
    data[1][1] = "Dr. Budi";
    data[1][2] = "08.20";
    data[1][3] = "10.00";
    data[1][4] = "Rp70.000";

    // Data pasien 2
    data[2][0] = "Siti";
    data[2][1] = "Dr. Anita";
    data[2][2] = "09.00";
    data[2][3] = "11.00";
    data[2][4] = "Rp70.000";

    // Data pasien 3
    data[3][0] = "Rudi";
    data[3][1] = "Dr. Citra";
    data[3][2] = "10.30";
    data[3][3] = "12.00";
    data[3][4] = "Rp70.000";

    // Data pasien 4
    data[4][0] = "Maya";
    data[4][1] = "Dr. Dani";
    data[4][2] = "11.15";
    data[4][3] = "13.00";
    data[4][4] = "Rp70.000";
  }
}
