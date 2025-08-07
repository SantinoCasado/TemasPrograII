package models;

import interfaces.ICobrable;


public class Camioneta extends Vehiculo implements ICobrable {
    private int capacidadCarga;

    public Camioneta(int capacidadCarga, String patente, String marca, String modelo, int cantHoras, double precioHora) {
        this(patente, marca, modelo, cantHoras, precioHora);
        this.capacidadCarga = capacidadCarga;
    }
    
        public Camioneta(String patente, String marca, String modelo, int cantHoras, double precioHora) {
        super(patente, marca, modelo, cantHoras, precioHora);
       
    }
    public Camioneta() {
    }

     public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Camioneta: ").append(System.lineSeparator());
        sb.append(super.toString());
        sb.append("capacidadCarga=").append(capacidadCarga);

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
        return 0.30;
    }
    
    public String toCSV(){
        StringBuilder sb = new StringBuilder();
         //Usa super.toCSV() para obtener los campos comunes (como patente, marca, modelo, etc.).
        sb.append(super.toCSV()).append(this.calcularPrecio()).append(",Camioneta");    // Agrega el resultado de calcularPrecio() y agrega el tipo "Camioneta" como etiqueta.

        // Agrega cilindrada, que es un atributo exclusivo de esta subclase.        
        sb.append(",").append(this.capacidadCarga);
        
        return sb.toString();
    }
    
    @Override
    public Camioneta fromCSV(String line) {
        // Divide la línea CSV en partes usando split(",").         
        String[] result = line.split(",");
 
        // Extrae los valores en orden y los convierte a sus tipos correspondientes.        
        String patente = result[0];
        String marca = result[1];
        String modelo = result[2];
        int cantHoras = Integer.parseInt(result[3]);
        double precioHora = Double.parseDouble(result[4]);
        String tipo = result[6];
        int capacidadCarga = Integer.parseInt(result[7]);
        
        // Crea un nuevo objeto Moto con esos valores.
        Camioneta camioneta = new Camioneta(capacidadCarga, patente, marca, modelo, cantHoras, precioHora);
        
        return camioneta;
    }
}
