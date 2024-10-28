import java.util.Scanner;

/**
 * soal2
 */
public class soal2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("masukan jumlah penduduk: ");
    int totalPopulation = input.nextInt();
    System.out.println("masukan jumlah kelahiran: ");
    int totalBirth = input.nextInt();
    System.out.println("masukan jumlah imigrasi: ");
    int totalImigation = input.nextInt();
    System.out.println("masukan jumlah kematian: ");
    int totalDeath = input.nextInt();
    System.out.println("masukan jumlah emigrasi: ");
    int totalEmigation = input.nextInt();
    input.close();

    totalPopulation += totalBirth + totalImigation - totalEmigation - totalDeath;
    System.out.println(totalPopulation);
  }
}
