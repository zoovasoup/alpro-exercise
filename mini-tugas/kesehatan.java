import java.util.Scanner;

@SuppressWarnings("resource") // Suppress resource warnings.

public class kesehatan {
  public static String[][] dataPasien = new String[15][5];
  public static String[] dataDokter = new String[] {
      "budi",
      "citra",
      "",
      "",
      "dani"
  };

  public static void main(String[] args) {
    // dataFill();

    while (true) {
      Scanner in = new Scanner(System.in);
      menu();
      System.out.print("Pilih menu: ");
      String pilihMenu = in.next();
      in.nextLine();

      switch (pilihMenu) {
        case "1":
          inputData(in);
          break;
        case "2":
          editDataDokter(in);
          break;
        case "3":
          editData(in);
          break;
        case "4":
          hapusData(in);
          break;
        case "5":
          tampilData();
          break;
        case "6":
          tampilTerbesar();
          break;
        case "7":
          System.out.println("\nTerima kasih telah menggunakan program ini.");
          return;
        default:
          System.out.println("Menu tidak tersedia");
          break;
      }
    }
  }

  // procedure tampilan menu
  public static void menu() {
    // System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("\n====================================");
    System.out.println("========== Sistem Kesehatan ========");
    System.out.println("====================================");
    System.out.println("1. Input data");
    System.out.println("2. Edit data dokter");
    System.out.println("3. Edit data pasien");
    System.out.println("4. hapus data pasien");
    System.out.println("5. Tampil data");
    System.out.println("6. Tampil bayaran terbesar");
    System.out.println("7. Keluar");
    System.out.println("================");
  }

  // fungsi input data
  public static void inputData(Scanner in) {

    for (int i = 0; i < dataPasien.length; i++) {
      if (dataPasien[i][0] == "" || dataPasien[i][0] == null) {
        System.out.println("\n====================================");
        System.out.print("Masukkan nama pasien: ");
        dataPasien[i][0] = in.next();

        System.out.println("\n====================================");
        dataPasien[i][1] = inputDokter(in, "Masukkan nama dokter: ");
        System.out.println("\n====================================");
        dataPasien[i][2] = inputJam(in, "Masukkan jam masuk (format 24H HH:mm): ");
        System.out.println("\n====================================");
        dataPasien[i][3] = (inputJam(in, "Masukkan jam keluar (format 24H HH:mm): "));

        while (dataPasien[i][2].compareTo(dataPasien[i][3]) > 0) {
          System.out.println("Jam keluar harus lebih besar dari jam masuk.");
          dataPasien[i][3] = (inputJam(in, "Masukkan jam keluar (format 24H HH:mm): "));
        }

        dataPasien[i][4] = Integer.toString(hitungHarga(dataPasien[i][2], dataPasien[i][3]));
        System.out.println("\nData berhasil dimasukkan.");
        break;
      }
    }
  }

  public static String inputDokter(Scanner in, String message) {
    String dokter;
    boolean validateDokter = false;

    System.out.println("dokter yang tersedia: ");
    for (int i = 0; i < dataDokter.length; i++) {
      if (!dataDokter[i].equals("")) {
        System.out.printf(" - dr.%s \n", dataDokter[i]);
      }
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
      validateJam = jam.matches("^([01][0-9]|2[0-3]):[0-5][0-9]$");

      if (!validateJam) {
        System.out.println("format jam salah");
      }
    } while (!validateJam);

    return jam;
  }

