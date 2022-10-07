import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String array[];
        array = new String[10];
        int age, major = 0, minor = 0;
        for (int x = 0; x < array.length; x++) {

            System.out.println("Escriba la edad");
            age = sc.nextInt();
            if (age > 18) {
                major++;
            } else {
                minor++;
            }
        }
        System.out.println("El promedio de mayores de edad es: " + (major) + "0%\nEl promedio de menores de edad es "
                + (minor+"0%"));

    }
}
