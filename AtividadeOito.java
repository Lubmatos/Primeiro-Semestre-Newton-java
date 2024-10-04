import java.util.Locale;
import java.util.Scanner;

public class AtividadeOito {
 public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in).useLocale(Locale.US);
    System.out.println("Informe o numero:");
    int x = Integer.parseInt(entrada.next());
    int cont=0;
    int soma=0;
    while (cont<x) {
       if(x%cont==0){
         soma=+cont;
        }  
     cont++;
    }
    if(soma==x){
     System.out.println("o numero " +x+ " é um Numero perfeito");
    }
    else{
     System.out.println("o numero " +x+ " é um Numero imperfeito");
    }
 }
}