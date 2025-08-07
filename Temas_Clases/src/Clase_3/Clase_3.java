package Clase_3;

public class Clase_3 {
    
    public static void main(String[] args) {
        
        Vehiculo v1 = new Vehiculo("toyota", "Hilux", 1992);
        Vehiculo v2 = new Vehiculo("Fiat", "Fiorino", 2000);
        
        System.out.println(v1.Mostrar());
        System.out.println(v2.Mostrar());
        
        v2.marca= v1.marca;         //Le asigno el atributo marca de v1 a v2
        System.out.println(v2.Mostrar());
        
        v1 = v2;        //Le asigno todos los atributos de v2 a v1
        System.out.println(v1.Mostrar());
        
        ConexionsBD con1 = ConexionsBD.getInstancia();
        
        
    }
    
}
