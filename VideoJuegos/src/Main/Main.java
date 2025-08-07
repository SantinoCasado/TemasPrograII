package Main;
import Entidades.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <TipoConsola> consolasCompatibles1 = new  ArrayList <>();
        consolasCompatibles1.add(TipoConsola.PC);
        consolasCompatibles1.add(TipoConsola.PLAYSTATION);
        
        ArrayList <TipoConsola> consolasCompatibles2 = new  ArrayList <>();
        consolasCompatibles2.add(TipoConsola.XBOX);
        consolasCompatibles2.add(TipoConsola.PLAYSTATION);
        
        Consola c1 = new Consola("Mi playStation", TipoConsola.PLAYSTATION, 500);
        JuegoAccion j1 = new JuegoAccion("Call of Duty", 500, consolasCompatibles1);
        JuegoDeportes j2 = new JuegoDeportes("FIFA", 1, consolasCompatibles2);
        
        System.out.println(c1.agregarJuego(j1));
        System.out.println(c1.agregarJuego(j2));
        
        System.out.println(c1.mostrarJuegos());
    }
}
