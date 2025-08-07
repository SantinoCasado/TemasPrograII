package Clase_3;


public class Vehiculo {
    String marca;
    String modelo;
    int anio;
    static String owner;
    
    static{  
    
        owner=null;
    }
    
    public Vehiculo (String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    
    public String Mostrar(){
        return this.marca+ " "+ this.modelo + " "+this.anio ;
    }
    
    
}
