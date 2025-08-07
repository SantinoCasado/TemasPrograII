
package Entidades;

public class LamparaInteligente extends Dispositivo implements Conectable {
    private String color;
    public LamparaInteligente(String marca, Boolean encendido) {
        super(marca, encendido);
        this.color = "Blanco calido";
    }

    @Override
    public void encender() {
        super.setEncendido(true);
    }

    @Override
    public void apagar() {
        super.setEncendido(false);
    }

    @Override
    public void conectarWifi(String nombreWifi) {
        System.out.println("Se conecto al wifi : " + nombreWifi );
    }
    
    public void setColor(String colorNuevo){
    this.color = colorNuevo;
        System.out.println("Color nuevo = " + colorNuevo);
    }
    
}
