import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String name, choice;
    int bookID, borrowDays = 0;

    // "database"
    int book1ID = 101;
    String book1Title = "book 1";
    String book1Author = "author 1";
    boolean book1Available = true;
    String book1Borrower = "";
    int book1BorrowerDays = 0;

    int book2ID = 102;
    String book2Title = "book 2";
    String book2Author = "author 2";
    boolean book2Available = true;
    String book2Borrower = "";
    int book2BorrowerDays = 0;

    int book3ID = 103;
    String book3Title = "book 3";
    String book3Author = "author 3";
    boolean book3Available = true;
    String book3Borrower = "";
    int book3BorrowerDays = 0;

    int book4ID = 104;
    String book4Title = "book 4";
    String book4Author = "author 4";
    boolean book4Available = true;
    String book4Borrower = "";
    int book4BorrowerDays = 0;

    int book5ID = 105;
    String book5Title = "book 5";
    String book5Author = "author 5";
    boolean book5Available = false;
    String book5Borrower = "human";
    int book5BorrowerDays = 3;

    do {
      // Main Menu
      System.out.println("\n===== Menu Utama =====");
      System.out.println("1. Daftar Buku");
      System.out.println("2. Peminjaman Buku");
      System.out.println("3. Pengembalian Buku");
      System.out.println("4. Daftar Buku yang Dipinjam");
      System.out.println("0. Keluar");
      System.out.println("=======================");
      System.out.print("Pilih menu: ");
      choice = in.next();
      System.out.println("=======================");

      switch (choice) {
        case "1":
          // Daftar Buku

          System.out.println("\nDaftar Buku:");
          System.out.println("ID Buku: " + book1ID + "\nJudul: " + book1Title + "\nPengarang: " + book1Author
              + "\nStatus: " + (book1Available ? "Tersedia" : "Dipinjam"));
          System.out.println("\nID Buku: " + book2ID + "\nJudul: " + book2Title + "\nPengarang: " + book2Author
              + "\nStatus: " + (book2Available ? "Tersedia" : "Dipinjam"));
          System.out.println("\nID Buku: " + book3ID + "\nJudul: " + book3Title + "\nPengarang: " + book3Author
              + "\nStatus: " + (book3Available ? "Tersedia" : "Dipinjam"));
          System.out.println("\nID Buku: " + book4ID + "\nJudul: " + book4Title + "\nPengarang: " + book4Author
              + "\nStatus: " + (book4Available ? "Tersedia" : "Dipinjam"));
          System.out.println("\nID Buku: " + book5ID + "\nJudul: " + book5Title + "\nPengarang: " + book5Author
              + "\nStatus: " + (book5Available ? "Tersedia" : "Dipinjam"));
          break;

        case "2":
          // Peminjaman Buku
          System.out.print("\nMasukkan nama peminjam: ");
          in.nextLine(); // Consume newline
          name = in.nextLine();
          System.out.print("Masukkan ID buku: ");
          bookID = in.nextInt();
          System.out.print("Masukkan jumlah hari peminjaman: ");
          borrowDays = in.nextInt();

          if (bookID == book1ID && book1Available) {
            book1Borrower = name;
            book1BorrowerDays = borrowDays;
            book1Available = false;
            System.out.println(
                "Buku \"" + book1Title + "\" berhasil dipinjam oleh " + name + " selama " + borrowDays + " hari.");
          } else if (bookID == book2ID && book2Available) {
            book2Borrower = name;
            book2BorrowerDays = borrowDays;
            book2Available = false;
            System.out.println(
                "Buku \"" + book2Title + "\" berhasil dipinjam oleh " + name + " selama " + borrowDays + " hari.");
          } else if (bookID == book3ID && book3Available) {
            book3Borrower = name;
            book3BorrowerDays = borrowDays;
            book3Available = false;
            System.out.println(
                "Buku \"" + book3Title + "\" berhasil dipinjam oleh " + name + " selama " + borrowDays + " hari.");
          } else if (bookID == book4ID && book4Available) {
            book4Borrower = name;
            book4BorrowerDays = borrowDays;
            book4Available = false;
            System.out.println(
                "Buku \"" + book4Title + "\" berhasil dipinjam oleh " + name + " selama " + borrowDays + " hari.");
          } else if (bookID == book5ID && book5Available) {
            book5Borrower = name;
            book5BorrowerDays = borrowDays;
            book5Available = false;
            System.out.println(
                "Buku \"" + book5Title + "\" berhasil dipinjam oleh " + name + " selama " + borrowDays + " hari.");
          } else {
            System.out.println("Buku tidak tersedia atau ID salah.");
          }
          break;

        case "3":
          // Pengembalian Buku
          System.out.print("\nMasukkan nama peminjam: ");
          in.nextLine(); // Consume newline
          name = in.nextLine();
          System.out.print("Masukkan ID buku: ");
          bookID = in.nextInt();

          if (bookID == book1ID && book1Borrower.equals(name)) {
            book1Available = true;
            book1Borrower = "";
            System.out.println("Buku \"" + book1Title + "\" telah dikembalikan.");
          } else if (bookID == book2ID && book2Borrower.equals(name)) {
            book2Available = true;
            book2Borrower = "";
            System.out.println("Buku \"" + book2Title + "\" telah dikembalikan.");
          } else if (bookID == book3ID && book3Borrower.equals(name)) {
            book3Available = true;
            book3Borrower = "";
            System.out.println("Buku \"" + book3Title + "\" telah dikembalikan.");
          } else if (bookID == book4ID && book4Borrower.equals(name)) {
            book4Available = true;
            book4Borrower = "";
            System.out.println("Buku \"" + book4Title + "\" telah dikembalikan.");
          } else if (bookID == book5ID && book5Borrower.equals(name)) {
            book5Available = true;
            book5Borrower = "";
            System.out.println("Buku \"" + book5Title + "\" telah dikembalikan.");
          } else {
            System.out.println("Pengembalian gagal. Nama peminjam atau ID salah.");
          }
          break;

        case "4":
          // Daftar Buku yang Dipinjam
          System.out.println("\nDaftar Buku yang Dipinjam:");
          if (!book1Available) {
            System.out.println("ID Buku: " + book1ID + "\nJudul: " + book1Title + "\nDipinjam oleh: " + book1Borrower
                + "\nSisa hari: " + book1BorrowerDays);
          }
          if (!book2Available) {
            System.out.println("ID Buku: " + book2ID + "\nJudul: " + book2Title + "\nDipinjam oleh: " + book2Borrower
                + "\nSisa hari: " + book2BorrowerDays);
          }
          if (!book3Available) {
            System.out.println("ID Buku: " + book3ID + "\nJudul: " + book3Title + "\nDipinjam oleh: " + book3Borrower
                + "\nSisa hari: " + book3BorrowerDays);
          }
          if (!book4Available) {
            System.out.println("ID Buku: " + book4ID + "\nJudul: " + book4Title + "\nDipinjam oleh: " + book4Borrower
                + "\nSisa hari: " + book4BorrowerDays);
          }
          if (!book5Available) {
            System.out.println("ID Buku: " + book5ID + "\nJudul: " + book5Title + "\nDipinjam oleh: " + book5Borrower
                + "\nSisa hari: " + book5BorrowerDays);
          }
          break;

        case "0":
          // Exit
          System.out.println("\nKeluar dari program...");
          break;

        default:
          System.out.println("\nPilihan tidak valid.");
          choice = "0";
          break;
      }

    } while (!choice.equals("0"));

    in.close();
  }
}
