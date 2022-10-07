import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num;    
        String numString;
        boolean capicua = true;
        System.out.println("Digite el numero para comprobar si es capicúa");
        num = sc.nextInt();
        numString = num+"";
        for(int i = 0; i< numString.length(); i++){
          if(numString.charAt(i) != (numString.charAt(numString.length() -1 -i))){
                capicua=false;       
            }
        }
        if(capicua == true){
            System.out.println("El valor " + num + " es capicúa");
        }else{
            System.out.println("El valor " + num + " no es capicúa");
        }

        
    }
}
