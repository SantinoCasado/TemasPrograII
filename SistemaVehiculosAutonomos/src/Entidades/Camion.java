package Entidades;

public class Camion extends VehiculoAutonomo{
    private String estado;

    public Camion(String marca, String modelo) {
        super(marca, modelo);
        this.estado = "Sin activar";
    }
    
    
    @Override 
    public void moverse(){
    this.estado = "Moviendose con acoplado";
    }
    @Override
    public void detenerse(){
    this.estado = "Camion parado ";
    }
    @Override
    public String reportarEstado(){
    return this.marca+" " + this.modelo +" "+this.estado;
    }
    
}
