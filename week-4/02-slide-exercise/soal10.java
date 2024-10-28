import java.util.Scanner;

public class soal10 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("masukan jumlah orang yang berangkat: ");
    int userInput = input.nextInt();
    input.close();

    String result = "";
    int appaBig = 0, appaSmall = 0, sisa = 0;

    if (userInput <= 15) {
      appaBig = userInput / 5;
      if (userInput % 5 > 0) {
        appaBig += 1;
      }

      result += "dewasa: " + appaBig;

    } else if (userInput > 15 && userInput <= 25) {
      appaBig = 3;
      userInput -= 15;
      appaSmall = userInput / 2;

      if (userInput % 2 > 0 || userInput == 1) {
        appaSmall += 1;
      }

      result += "dewasa: " + appaBig + ", kecil: " + appaSmall;
    } else if (userInput > 25) {
      appaBig = 3;
      appaSmall = 5;
      sisa = userInput - 25;

      result += "dewasa: " + appaBig + ", kecil: " + appaSmall + " dan " + sisa + " tak berangkat";
    }
    System.out.println(result);
  }

}
