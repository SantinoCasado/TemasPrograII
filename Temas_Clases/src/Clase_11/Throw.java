package Clase_11;

public class Throw {
    public static int factorial(int num){
        if (num < 0){
            throw new  ArithmeticException("No existe el factorial de un numero negativo");
        }
        else if(num > 12){
            throw new IllegalArgumentException("El factorial de 12 excede el rango de un int");
        }
        int fact = 1;
        for (int i = 2; i <= num ; i++) {
            fact *= i;
        }
        return fact;
    }
}
