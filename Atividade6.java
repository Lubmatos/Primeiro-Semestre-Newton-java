import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Atividade6 {
 public static void main(String[]args){
  Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
   int v [] = new int[10];
   Random gerador = new Random();
   int numero;
   for(int cont = 0; cont<=9; cont++){
     v[cont] = gerador.nextInt(101);
    } 
    int soma = 0;
    for(int posicao=0; posicao<=9; posicao++){    
     System.out.println("Numero gerado: " + v[posicao]); 
     soma+=v[posicao];
    }
   System.out.println("Soma dos valores gerados: "+soma );
  
}
}
