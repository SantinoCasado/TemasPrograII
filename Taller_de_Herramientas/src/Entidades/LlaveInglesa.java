package Entidades;

/**
Crear clase LlaveInglesa.

■ Atributos privados: material: TipoMaterial, regulable: boolean.
■ Método mostrarLlaveInglesa(): String.
 */
public class LlaveInglesa extends Herramienta {
    private TipoMaterial material;
    private boolean regulable;
    
        public LlaveInglesa(){
        super();
        this.material = material.ACERO;
        this.regulable = false;
    }
    
    public LlaveInglesa(String marca, int peso, TipoMaterial material, boolean regulable) {
        super(marca, peso);
        this.material = material;
        this.regulable = regulable;
    }
    
    public String mostrarLlaveIngles() {
         StringBuilder sb = new StringBuilder();
         
         sb.append(super.MostrarHerramienta());
         sb.append(System.lineSeparator());
         sb.append("Tipo de Material: ").append(material);
         sb.append(System.lineSeparator());
         sb.append("Regulable: ").append(regulable);
         sb.append(System.lineSeparator());
         
        return sb.toString(); 
    }

}
