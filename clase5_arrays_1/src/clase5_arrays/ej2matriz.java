
package clase5_arrays;

import java.util.Random;

public class ej2matriz {
    private int[][] matriz = new int [3][3];
    
    public void ProgramaMatriz(){
    Random random = new Random(); 
          for (int i = 0; i < 3; i++) {      
              for (int j = 0; j < 3; j++) {   
                matriz[i][j] = random.nextInt(100); 
            }
        }
          
        System.out.println("Suma total de los elementos = " + sumarMatriz());
        System.out.println("Matriz = ");
        mostrarMatriz();
    }      
          
    private int sumarMatriz(){
        int acumulador = 0 ; 
        for (int i = 0; i < 3; i++) {      
              for (int j = 0; j < 3; j++) {   
                acumulador += matriz[i][j]; 
            }
         }
        return acumulador;
    }      
    
    private void mostrarMatriz(){
    for (int i = 0; i < 3; i++) {      
              for (int j = 0; j < 3; j++) {   
                  System.out.print(matriz[i][j]+" "); 
            }
              System.out.println(" ");
         }
    }
    
}
