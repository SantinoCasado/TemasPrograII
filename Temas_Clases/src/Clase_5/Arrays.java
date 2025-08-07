package Clase_5;


public class Arrays {
    public static void main(String[] args) {
        //Con INT
        int [] numeros = new int[5];        //Creo el Array junto con su tamaño
        
        numeros[0] = 2;             //Accedo por posicion
        numeros[1] = 4;
        numeros[2] = 3;
        numeros[3] = 7;
        numeros[4] = 10;
        
        System.out.println(numeros[2]);
        
        //Con STRING
        String[] palabras = {"hola", "mundo"};
                
         System.out.println(palabras[0]);
         
         //Formas de recorrer
         for(int i = 0; i < palabras.length; i ++){     //Dependiendo de su lenght, accede por indice
             System.out.println(palabras[i]);
         }
         
         for (String palabra : palabras){               //Por cada elemento del array, accede por valor
             System.out.println(palabra);
         }
    }
    
}
