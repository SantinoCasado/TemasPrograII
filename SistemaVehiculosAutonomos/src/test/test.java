
package test;
import Entidades.*;
import java.util.ArrayList;

public class test {
     public static void main(String[] args) {
       VehiculoAutonomo a1=new Auto("toyota","corola");
       VehiculoAutonomo c1 = new Camion("ford","114");
       VehiculoAutonomo d1=new Dron("toshiba","45");
       VehiculoAutonomo a2=new Auto("fiat","uno");
       VehiculoAutonomo c2 = new Camion("mercedes","114");
       VehiculoAutonomo d2=new Dron("huawei0","5");
       
       ArrayList<VehiculoAutonomo> lista = new ArrayList<>();
       lista.add(a1);
       lista.add(a2);
       lista.add(c1);
       lista.add(c2);
       lista.add(d1);
       lista.add(d2);
       CentralComando central = new CentralComando(lista);
       
       central.moverVehiculos(a1);
      
       central.reportarEstado(a1);
       central.reportarEstado(d1);
       central.reportarEstado(c2);
    }
}
