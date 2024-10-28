import java.util.Scanner;

public class soal6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("masukan keuntungan bulan kemarin dan bulan ini (contoh 1000 2000): ");
    double inputA = input.nextDouble();
    double inputB = input.nextDouble();
    input.close();

    String result = "tetap";

    if (inputA < inputB) {
      result = "Peningkatan sebesar: " + (inputB - inputA);

    } else if (inputA > inputB) {
      result = "Penurunan sebesar: " + (inputA - inputB);

    }

    System.out.println(result);
  }

}
