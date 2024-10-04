import java.util.Scanner;
import java.util.Locale;


public class Atividade3 {
   public static void main(String[]args){
     Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
     int v [] = new int [20];
     int cont;
      for(cont=0;cont<=19;cont++){
         System.out.println("Insira os 20 números desejados");
         v[cont] = entrada.nextInt();
        }
        int percorrer=0;
        int impar = 0;
        int par = 0;
        while(percorrer<=19){
           if(v[percorrer]%2==0){
             System.out.println("PAR: " + v[percorrer]);
          }
           else{
             System.out.println("IMPAR: " + v[percorrer]);
          }
         percorrer++;
        }
    }
}
