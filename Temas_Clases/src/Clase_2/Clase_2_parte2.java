package Clase_2;

import Clase_2.Clase_2;

public class Clase_2_parte2 {
    public static void main(String[] args)
    {
        Clase_2 clase = new Clase_2();              
        
        clase.nombre = "santino";                   //accedo a los atributos de la clase y le asigno un valor
        clase.edad = 20;
        //clase.algo = "xd";                                //al estar en privado solo se puede acceder en el archivo mismo
        clase.numero = 10;                             //al estar en default SOLO se le puede asignar un valor si este esta en el mismo archivo
        
    }
}
