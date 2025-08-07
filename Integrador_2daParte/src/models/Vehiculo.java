package models;

import interfaces.ISerializableCsv;
import java.util.Objects;

public abstract class Vehiculo implements ISerializableCsv {
     protected String patente;
    protected String marca;
    protected String modelo;
    protected int cantHoras;
    protected double precioHora;
    
    public Vehiculo(String patente, String marca, String modelo, int cantHoras, double precioHora) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.cantHoras = cantHoras;
        this.precioHora = precioHora;
    }
    
    public Vehiculo(){
        
    }

    public String getPatente() {
        return this.patente;
    }

       public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantHoras() {
        return this.cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public double getPrecioHora() {
        return this.precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.patente);
        
        return hash;
    }

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
        final Vehiculo other = (Vehiculo) obj;
        
        return Objects.equals(this.patente, other.patente);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("patente=").append(patente);
        sb.append(", marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append(", cantHoras=").append(cantHoras);
        sb.append(", precioHora=").append(precioHora);
        sb.append('}');
        
        return sb.toString();
    }
    
    
    //Este método toCSV() convierte un objeto en una línea de texto en formato CSV (valores separados por comas). 
    public String toCSV(){
        StringBuilder sb = new StringBuilder();
        
        //Agrega los campos del objeto (patente, marca, modelo, cantHoras, precioHora) uno por uno, separados por comas.
        sb.append(this.patente).append(",");
        sb.append(this.marca).append(",");
        sb.append(this.modelo).append(",");
        sb.append(this.cantHoras).append(",");
        sb.append(this.precioHora).append(",");
        
        return sb.toString();

    }
        
}
