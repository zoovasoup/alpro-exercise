import java.util.Scanner;

public class soal3v2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan jumlah siswa : ");
    int jumlahsiswa = input.nextInt();
    int i = 1;
    input.nextLine();
    System.out.print("Masukkan nama siswa : ");
    String namaterendah1 = input.nextLine();
    System.out.print("Nilai siswa : ");
    int nilaiterendah1 = input.nextInt();
    String namaterendah2 = "";
    int nilaiterendah2 = 0;
    i++;

    while (i <= jumlahsiswa) {
      input.nextLine();
      System.out.print("Masukkan nama siswa : ");
      String namaTmp = input.nextLine();
      System.out.print("Nilai siswa : ");
      int nilaiTmp = input.nextInt();

      if (nilaiTmp <= nilaiterendah1) {
        namaterendah2 = namaterendah1;@se48 - salman a
        namaterendah1 = namaTmp;
        nilaiterendah1 = nilaiTmp;
         } else if (nilaiTmp < nilaiterendah2 && nilaiTmp > nilaiterendah1) {
         nilaiterendah2 = nilaiTmp;
         namaterendah2 = namaTmp;
        }

      }
      i++;
    }System.out.println("Siswa dengan nilai terendah : "+namaterendah1);System.out.println("Siswa dengan nilai terendah ke 2 : "+namaterendah2);
}
