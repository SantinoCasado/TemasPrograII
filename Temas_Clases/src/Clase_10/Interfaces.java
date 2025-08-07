package Clase_10;



public class Interfaces {
    public static void main(String[] args) {
        Operacion suma= (a, b) -> a+b;
        Operacion resta= (a, b) -> a-b;
        Operacion multiplicacion= (a, b) -> a*b;
        
        Operacion division= Interfaces:: dividir;
        
        System.out.println(suma.calcular(3, 2));
        System.out.println(resta.calcular(2, 2));
        System.out.println(multiplicacion.calcular(3, 2));
        System.err.println(division.calcular(4, 2));
        
    }
    
    public static int dividir(int a, int b){
        return a/b;
    }
}
