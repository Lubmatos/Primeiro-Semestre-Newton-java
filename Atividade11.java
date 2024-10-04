import java.util.Scanner;
import java.util.Locale;

public class Atividade11 {
   public static void main(String[]args){
     Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
     int v [] = new int[10];
     for(int i=0;i<=9;i++){
         System.out.println("informe 10 numeros inteiros desejados:");
         v[i] = entrada.nextInt();
        }
     System.out.println("Insira quanto você quer que se desloque no vetor:");
     int x = Integer.parseInt(entrada.next());  
     int teste=0;
     int contw=0;
     int contrario = v.length-1;
     int contrarioX= 0;
     int ajusteContrario = 0;
     int vfinal[] = new int[10];
        teste=9-x;  
      while(contw<teste){
         vfinal[contw]=v[contrario];
         contw++;
         contrario--; 
        }
        while(teste<v.length){
          vfinal[teste]=v[ajusteContrario];
          ajusteContrario++;
          teste++;
        }
        for(int i =0; i <=9; i++){
         System.out.println(vfinal[i] + "\t");
        }
    }

}
