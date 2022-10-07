import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int people, cont = 0, nex;
        Double weight, sum = 0.0;
        boolean repeated = true; 
        while(repeated == true){
        System.out.println("Digite el numero de personas que desea saber el peso acomulado");
        people = sc.nextInt();
        while (cont< people){
        cont++;
        System.out.println("Digite el peso " + cont);
        weight = sc.nextDouble();
        sum = weight + sum;
        }
        System.out.println("Peso acomulado es " + sum);
        System.out.println("Quiere ver como cambia el resultado de 10 100, digite uno, de los contratario 2");
        nex = sc.nextInt();
        if(nex == 1){
            System.out.println("Digite el 100");
            people = sc.nextInt();
        }else{
            repeated = false;
        }
        }
        
        



    }
}
