import java.util.Scanner;

public class App {
   public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      int num, cont = 2, div = 0, res;
      boolean prime = true;
      System.out.println("digite un numero para saber si es primo");

      num = sc.nextInt();

      if (num == 2) {
      } else if (num != 1) {
         while (num > cont) {
            res = num % cont;
            if (res == 0) {
               div++;
            }
            if (div > 2) {
               prime = false;
            }
            cont++;
         }
      }
      if (prime == true) {
         System.out.println("El numero " + num + " es primo");
      } else {
         System.out.println("El numero " + num + " no es primo");
      }
   }
}
