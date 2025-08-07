package Test;
import Entidades.*;

public class Main {
    public static void main(String[] args) {
        Taller taller = new Taller(5);

        Herramienta taladro = new Taladro("Bosch", 1200, 1500, true);
        Herramienta llaveInglesa = new LlaveInglesa("Stanley", 800, TipoMaterial.CROMO_VANADIO, true);
        
        System.out.println(taller.agregarHerramienta(taladro)); // true
        System.out.println(taller.agregarHerramienta(llaveInglesa)); // true

        System.out.println("Cantidad de herramientas en el taller: " + taller.getCantidadHerramientas());
        System.out.println();
        System.out.println(taller.mostrarHerramientas());

    }
}

