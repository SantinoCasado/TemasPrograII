
package sistemabancario;
import Entidades.*;
import java.util.ArrayList;

public class SistemaBancario {


    
    public static void main(String[] args) {
       ArrayList<ProductoFinanciero> productos = new  ArrayList();
       CajaAhorro c1 = new CajaAhorro(4.0,"vic");
       CajaAhorro c2 = new CajaAhorro(4.0,"vic");
       CajaAhorro c3 = new CajaAhorro(4.0,"vc");
       
       CuentaCorriente cc1 = new CuentaCorriente(4.0,"gil");  
       CuentaCorriente cc2 = new CuentaCorriente(4.0,"gil");  
       CuentaCorriente cc3 = new CuentaCorriente(4.0,"gil");  
       
       PlazoFijo p1 = new PlazoFijo(4.0,"hol");
       PlazoFijo p3 = new PlazoFijo(4.0,"hol");
       PlazoFijo p5 = new PlazoFijo(4.0,"hol");
       
       productos.add(p5); 
       productos.add(p1);
       productos.add(p3);
       productos.add(c1);
       productos.add(c2);
       productos.add(cc3);
       productos.add(cc2);
       productos.add(cc1); 
       productos.add(c3);
       
       Banco b1 = new Banco(productos);
       
       System.out.println(b1.procesarMes());
       
       
       
    }
    
}
