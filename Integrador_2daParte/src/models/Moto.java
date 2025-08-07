package models;

import interfaces.*;

public class Moto extends Vehiculo implements ICobrable, ISerializableCsv{
    private int cilindrada;

    public Moto(int cilindrada, String patente, String marca, String modelo, int cantHoras, double precioHora) {
        this(patente, marca, modelo, cantHoras, precioHora);
        this.cilindrada = cilindrada;
    }
    
    public Moto() { 
    }
    
    public Moto(String patente, String marca, String modelo, int cantHoras, double precioHora) {
        super(patente, marca, modelo, cantHoras, precioHora);
    }
    
    public int getcilindrada() {
        return cilindrada;
    }

    public void setcilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Moto: ").append(System.lineSeparator());
        sb.append(super.toString());
        sb.append("Cilindrada= ").append(cilindrada);

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
        return 0.10;
    }
    
    @Override
    public String toCSV(){
        StringBuilder sb = new StringBuilder();
         //Usa super.toCSV() para obtener los campos comunes (como patente, marca, modelo, etc.).
        sb.append(super.toCSV()).append(this.calcularPrecio()).append(",Moto");     // Agrega el resultado de calcularPrecio() y agrega el tipo "Moto" como etiqueta.
        
        // Agrega cilindrada, que es un atributo exclusivo de esta subclase.
        sb.append(",").append(this.cilindrada);
        
        return sb.toString();
    }
    
    @Override
    public Moto fromCSV(String line) {
        // Divide la línea CSV en partes usando split(",").        
        String[] result = line.split(",");
        
        // Extrae los valores en orden y los convierte a sus tipos correspondientes.
        String patente = result[0];
        String marca = result[1];
        String modelo = result[2];
        int cantHoras = Integer.parseInt(result[3]);
        double precioHora = Double.parseDouble(result[4]);
        String tipo = result[6];
        int cilindrada = Integer.parseInt(result[7]);
        
        // Crea un nuevo objeto Moto con esos valores.
        Moto moto = new Moto(cilindrada, patente, marca, modelo, cantHoras, precioHora);
        
        return moto;
    }
}
