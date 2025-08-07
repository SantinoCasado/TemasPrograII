
package herramientas;
import Entidades.*;
public class Herramientas {

    public static void main(String[] args) {
    Herramienta t1 = new Taladro("bosh",3,45,false);
    Herramienta t2 = new Taladro("bosh",5,45,false);
    Herramienta l1 = new LlaveInglesa(TipoMaterial.ACERO,false,"puti",34);
    Herramienta l2 = new LlaveInglesa(TipoMaterial.CROMO_VANADIO,true,"puti",34);
    
    Taller taller = new Taller(2);
    
        System.out.println(  taller.agregarHerramientas(t2));
        System.out.println(  taller.agregarHerramientas(t1));
        System.out.println(  taller.agregarHerramientas(l1));
        System.out.println(  taller.agregarHerramientas(l2));
        
        System.out.println(taller.getCantidadHerramientas());
        System.out.println(taller.mostrarHerramientas());
    
    }
    
}
