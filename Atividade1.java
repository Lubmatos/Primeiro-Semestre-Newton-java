import java.util.Scanner;
import java.util.Locale;

public class Atividade1 {
 public static void main (String[]args){
     Scanner entrada = new Scanner (System.in).useLocale(Locale.US);
      System.out.println("insira a quantidade que deseja armazenar de números");
      int tamanho = Integer.parseInt(entrada.next());
      int [] v = new int[tamanho];
      int cont;
      for (cont = 1; cont<=tamanho; cont++){
       System.out.println("informe o valor:");
        v [cont] = entrada.nextInt();
      }
      int percorrer=0;
      int soma = 0;
      while(percorrer<tamanho){
        soma+=v[percorrer];
        percorrer++;
      }
   System.out.println("Sua média é " + (soma/tamanho));
 }
}
