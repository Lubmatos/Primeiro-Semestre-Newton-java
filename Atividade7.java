import java.util.Locale;
import java.util.Scanner;

public class Atividade7 {
   public static void main(String[]args){
     Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
     int v [] = new int[10];
      for(int i = 0;  i<=9; i++){
         System.out.println("informe o numero desejado:");
         v [i] = entrada.nextInt();
        } 
        int soma=0;
       for(int primeiroFor = 0; primeiroFor<=9; primeiroFor++){
          for(int segundoFor = 0; segundoFor<=9; segundoFor++){
               if(v[primeiroFor]==v[segundoFor]){
                 soma++;   
                } 
            }
           System.out.println("O numero " + v[primeiroFor] + " foi inserido no total " + soma + " vezes");
           soma=0;
        }
    }
}
