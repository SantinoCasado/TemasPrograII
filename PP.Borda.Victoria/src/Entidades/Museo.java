
package Entidades;

import Entidades.Escultura;
import Entidades.ObraArte;
import Entidades.Pintura;
import Entidades.TipoValor;
import java.util.ArrayList;
import java.util.Collections;

/**
 *Dicha clase posee dos atributos, ambos privados. Uno indicará la capacidad máxima que tendrá el
museo para almacenar obras (capacidad: int). El otro es una colección de tipo ObraArte “obras” (Elegir
la colección que crean correspondiente).
El constructor por defecto sin parámetros será el único que inicializará la colección de obras y
establecerá la capacidad máxima en 3 obras, la sobrecarga recibirá un entero con la capacidad.
Métodos de instancia:
 */
public class Museo {
    private int capacidad;
    private ArrayList<ObraArte> obras;
    
    public Museo(){
    this.obras = new ArrayList<ObraArte>();
    this.capacidad=3;
    }
    public Museo(int capacidad){
    this();    
    this.capacidad= capacidad;
    }
    
    public boolean sonIguales(ObraArte obra){
    return obras.contains(obra);
    }

    public void agregar(ObraArte obra){
    if (obras.size()< this.capacidad  & !obras.contains(obra)){
     this.obras.add(obra);
     System.out.println("se agrego ");
    }else{
        System.out.println("El museo esta lleno o la obra existe ya  " );
    }
    }
    
    public  double getValorDePinturas(){
       double contador = 0.0; 
        for (ObraArte elemento : this.obras) {
           if(elemento instanceof Pintura){
           contador += ((Pintura) elemento).getValorComercial();
          
        }
        }  
        return contador;
    }
     public  double getValorDeEsculturas(){
       double contador = 0.0; 
        for (ObraArte elemento : this.obras) {
           if(elemento instanceof Escultura){
           contador += ((Escultura) elemento).getValorComercial();
          
        }
        }
        
        return contador;
    }
     
     public static String mostrar(Museo museo){
         StringBuilder sb = new StringBuilder();
         for (ObraArte elemento : museo.obras) {
             sb.append("\n");
             sb.append("obra:  " );
             sb.append(elemento.toString());
                     
         }
         sb.append("\n");
         sb.append("cantidad de elementos  del museo : "+ museo.obras.size());
         
         return sb.toString();
     }
//     
//     ● Método privado y de instancia getValor(TipoValor), retornará el valor de las obras del museo de
//acuerdo con el enumerado que recibe como parámetro.
      
     private double getValor(TipoValor material ){
     double contador = 0.0;
  
        switch (material) {
             case TipoValor.ESCULTURAS:
                 contador = this.getValorDeEsculturas();
                 break;
            case TipoValor.PINTURAS:
                 contador = this.getValorDePinturas();
                 break;
            case TipoValor.TODAS:
                 contador = this.getValorTotal();
                 break;
             default:
                 throw new AssertionError();
         }

            return contador;
         }
     
     
     
     public double getValorTotal(){
        double contador  = this.getValorDePinturas()+this.getValorDeEsculturas(); 
         return contador;
   
      }

     public void ordenar(){
     Collections.sort(obras);
     }
}
