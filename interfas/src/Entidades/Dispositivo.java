
package Entidades;


public abstract class Dispositivo {
    protected String marca;
    protected Boolean encendido;

    public Dispositivo(String marca, Boolean encendido) {
        this.marca = marca;
        this.encendido = encendido;
    }

    public String getMarca() {
        return marca;
    }

    public Boolean getEncendido() {
        return encendido;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setEncendido(Boolean encendido) {
        this.encendido = encendido;
    }
    
    public void mostrarEstado(){
        if(this.encendido){
            System.out.println("El dispositivo esta encendido");
        }else{
            System.out.println("El dispositivo esta apagado" );
        }
    }
}
