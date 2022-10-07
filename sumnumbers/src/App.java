import java.util.Scanner;
public class App {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int sum = 0, mult = 0, sumLim = 0, number;

    while (sum < 1000) {
      System.out.println("Dame un valor\n");
      number = sc.nextInt();
      if (number > 5 && number % 6 == 0) {
        System.out.println("Soy multiplo \n");
        mult++;
      }
      if (number >= 1 && number <= 10) {
        sumLim = sumLim + number;
      }
      if (sum + number > 1000) {
        System.out
            .println("el numero que ingreso es muy alto \n\ningrese un numero menor o igual a " + (1000 - sum) + "\n");
      } else {
        sum = sum + number;
      }
    }
    System.out.println("Los multiplos de 6 fueron: " + mult + " y la suma entre 1 y 10 fue de " + sumLim);

  }
}
