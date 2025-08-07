
package Entidades;

public class SmartTV extends Dispositivo implements Conectable{

    public SmartTV(String marca, Boolean encendido) {
        super(marca, encendido);
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
        System.out.println("Se conecto al wifi :"+nombreWifi);
   }
    
    
    public void reproducirStreaming(String plataforma){
    if(this.encendido){
        System.out.println("Se esta reproduciendo " + plataforma);
    }
    }
}
