
package clase5_arrays;

import java.util.Scanner;

public class ej1vector {
    
    private int[] arrayNumeros = new int [10];
    
    
    public void Programa(){
        int acumulador = 0;
        
        for (int i = 0; i < 10; i++) {
            
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero : ");
        int numero = scanner.nextInt();
        this.arrayNumeros[i]= numero;
        acumulador +=numero;
        }
        
        int promedio = acumulador/10;
        
        System.out.println("promedio = " + promedio);
        for(int numero : this.arrayNumeros){
            if (this.MayoresAPromedio(numero, promedio)){
                System.out.println("mayor al promedio: " + numero);
            }    
        }
        
        int[] resultados = mayorYMenor();
        System.out.println("Mayor: " + resultados[0]);
        System.out.println("Menor: " + resultados[1]);
    }
    
    private boolean MayoresAPromedio(int numero , int promedio ){  
        
    return numero>promedio;
    }
    
   private int[] mayorYMenor() {
    int mayor = this.arrayNumeros[0];
    int menor = this.arrayNumeros[0];
    for (int numero : this.arrayNumeros) {
        if (numero > mayor) {
            mayor = numero;
        }
        if (numero < menor) {
            menor = numero;
        }
    }
    return new int[]{mayor, menor};
}

}
    
    

