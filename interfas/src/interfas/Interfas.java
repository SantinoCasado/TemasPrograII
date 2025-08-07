
package interfas;

import Entidades.*;
import java.util.ArrayList;

public class Interfas {

    public static void main(String[] args) {
        
        ArrayList<Conectable> conect = new ArrayList();
        
        HeladeraInteligente h1 = new HeladeraInteligente("sony",true);
        HeladeraInteligente h2 = new HeladeraInteligente("sony",false);
          
        LamparaInteligente l1 = new LamparaInteligente("sony",true);
        SmartTV t1 = new SmartTV("soniiicy",true);
    
        
        conect.add(h2);
        conect.add(h1);
        conect.add(l1);
        conect.add(t1);
        
        for(Conectable elemento :conect){
           
        
        elemento.conectarWifi("vic");
        if(elemento instanceof LamparaInteligente){
            ((LamparaInteligente) elemento).setColor("azul");
        }
        if(elemento instanceof HeladeraInteligente){
        ((HeladeraInteligente) elemento).verTemperatura();
        }
        if(elemento instanceof SmartTV){
        ((SmartTV) elemento).reproducirStreaming("netxlix");
        }
        }
    }
    
}
