package Clase_5;
import java.util.Arrays;

public class Matrices {
    public static void main(String[] args) {
        int[][] enteros = {{50, 100, 150}, {44, 55, 66}};       //Declaro por valor especifico
        int [][] matriz = new int [2][3];                                   //Declaro por tamaño
        
        matriz[0][0] = 10;      //En la fila 0 asigo los valores
        matriz[0][1] = 20;
        matriz[0][2] = 30;
        
        matriz[1] = new int[] {40, 50, 60};     //Accedo a la fila 1 y agrego el array de tres numeros
        matriz[2] = new int[2];                     //En la fila 2 creo un array de 2 valores, por defoult 0 ambos de ellos
        matriz[2] = new int[]{4, 5};              //En la fila 2 creo un array de 2 valores, con los valores 4 y 5
        
        //Accedo a toda la fila
        System.out.println("Accedo a toda la fila");
        System.out.println(Arrays.toString(matriz[1]));     //{40, 50, 60}
        System.out.println();
        
        //Accedo a ver un elemento de una fila
        System.out.println("Accedo a ver un elemento de una fila");
        System.out.println(matriz[1][1]);       //50
        System.out.println();
        
        //RECORRER LA MATRIZ
        //1)
        System.out.println("Recorro por length");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        //2)
        System.out.println("Accedo por Array de ");
        for(int[] fila : matriz){
            for (int valor : fila){
                System.out.println(valor + " ");
            }
            System.out.println();
        }
    }
}
