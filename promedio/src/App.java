import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cont = 1;
        double weight, average = 0;
        
        while(cont <= 5){
            
            System.out.println(" digite el peso numero "+cont);
            weight = sc.nextDouble();
            average = average + weight;
            
            cont++;
        }
        System.out.println("El promedio de peso de las 5 personas es: " + (average/5));
    }
}
