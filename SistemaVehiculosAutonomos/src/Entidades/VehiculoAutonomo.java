package Entidades;
 
public abstract class VehiculoAutonomo {
    protected String marca;
    protected String modelo;

    public VehiculoAutonomo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public abstract void moverse();
    public abstract void detenerse();
    public abstract String reportarEstado();
    
    
}
