import java.util.Random;

public class Atividade9 {
 public static void main (String[]args){
     Random gerador = new Random();
     int m[][] = new int[4][4]; 
     int m2[][] = new int[4][4];
       for(int linha = 0;linha<4;linha++){
          for(int coluna = 0; coluna<4;coluna++){
             m[linha][coluna] = gerador.nextInt(15);
             m2[linha][coluna] = gerador.nextInt(15);
            }
        }
      int matrizResultante[][] = new int[4][4];
       for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    matrizResultante[i][j] += m[i][k] * m2[k][j];
                }
            }
        }
       for (int i = 0; i < matrizResultante.length; i++) {
            for (int j = 0; j < matrizResultante[i].length; j++) {
                System.out.print(matrizResultante[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
