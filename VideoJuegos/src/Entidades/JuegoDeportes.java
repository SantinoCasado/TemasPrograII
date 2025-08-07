package Entidades;
import java.util.ArrayList;

/**
Crear clases derivadas JuegoAccion y JuegoDeportes.
■ Constructor que reciba todos los parámetros.
■ JuegoAccion: (compatible con PLAYSTATION y PC).
■ JuegoDeportes: (compatible con XBOX y PLAYSTATION).
 */
public class JuegoDeportes extends Juego{
    
     public JuegoDeportes(String titulo, double pesoGB, ArrayList<TipoConsola>  consolasCompatibles){
        super(titulo, pesoGB);
        super.consolasCompatibles = consolasCompatibles;
    }
}
