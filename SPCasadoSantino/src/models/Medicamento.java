package models;

import Interfaces.ISerializableCsv;
import java.time.LocalDate;


public class Medicamento extends ProductoFarmaceutico implements ISerializableCsv {
    private boolean requerimientoRecetaMediica;
    
    public Medicamento(boolean requerimientoRecetaMediica, String nombreComercial, String dosis, LocalDate fechaVencimiento) {
        super(nombreComercial, dosis,fechaVencimiento);
        this.requerimientoRecetaMediica = requerimientoRecetaMediica;
    }
    
    public Medicamento(){
    }
    
    public boolean isRequerimientoRecetaMediica() {
        return requerimientoRecetaMediica;
    }

    public void setRequerimientoRecetaMediica(boolean requerimientoRecetaMediica) {
        this.requerimientoRecetaMediica = requerimientoRecetaMediica;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Medicamento [");
        sb.append(super.toString());
        sb.append(", requerimientoRecetaMediica:").append(requerimientoRecetaMediica);
        sb.append("]");
        return sb.toString();
    }

    public String toCSV(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toCSV()).append(", Medicamento");    

        sb.append(",").append(this.requerimientoRecetaMediica);
        
        return sb.toString();
    }
    
    @Override
    public Medicamento fromCSV(String line) {
        String[] result = line.split(",");

        String nombre = result[0];
        String dosis = result[1];
        LocalDate fecha = LocalDate.parse(result[2]);
        String tipo = result[3];
        boolean requiereReceta = Boolean.parseBoolean(result[4].trim());

        return new Medicamento(requiereReceta, nombre, dosis, fecha);
    }


}
