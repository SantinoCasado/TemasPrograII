package Clase_6;


public class Auto extends Vehiculo {            //Heredo la clase
    private int cantidadPuertas;
    
    public Auto(){
         super.marca = "Accedo a marca";            //Accedo directamente al atributo de la clase padre
    }
    
     public Auto(int cantidadPuertas, String marca, String modelo, int año){            
         super(marca, modelo, año);                             //Accedo al constructor de la clase padre, a travez del constructor de la subclase
         this.cantidadPuertas = cantidadPuertas;
                
    }
     
     
}
