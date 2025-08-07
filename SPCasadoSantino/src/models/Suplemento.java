package models;

import Interfaces.ISerializableCsv;
import Validaciones.ValidadorProductosFarmaceuticos;
import java.time.LocalDate;

public class Suplemento extends ProductoFarmaceutico implements ISerializableCsv {
    private String objetivo;

    public Suplemento(String objetivo, String nombreComercial, String dosis, LocalDate fechaVencimiento) {
        super(nombreComercial, dosis, fechaVencimiento);
        this.objetivo = objetivo;
    }
    
    public Suplemento(){
        
    }
    
    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        ValidadorProductosFarmaceuticos.validarObjetivo(objetivo);
        this.objetivo = objetivo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Suplememento[");
        sb.append(super.toString());
        sb.append(", Objetivo: ").append(objetivo);
        sb.append("]");
        return sb.toString();
    }
    
        public String toCSV(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toCSV()).append(",Suplemento");    


        sb.append(",").append(this.objetivo);
        
        return sb.toString();
    }
    
    @Override
    public Suplemento fromCSV(String line) {
        // Divide la línea CSV en partes usando split(",").         
        String[] result = line.split(",");
       
        // Extrae los valores en orden y los convierte a sus tipos correspondientes.        
        String nombre = result[0];
        String dosis = result[1];
        LocalDate fecha = LocalDate.parse(result[2]); // si el CSV tiene formato ISO (yyyy-MM-dd)
        String tipo = result[3];
        String objetivo = result[4];
        
        // Crea un nuevo objeto Moto con esos valores.
        Suplemento suplemento= new Suplemento(objetivo, nombre, dosis, fecha);
        
        return suplemento;
    }
    
}