  public static void editData(Scanner in) {
    System.out.println("\n====================================");
    System.out.println("Edit Data Pasien");
    System.out.println("====================================");
    System.out.print("Masukkan nama pasien yang akan diubah: ");
    String namaPasien = in.nextLine().trim();

    boolean ditemukan = false;
    for (int i = 0; i < dataPasien.length; i++) {
      if (dataPasien[i][0] != null && dataPasien[i][0].equalsIgnoreCase(namaPasien)) {
        ditemukan = true;
        System.out.println("Data ditemukan. Pilih data yang ingin diubah:");
        System.out.println("1. Nama pasien");
        System.out.println("2. Dokter");
        System.out.println("3. Jam masuk");
        System.out.println("4. Jam keluar");
        System.out.print("Pilihan: ");
        int pilihan = in.nextInt();
        in.nextLine();

        switch (pilihan) {
          case 1:
            System.out.print("Masukkan nama baru: ");
            dataPasien[i][0] = in.nextLine().trim();
            break;
          case 2:
            dataPasien[i][1] = inputDokter(in, "Masukkan nama dokter baru: ");
            break;
          case 3:
            dataPasien[i][2] = inputJam(in, "Masukkan jam masuk baru (format 24H HH:mm): ");
            break;
          case 4:
            dataPasien[i][3] = inputJam(in, "Masukkan jam keluar baru (format 24H HH:mm): ");
            break;
          default:
            System.out.println("Pilihan tidak valid.");
            return;
        }

        if (pilihan == 3 || pilihan == 4) {
          while (dataPasien[i][2].compareTo(dataPasien[i][3]) > 0) {
            System.out.println("Jam keluar harus lebih besar dari jam masuk.");
            dataPasien[i][3] = inputJam(in, "Masukkan jam keluar baru (format 24H HH:mm): ");
          }
          dataPasien[i][4] = Integer.toString(hitungHarga(dataPasien[i][2], dataPasien[i][3]));
        }

        System.out.println("Data berhasil diperbarui.");
        return;
      }
    }

    if (!ditemukan) {
      System.out.println("Data pasien tidak ditemukan.");
    }
  }

  public static void hapusData(Scanner in) {
    System.out.println("\n====================================");
    System.out.println("Hapus Data Pasien");
    System.out.println("====================================");
    System.out.print("Masukkan nama pasien yang akan dihapus: ");
    String namaPasien = in.nextLine().trim();
    boolean hapus = false;

    for (int i = 0; i < dataPasien.length; i++) {
      if (dataPasien[i][0] != null && dataPasien[i][0].equalsIgnoreCase(namaPasien)) {
        dataPasien[i] = new String[5];
        System.out.println("Data pasien berhasil dihapus.");
        hapus = true;
      }
    }

    if (!hapus)
      System.out.println("Data pasien tidak ditemukan.");
  }

  public static void editDataDokter(Scanner in) {
    System.out.println("\n====================================");
    System.out.println("Edit Data Dokter");
    System.out.println("1. tambah dokter");
    System.out.println("2. hapus dokter");
    System.out.println("====================================");
    System.out.print("Pilih menu: ");
    String pilihan = in.nextLine().trim();

    String namaDokter;

    switch (pilihan) {
      case "1":
        System.out.print("Masukkan nama dokter baru: ");
        namaDokter = in.nextLine().trim().toLowerCase();

        for (int i = 0; i < dataDokter.length; i++) {
          if (dataDokter[i] == "" || dataDokter[i] == null) {
            dataDokter[i] = namaDokter;
            System.out.println("Data dokter berhasil ditambahkan.");
            return;
          }
        }

        break;

      case "2":
        System.out.print("Masukkan nama dokter yang akan dihapus: ");
        namaDokter = in.nextLine().trim().toLowerCase();

        for (int i = 0; i < dataDokter.length; i++) {
          if (dataDokter[i] != null && dataDokter[i].equalsIgnoreCase(namaDokter)) {
            dataDokter[i] = "";
            System.out.println("Data dokter berhasil dihapus.");
            return;
          }
        }
        break;
      case "3":
        return;
      default:
        System.out.println("Menu tidak tersedia.");
        break;
    }
  }

  // fungsi hitung harga
  public static int hitungHarga(String waktuMasuk, String waktuKeluar) {
    int jamMasuk = Integer.parseInt(waktuMasuk.substring(0, 2));
    int menitMasuk = Integer.parseInt(waktuMasuk.substring(3, 5));
    int jamKeluar = Integer.parseInt(waktuKeluar.substring(0, 2));
    int menitKeluar = Integer.parseInt(waktuKeluar.substring(3, 5));

    int totalMenitMasuk = jamMasuk * 60 + menitMasuk;
    int totalmenitKeluar = jamKeluar * 60 + menitKeluar;
    int durasi = totalmenitKeluar - totalMenitMasuk;

    int biaya = 0;
    if (durasi > 0) {
      biaya = 50000;
      if (durasi > 60) {
        int menitTambahan = durasi - 60;
        biaya += (int) Math.ceil(menitTambahan / 30.0) * 10000;
      }
    }

    return biaya;
  }

