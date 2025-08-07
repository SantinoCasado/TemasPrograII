package models;

import interfaces.ICobrable;
import interfaces.ISerializableCsv;


public class Auto extends Vehiculo implements ICobrable, ISerializableCsv {
    private int cantPuertas;

    public Auto(int cantidadPuertas, String patente, String marca, String modelo, int cantHoras, double precioHora) {
        this(patente, marca, modelo, cantHoras, precioHora);
        this.cantPuertas = cantidadPuertas;
    }
    
    public Auto(String patente, String marca, String modelo, int cantHoras, double precioHora) {
        super(patente, marca, modelo, cantHoras, precioHora);
    }
    
    public Auto() {
    }
    
    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Auto: ").append(System.lineSeparator());
        sb.append(super.toString());
        sb.append("cantPuertas=").append(cantPuertas);

        return sb.toString();
    }
    
    @Override
    public double calcularPrecio() {
        
        double valor = this.precioHora * this.cantHoras;
        
        double valorIncrementado = valor + (valor * this.getIncremento());
        
        return valorIncrementado;
    }

    @Override
    public double getIncremento() {
        return 0.20;
    }
    
    @Override
    public String toCSV(){
        StringBuilder sb = new StringBuilder();
        //Usa super.toCSV() para obtener los campos comunes (como patente, marca, modelo, etc.).
        sb.append(super.toCSV()).append(this.calcularPrecio()).append(",Auto");     // Agrega el resultado de calcularPrecio() y agrega el tipo "Auto" como etiqueta.
        
        // Agrega cantPuertas, que es un atributo exclusivo de esta subclase.
        sb.append(",").append(this.cantPuertas);
        
        return sb.toString();
    }
    
    @Override
    public Auto fromCSV(String line) {
        System.out.println(line);
        
        // Divide la línea CSV en partes usando split(",").
        String[] result = line.split(",");
        
        // Extrae los valores en orden y los convierte a sus tipos correspondientes.
        String patente = result[0];
        String marca = result[1];
        String modelo = result[2];
        int cantHoras = Integer.parseInt(result[3]);
        double precioHora = Double.parseDouble(result[4]);
        String tipo = result[6];
        int cantPuertas = Integer.parseInt(result[7]);
        
        // Crea un nuevo objeto Auto con esos valores.
        Auto auto = new Auto(cantPuertas, patente, marca, modelo, cantHoras, precioHora);
        
        return auto;
    }
}
