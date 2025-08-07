/*
Crear una clase Banco que tenga una lista de ProductoFinanciero y un método
procesarMes() que invoque polimórficamente los métodos de cada producto.
 */
package Entidades;

import java.util.ArrayList;


public class Banco {
    private ArrayList<ProductoFinanciero> productos;

    public Banco(ArrayList<ProductoFinanciero> productos) {
        this.productos = productos;
    }
    
    
    public String procesarMes(){
    Double intereses = 0.0 ;
    Double saldo =0.0 ;
    int cantidadPlazoF =0;
        for (ProductoFinanciero producto : productos) {
            intereses += producto.calcularIntereses();
            saldo+=producto.saldo;
            if(producto instanceof PlazoFijo){
                cantidadPlazoF++;
            }
           
        }
    StringBuilder sb = new StringBuilder();
    sb.append("RESUMEN MENSUAL: ").append("\n");
    sb.append("Saldo entre todas sus cuentas : ").append(saldo).append("\n");
    sb.append("Intereses acumulados totales: ").append(intereses).append("\n");

        
    return sb.toString();
    }
    
}