  // procedure tampil data
  public static void tampilData() {
    Scanner input = new Scanner(System.in);
    System.out.println("Menu:");
    System.out.println("1. Tampilkan seluruh data pasien");
    System.out.println("2. Tampilkan data pasien tertentu");
    System.out.print("Pilihan: ");
    int pilihan = input.nextInt();

    if (pilihan == 1) { // tampilan seluruh data
      for (int i = 0; i < dataPasien.length; i++) {
        if (dataPasien[i] != null && dataPasien[i][0] != null) {
          System.out.println("\nNama pasien: " + dataPasien[i][0]);
          System.out.println("Nama dokter: " + dataPasien[i][1]);
          System.out.println("Jam masuk: " + dataPasien[i][2]);
          System.out.println("Jam keluar: " + dataPasien[i][3]);
          System.out.println("Total biaya: " + dataPasien[i][4]);
          System.out.println("-------------------");
        }
      }
    } else if (pilihan == 2) { // tampilan dataPasien pasien berdasarkan nama

      System.out.print("Masukkan nama pasien: ");
      String namaCari = input.next();
      boolean found = false;

      for (int i = 0; i < dataPasien.length; i++) {
        if (dataPasien[i] != null && dataPasien[i][0] != null && dataPasien[i][0].equalsIgnoreCase(namaCari)) {
          System.out.println("\nNama pasien: " + dataPasien[i][0]);
          System.out.println("Nama dokter: " + dataPasien[i][1]);
          System.out.println("Jam masuk: " + dataPasien[i][2]);
          System.out.println("Jam keluar: " + dataPasien[i][3]);
          System.out.println("Total biaya: " + dataPasien[i][4]);
          found = true;
        }
      }

      if (!found) {
        System.out.println("\nData pasien tidak ditemukan.");
      }
    } else {
      System.out.println("\nPilihan tidak valid.");
    }
  }

  // fungsi tampil data bayaran terbesar
  public static void tampilTerbesar() {
    int maxFee = 0;

    for (int i = 0; i < dataPasien.length; i++) {
      if (dataPasien[i][4] == null) {
        continue;
      } else {
        int fee = Integer.parseInt(dataPasien[i][4]);
        if (fee > maxFee) {
          maxFee = fee;
        }
      }
    }

    System.out.println("\n====================================");
    System.out.println("Pasien dengan biaya konsultasi terbesar:");
    for (int i = 0; i < dataPasien.length; i++) {
      if (dataPasien[i][4] == null) {
        continue;
      } else {
        int fee = Integer.parseInt(dataPasien[i][4]);
        if (fee == maxFee) {
          System.out.println("\nNama: " + dataPasien[i][0]);
          System.out.println("Dokter: " + dataPasien[i][1]);
          System.out.println("Waktu Mulai: " + dataPasien[i][2]);
          System.out.println("Waktu Selesai: " + dataPasien[i][3]);
          System.out.println("Biaya: " + dataPasien[i][4]);
        }
      }
    }
  }

  // untuk dummy data
  public static void dataFill() {
    // Data pasien 0
    dataPasien[0][0] = "Riyan";
    dataPasien[0][1] = "dani";
    dataPasien[0][2] = "08:15";
    dataPasien[0][3] = "09:30";
    dataPasien[0][4] = "50000";

    // dataPasien pasien 1
    dataPasien[2][0] = "Andi";
    dataPasien[2][1] = "budi";
    dataPasien[2][2] = "08:20";
    dataPasien[2][3] = "10:00";
    dataPasien[2][4] = "70000";

    // dataPasien pasien 3
    dataPasien[3][0] = "Siti";
    dataPasien[3][1] = "citra";
    dataPasien[3][2] = "09:00";
    dataPasien[3][3] = "11:00";
    dataPasien[3][4] = "70000";

    // dataPasien pasien 5
    dataPasien[5][0] = "Rudi";
    dataPasien[5][1] = "dani";
    dataPasien[5][2] = "10:30";
    dataPasien[5][3] = "12:00";
    dataPasien[5][4] = "70000";

    // dataPasien pasien 8
    dataPasien[8][0] = "Maya";
    dataPasien[8][1] = "citra";
    dataPasien[8][2] = "11:15";
    dataPasien[8][3] = "13:00";
    dataPasien[8][4] = "70000";
  }
}
