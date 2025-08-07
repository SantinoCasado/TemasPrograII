package Clase_2;
import java.util.Scanner;

public class Clase_2 {              //Public hace referencia que se puede acceder desde cualquier paquete, default solo clases del mismo paquete y private solo en este archivo
    //atributos
    /* private or public or static */ String nombre;          //Por default no contiene nada
    /* private or public or static */ int edad;                    //Por default su valor es 0
    private String algo;
    int numero;         //default
   
    
    public void main(String[] args)
    {
    //
        
        int numero1=5;
/*
int: Es un tipo de dato primitivo y es más rápido y eficiente en términos de rendimiento porque ocupa menos memoria y no requiere procesamiento adicional. 
Es ideal cuando necesitas manejar grandes cantidades de datos numéricos sin funcionalidades adicionales. 
Por ejemplo, en cálculos matemáticos intensivos o bucles repetitivos, int suele ser la mejor opción.
*/
        
    Integer numero2=2;
/*
Integer: Es una clase envolvente que ofrece una gran cantidad de métodos útiles para la manipulación y conversión de números. Es recomendable cuando necesitas:
    - Usar colecciones como ArrayList, HashMap, etc., que solo aceptan objetos.
    - Realizar operaciones específicas como comparaciones con métodos (equals, compareTo).
    - Trabajar con conversiones de bases numéricas (binario, hexadecimal).
 */
        
    }
    public String getNombre() {                     //Permite obtener el atributo nombre
        return nombre;
    }

    public void setNombre(String nombre) {      //Permite modificar el atributo nombre
        this.nombre = nombre;
    }

    public int getEdad() {                              //Permite obtener el atributo edad
        return edad;
    }

    public void setEdad(int edad) {             //Permite modificar el atributo edad
        this.edad = edad;
    }
    
    
    
    
    
}
