import java.util.Scanner;

/**
 * soal2
 */
public class soal2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int totalPost = input.nextInt();

    int sentimenPostif = 0;
    int sentimenNegatif = 0;
    int sentimenNetral = 0;

    if (totalPost > 0) {
      for (int i = 0; i < totalPost; i++) {
        sentimenPostif += input.nextInt();
        sentimenNetral += input.nextInt();
        sentimenNegatif += input.nextInt();
      }
      input.close();
    }

    int highestSentimen;
    String result = "";

    if (sentimenPostif >= sentimenNegatif && sentimenPostif >= sentimenNetral) {
      highestSentimen = sentimenPostif;
      result += "+ " + highestSentimen;

    } else if (sentimenNegatif >= sentimenPostif && sentimenNegatif >= sentimenNetral) {
      highestSentimen = sentimenNegatif;
      result += "- " + highestSentimen;

    } else {
      highestSentimen = sentimenNetral;
      result += "= " + highestSentimen;

    }

    System.out.println(result);

  }
}
