import java.util.Scanner;
import java.util.Locale;
 public class Atividade4 {
public static void main(String[]args){
     Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
     int v [] = new int [5];
      for(int cont=0;cont<=4;cont++){
         System.out.println("Insira os 5 números desejados");
         v[cont] = entrada.nextInt();
        }
       for(int percorrer=4;percorrer>=0;percorrer--){
         System.out.println(v[percorrer]);
        }
    }
}