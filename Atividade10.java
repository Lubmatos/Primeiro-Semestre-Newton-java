import java.util.Scanner;
import java.util.Locale;

public class Atividade10 {
 public static void main(String[]args){
     Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
     int v1 [] = new int[5];
     int v2 [] = new int[5];
      for(int cont = 0; cont<=4; cont++){
         System.out.println("informe os valores do primeiro vetor: ");   
         v1[cont] = entrada.nextInt();
         System.out.println("informe os valores do segundo vetor: ");
         v2[cont]= entrada.nextInt();
        }
       int v3[] = new int[5];
        for(int i=0; i<=4;i++){
            for(int x=0; x<4;x++){
               if (v1[i]==v2[x]) {
                 v3[i]=v1[i];   
                }     
            }
        }
       for(int p =0; p<=4; p++){
         System.out.println("Número comum: "+v3[p]);
        }
    }
}
