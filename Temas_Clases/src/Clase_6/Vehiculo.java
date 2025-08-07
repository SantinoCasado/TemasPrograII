package Clase_6;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;
    
     public Vehiculo(){
        this.marca = null;
        this.modelo = null;
        this.año = 0;
                
    }
     
    public Vehiculo(String marca){
        this();
        this.marca = marca;     
    }
    
        public Vehiculo(String marca, String modelo){
        this(marca);
        this.modelo = modelo;     
    }
    
    public Vehiculo(String marca, String modelo, int año){
        this(marca, modelo);
        this.año = año;
                
    }
    
    
}
