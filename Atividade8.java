import java.util.Scanner;
import java.util.Locale;

public class Atividade8 {
 public static void main (String[]args){
  Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
  int m [] [] = new int[3][3];
    for(int i = 0; i<3;i++){
      for(int j=0; j<3; j++){
         System.out.println("Insira o valor desejado: ");
         m[i][j]=entrada.nextInt();
        }
    }
    int soma=0;
    for(int linha = 0; linha<3;linha++){
      for(int coluna = 0; coluna <3;coluna++){
       soma+=m[linha][coluna];
        }
     System.out.println( " a soma da linha " +soma);
     soma=0;
    }
    for(int coluna = 0;coluna<3 ;coluna++){
     for(int linha =0;linha<3;linha++){
      soma+=m[linha][coluna];
     }
      System.out.println( " a soma da coluna " +soma);
     soma=0;
    }
}
}
