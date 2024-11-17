import java.util.Scanner;

public class soal2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println(jumlahBus(input.nextInt(), input.nextInt()) + " bus");
    input.close();
  }

  public static Integer jumlahBus(int penumpang, int kapasitas) {
    int result = penumpang / kapasitas;
    if (penumpang % kapasitas != 0) {
      result++;
    }

    return result;
  }
}
