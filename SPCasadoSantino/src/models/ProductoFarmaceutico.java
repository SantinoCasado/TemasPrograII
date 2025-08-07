package models;

import Exceptions.ProductFarmaVencidoException;
import Interfaces.ISerializableCsv;
import Validaciones.ValidadorProductosFarmaceuticos;
import java.time.LocalDate;
import java.util.Objects;

public abstract class ProductoFarmaceutico implements ISerializableCsv {
    protected String nombreComercial;
    protected String dosis;
    protected LocalDate fechaVencimiento;

    public ProductoFarmaceutico(String nombreComercial, String dosis, LocalDate fechaVencimiento) {
        this.nombreComercial = nombreComercial;
        this.dosis = dosis;
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public ProductoFarmaceutico(){
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        ValidadorProductosFarmaceuticos.validarNombre(nombreComercial);
        this.nombreComercial = nombreComercial;
    }


    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosisMedida) {
        ValidadorProductosFarmaceuticos.validarDosis(dosis);
        this.dosis = dosisMedida;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        //Corrigo y agrego validacion en el set Fecha vencimiento
        ValidadorProductosFarmaceuticos.ValidarFechaVencimiento(fechaVencimiento);
        this.fechaVencimiento = fechaVencimiento;    
    }

    //Agrego el equals para revisar repetidos
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductoFarmaceutico other = (ProductoFarmaceutico) obj;
        if (!Objects.equals(this.nombreComercial, other.nombreComercial)) {
            return false;
        }
        if (!Objects.equals(this.dosis, other.dosis)) {
            return false;
        }
        return Objects.equals(this.fechaVencimiento, other.fechaVencimiento);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre:").append(nombreComercial);
        sb.append(", Dosis: ").append(this.dosis);
        sb.append(", FechaVencimiento:").append(fechaVencimiento);

        return sb.toString();
    }
    
    @Override
    public String toCSV(){
        return nombreComercial + "," + dosis + "," + fechaVencimiento;
    }
}
