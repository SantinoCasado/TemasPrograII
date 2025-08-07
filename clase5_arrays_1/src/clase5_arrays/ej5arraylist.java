
package clase5_arrays;

import java.util.ArrayList;
import java.util.Objects;

public class ej5arraylist {
    private Integer numeroAEncontrar;
    private ArrayList<Integer> arraylist = new ArrayList();
    
   
    
   
    
    public void encontrarNumero(Integer numero){
        boolean mensaje = false;
        this.numeroAEncontrar=numero;
        cargarArray();
        for (int i = 0; i < this.arraylist.size(); i++) {
            if (Objects.equals(numero, this.arraylist.get(i))){
                System.out.println("El numero se encuentra en el indice:  " + i);
                mensaje = true;
            }
        }
        if(!mensaje){
            System.out.println("Su numero no esta en el array :C ");
        }
        
    }
    
    private void cargarArray(){
    
        for (Integer i = 0; i < 30; i++) {
            
            this.arraylist.add(i);
        }
    }
    
}
