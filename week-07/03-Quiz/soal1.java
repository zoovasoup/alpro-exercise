import java.util.Scanner;

/**
 * soal1
 */
public class soal1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int inputX = input.nextInt();
    int inputY = input.nextInt();
    input.close();

    if (inputX < 0 || inputY < 0) {
      System.out.println("invalid input. input must > 0");
    } else {
      int pertemuan = 0;

      for (int i = 0; i < 365; i++) {
        if (i % inputX == 0 && i % inputY != 0) {
          pertemuan++;
        }
      }

      System.out.println(pertemuan);
    }

  }
}
