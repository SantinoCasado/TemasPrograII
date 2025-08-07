
package Entidades;

public class Herramienta {
    protected String marca;
    protected int peso;

    public Herramienta(String marca, int peso) {
        this.marca = marca;
        this.peso = peso;
    }
    
    
    protected String mostrarHerramienta(){
    StringBuilder sb = new StringBuilder();
    
    sb.append("Marca: ").append(this.marca).append("/n");
    sb.append("Peso: ").append(this.peso).append("/n");
          
        
        
    return sb.toString();
            }
    
}
