package Entidades;

public class LlaveInglesa extends Herramienta {
    private TipoMaterial material;
    private Boolean regulable;

    public LlaveInglesa(TipoMaterial material, Boolean regulable, String marca, int peso) {
        super(marca, peso);
        this.material = material;
        this.regulable = regulable;
    }
    
    public String mostrarLlaveInglesa(){
    StringBuilder sb = new StringBuilder(super.mostrarHerramienta());
    sb.append("Material: ").append(this.material).append("\n");
    sb.append(this.regulable? "si" : "no" ).append("\n");
    
    
        return sb.toString();
    }
         
}
