import java.util.Scanner;
import java.util.Locale;

public class Atividade2 {
 public static void main (String[]args){
     Scanner entrada = new Scanner (System.in).useLocale(Locale.US);
      int [] v = new int[15];
      int cont;
      for(cont=0; cont<=14;cont++) {
       System.out.println("insira 15 números");
       v[cont] = entrada.nextInt();
      }
      int percorrer=0;
      int menor= Integer.MAX_VALUE;
      int maior=0;
       while(percorrer<=14){
          if(v[percorrer]>maior){
             maior=v[percorrer];
            }
          if(v[percorrer]<menor){
             menor=v[percorrer];
            }
          percorrer++;
        }
        System.out.println("Maior valor digitado foi: "+maior);
        System.out.println("Menor valor digitado foi: "+menor);
    }
}