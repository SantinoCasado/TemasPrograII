
package Entidades;


public class Auto extends VehiculoAutonomo{
    private String estado;

    public Auto(String marca, String modelo) {
        super(marca, modelo);
        this.estado = "Sin activar";
    }
    
    @Override 
    public void moverse(){
    this.estado = "Ruedas girando";
    };
    @Override
    public void detenerse(){
    this.estado = "Auto detenido";
    };
    @Override
    public String reportarEstado(){
    return this.marca+" " + this.modelo +" "+this.estado;
    }
    
  

}
