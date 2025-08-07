package models;

import Excepciones.*;
import java.util.ArrayList;

public class Estacionamiento {
    
    private ArrayList<Vehiculo> vehiculos;
    private int cantidadMaxLugares;

    public Estacionamiento(int cantidadMaxLugares) {
        this.cantidadMaxLugares = cantidadMaxLugares;
        this.vehiculos = new ArrayList<>();
    }

    public Estacionamiento() {
        this(5);
    }
    
    public void agregarVehiculo(Vehiculo vehiculo){
        //Corroboro que no haya repetidos
       if (this.vehiculos.contains(vehiculo)){
           throw new VehiculoRepetidoException("El vehiculo ya se encuentra en el estacionamiento!");
       }
       
       //Corroboro que no supere el maximo
       if (this.vehiculos.size() == this.cantidadMaxLugares){
           throw new CantidadSuperadaException("El estacionamiento ya se encuentra lleno!");
       }
       
       //Sino agrego
       this.vehiculos.add(vehiculo);
       System.out.println("Vehículo Agregado");
   }
  
   /*
   public void modificarVehiculo(Vehiculo vehiculo){ 
    
   }
   */ 
    
    public  void eliminarVehiculo(Vehiculo vehiculo){
        this.vehiculos.remove(vehiculo);
    }
  
   public ArrayList<Vehiculo> getVehiculos() {        
        return vehiculos;
    }
}
