import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int quan = 0, age, female = 0, men = 0;
        String sex;
        System.out.println("Por favor digite la cantidad de personas que desea validar");
        quan = sc.nextInt();
        while (quan > 0) {
            System.out.println("\nEscriba M para maculino y F para femenino");
            sex = sc.next();
            System.out.println("\nIngrese la edad de la persona ");
            age = sc.nextInt();
            if (age > 18 && sex.equals("F")) {
                female++;
            }
            if (age < 18 && sex.equals("M")) {
                men++;
            }
            quan--;
        }

        System.out.print("La cantidad de mujeres mayores de edad es: " + female
                + "\nLa cantidad de hombres menores de edad es: " + men);

    }
}
