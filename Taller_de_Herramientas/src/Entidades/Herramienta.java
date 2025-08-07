package Entidades;

/**
Crear clase Herramienta.

■ Atributos protegidos: marca: String, peso: int.
■ Método mostrarHerramienta(): String.
 */
public class Herramienta {
    protected String marca;
    protected int peso;
    
    public Herramienta(){
        this.marca = null;
        this.peso = 0;
    }
    
    public Herramienta(String marca){
        this();
        this.marca = marca;
    }
    
    public Herramienta(String marca, int peso){
        this(marca);
        this.peso = peso;
    }
    
    public String MostrarHerramienta(){
        StringBuilder sb = new StringBuilder();
        sb.append("Marca:  ").append(marca);
        sb.append(System.lineSeparator());
        sb.append("Peso: ").append(peso);
        sb.append(System.lineSeparator());
        
        return sb.toString();
    }
}
