import java.util.Scanner;

@SuppressWarnings("resource") // Suppress resource warnings.

public class kesehatan {
  public static String[][] dataPasien = new String[4][10];
  public static String[] dataDokter = new String[] {
      "budi",
      "citra",
      "",
      "",
      "dani"
  };

  public static void main(String[] args) {

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
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("\n====================================");
    System.out.println("========== Sistem Kesehatan ========");
    System.out.println("====================================");
    System.out.println("1. Input data");
    System.out.println("2. Edit data dokter");
    System.out.println("3. Edit data pasien");
    System.out.println("4. Tampil data");
    System.out.println("5. Tampil bayaran terbesar");
    System.out.println("6. Keluar");
    System.out.println("====================================");
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
        System.out.println("Data berhasil dimasukkan.\n");
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
      validateJam = jam.matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$");

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
        in.nextLine(); // Membersihkan buffer

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

        // Rehitung biaya jika jam berubah
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
          if (dataDokter[i] == "") {
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

  // fungsi tampil data
  public static void tampilData() {
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
}
