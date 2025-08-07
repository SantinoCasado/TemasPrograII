package Entidades;

/**
Crear clase Taladro.

■ Atributos privados: rpm: int, inalambrico : Boolean.
■ Método mostrarTaladro(): String.
 */
public class Taladro extends Herramienta{
    private int rpm;
    private boolean inalambrico;
    
    
    public Taladro(){
        super();
        this.inalambrico = false;
        this.rpm = 0;
    }
    
    public Taladro(String marca, int peso, int rpm, boolean inalambrico) {
        super(marca, peso);
        this.rpm = rpm;
        this.inalambrico = inalambrico;
    }
    
    public String mostrarTaladro() {
         StringBuilder sb = new StringBuilder();
         
         sb.append(super.MostrarHerramienta());
         sb.append(System.lineSeparator());
         sb.append("RPM: ").append(rpm);
         sb.append(System.lineSeparator());
         sb.append("Inalambrico: ").append(inalambrico);
         sb.append(System.lineSeparator());
         
        return sb.toString(); 
    }

}
