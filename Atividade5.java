import java.util.Scanner;
import java.util.Locale;

public class Atividade5 {
public static void main(String[]args){
  Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
  int v [] = new int[10];
   for (int insira = 0; insira<=9;insira++){
     System.out.println("Insira o valor desejado:");
      v[insira] = entrada.nextInt();
    }
  int somaPositivo=0;
  int somaNegativo=0;
  int cont = 0;
   while (cont<=9){
       if(v[cont]>0){
         somaPositivo++;  
        }
       else{
          somaNegativo++;
        }
     cont++;
    } 
   System.out.println("Quantidade de números positivos inseridos: " + somaPositivo );
   System.out.println("Quantidade de números negativos inseridos: " + somaNegativo );
} 
}
