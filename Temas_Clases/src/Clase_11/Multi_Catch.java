
package Clase_11;

import java.util.InputMismatchException;

public class Multi_Catch {
    public static void main(String[] args) {
        try{
           //Codigo suceptible de eror
       }
       catch(InputMismatchException ex){
           //Manejo del error del Input Mismatch
       }
       catch(ArithmeticException ex){
           //Manejo del error del Arithmetic
       }
       catch(Exception ex){
           //Manejo de un error no conteplado
       }
    }
}
