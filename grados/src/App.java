import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cont = 1, major = 0, temp;
        while(cont <= 10){
            System.out.println("DIGITE TEMPERATURA EN GRADOS ENTEROS " + cont);
            temp = sc.nextInt();
            if(temp > major){
                major = temp;
            }
            cont++;
        }
        System.out.println("LA TEMPERATURA MAYOR ES: " + major + "º");
    }
}
