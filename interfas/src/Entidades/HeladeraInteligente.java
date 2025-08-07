
package Entidades;


public class HeladeraInteligente extends Dispositivo implements Conectable{
    private double temperatura;

    public HeladeraInteligente(String marca, Boolean encendido) {
        super(marca, encendido);
        this.temperatura = 4.0;
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
    
    public void verTemperatura(){
        System.out.println("Temperatura:" + this.temperatura +"°C");
    }
    
    
}
