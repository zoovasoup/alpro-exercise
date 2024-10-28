import java.util.Scanner;

public class soal10v2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("masukan jumlah orang yang berangkat: ");
    int userInput = input.nextInt();
    input.close();

    String result = "";
    int appaBig = 0, appaSmall = 0, sisa = 0;

    if (userInput <= 15) {
      appaBig = (userInput + 4) / 5;

      result = "dewasa: " + appaBig;
    } else if (userInput <= 25) {
      appaBig = 3;
      appaSmall = (userInput - 15 + 1) / 2;
      //
      result = "dewasa: " + appaBig + ", kecil: " + appaSmall;
    }

    else {
      appaBig = 3;
      appaSmall = 5;
      sisa = userInput - 25;

      result = "dewasa: " + appaBig + ", kecil: " + appaSmall + ", dan " + sisa + " tak berangkat";
    }
    System.out.println(result);
  }

}
