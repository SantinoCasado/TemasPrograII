package Clase_1;

import java.util.Scanner;


public class Clase_1 {
    
    final static double CONSTANTE=8; // "final static double" declara una constante en toda la clase
    
    public static void main(String[] args) {    // Aqui se ejecuta el codigo
        
        byte numeroByte=2;      //El byte va de -128 a 128
        short numeroShort=100;   //El short va de  -32768 a 32768
        int numeroInt= 4;      // El int va de -2147483648 a 2147483648
        long numeroLong= 1000;       //Es el valor mas grande
        float numeroFloat=11;
        double numeroDouble=23;

        
        numeroInt=9;       //Cambio el valor de la variable a 9
        
        byte NumeroByte2 = (byte) numeroInt;   //Lo conmbierto en byta para evitar perdida de dato
        
        System.out.println("Hello World!");  //El "ln" hace salto de linea
        System.out.println(numeroInt);  //Llamo a la variable numeroInt
        System.out.println(numeroLong);     //Llamo la variable numeroLong
        System.out.println(numeroByte);     //Llamo la variable numeroByte
        System.out.println(numeroShort);    //Llamo la variable numeroShort
        System.out.println(numeroFloat);    //Llamo la variable numeroFloat
        System.out.println(numeroDouble);    //Llamo la variable numeroDouble
        
        Algo();     //Llamo la accion del constante
        
        Mostrar(NumeroByte2);
        Mostrar(numeroInt);    //Llamo la accion de mostrar e ingreso el parametro (En este caso la variable que tiene como valor 4)
        
        //¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
        //OPERADORES
        
        int numero1=5;
        int numero2=6;
        int resultado=0;
        
        resultado= numero1+numero2;
        resultado=numero1-numero2;
        resultado=numero1*numero2;
        resultado=numero1/numero2;
        
        double resultado2= numero1/numero2;        //Va a dar el numero con como y resto 0 hay que combertir en double uno de los dos numeros
        
        String pais="Argentina";
        
        boolean esMayorDeEdad= numero1 >= 18;       // MAYOR-IGUAL
        boolean esMayor= numero1 > 18;                     // MAYOR
        boolean esMenorDeEdad= numero1 <= 18;      // MENOR-IGUAL
        boolean esMenor= numero1 < 18;                     // MENOR 
        boolean esDiferente= numero1 != 24;               // DISTINTO
        boolean esArgentino= pais == "Argentina";       // IGUALAR
        boolean esItaliano= !esArgentino;                     // NEGAR
        
        boolean And= numero1 == 5 && numero2 == 6;  // OPERADOR AND
        boolean Or= numero1 == 5 || numero2 < 6;       // OPERADOR OR
        
        //----------------------------------------------------------------------------------------------------------------
        // CONDICIONALES
        
        byte dia= 1;
        
        if (numero1 >= 3){          // El if
            System.out.println("Es mayor");
        }else if (numero1 == 3) {   // El elif
            System.out.println("Tiene justo 3");
         } else {                           // El esle
            System.out.println("Es menor");     
        }
        
        switch (dia) {                  //MATCH-CASE
            case 1:
                    System.out.println("Lunes");    //CASO 1
                break;  // Breack para que pare todo proceso y no siga ejecutando o leyendo codigo de mas
            case 2:
                    System.out.println("Martes");   //CASO 2
                break;
            default:
                    System.out.println("No existe");    // COMODIN
         }
        //-----------------------------------------------------------------------------------------------------------------------
        // Estructuras Repetitivas
        
        int x=0;
      
        for (int i = 0; i < 10; i++)        //int i = 0 es la variable creada solo dentro de es for, i < 10 es la condicion e i++ es la iteracion (por cada ronda i se le suma 1)
        {
            System.out.println("Variable: "+ i);
        }
        
        for (int i = 0; i < 10; i--)        //int i = 0 es la variable creada solo dentro de es for, i < 10 es la condicion e i++ es la iteracion (por cada ronda i se le resta 1)
        {
            System.out.println("Variable: "+ i);
        }
        
        for (int i = 0; i < 10;)        //int i = 0 es la variable creada solo dentro de es for, i < 10 es la condicion
        {
            System.out.println("Variable: "+ i);
        }
        
        
        while (15 > x){
            x++;        
            System.out.println("Entramos en el while: "+ x);
        }
        
        
        do {
            System.out.println("La primera vuelta siempre entra");
        } while (15 > x);
        
        //-----------------------------------------------------------------------------------------------------------------------------------------
        // ENTRADA Y SALIDA DE DATOS
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese numero: ");
        int numero= scanner.nextInt();  //El enter queda flotando
        
        String palabra= scanner.nextLine();     //Aqui toma el enter y npo deja escribir
        
        //Solucion 1
        System.out.println("Ingrese numero: ");
        int numero10= scanner.nextInt();  //El enter queda flotando
        
        scanner.nextLine();         //Aqui toma el enter anterior
        
        String palabra1= scanner.nextLine();     //Aqui toma el enter y npo deja escribir
        
        //Solucion 2
        System.out.println("Ingrese numero: ");
        int numero11= Integer.parseInt(scanner.nextLine());  //Aqui recibo el numero como str pero el parseInt lo cambia a numero y asi ingreso el dato en forma de int evitando el problema del enter
        
        String palabra2= scanner.nextLine();
                
    }
        
         public static void Algo(){        //Creo una accion
             System.out.println(CONSTANTE);     //Llamo a la constante que esta estatica y se comparte en toda la clase
         }

        public static void Mostrar(int entero){     //Creo una accion
            System.out.println("numero: "+ entero );  // Creo una funcion que necesita un parametro (el entero) y devuelve un prit con dicho parametro
    }
}
