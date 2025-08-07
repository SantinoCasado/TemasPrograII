package Entidades;
import java.util.ArrayList;

/**
Crear clase Consola.

■ Atributos privados: nombre:String, tipo: TipoConsola, capacidadMaximaGB:
double, juegosInstalados: ArrayList<Juego>.
■ Constructor que reciba nombre, tipo y capacidadMaximaGB.
■ Método agregarJuego(Juego): Boolean : Permite agregar un juego sólo si es
compatible y si hay espacio.
■ Método mostrarJuegos(): int : Muestra los juegos instalados.
 */
public class Consola {
    private String nombre;
    private TipoConsola tipoConsola;
    private double capacidadMaximaGB;
    private ArrayList<Juego> juegosInstalados;
    
    
    public Consola(String nombre, TipoConsola tipoConsola, double capacidadMaximaGB){
        this.nombre = nombre;
        this.tipoConsola = tipoConsola;
        this.capacidadMaximaGB = capacidadMaximaGB;
        this.juegosInstalados = new ArrayList<>();
    }
    
    public boolean agregarJuego(Juego juego){
        if(!juego.esCompatible(this.tipoConsola)){
            return false;
        }
        double espacioUsado = 0;
        for (Juego j : juegosInstalados) {      // Verifica si hay espacio suficiente
            espacioUsado += j.getPesoGB();
        }
          if (espacioUsado + juego.getPesoGB() > this.capacidadMaximaGB) {
            return false;
        }
        // Si pasa las dos validaciones, agregar el juego
        juegosInstalados.add(juego);
        
        return true;
    }
    
    public String mostrarJuegos(){
        StringBuilder sb = new StringBuilder();
        for (Juego juegosInstalado : juegosInstalados) {
            sb.append(juegosInstalado.mostrarJuego());
            sb.append(System.lineSeparator());
        }
        
        return sb.toString();
    }
}
