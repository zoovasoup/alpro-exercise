/**
 * soal3
 */
public class soal3 {

  public static void main(String[] args) {
    long currentPopulation = 312_032_486L;

    int totalSec = 60 * 60 * 24 * 365;

    int totalBorn = totalSec / 7;
    int totalDeath = totalSec / 13;
    int totalImigrant = totalSec / 45;

    int totalPopulation = totalBorn + totalImigrant - totalDeath;
    long USPop = currentPopulation + totalPopulation * 5;

    System.out.println(USPop);
  }

}

