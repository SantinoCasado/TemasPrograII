package Entidades;
import java.util.ArrayList;


/**
Crear clase Juego.

■ Atributos privados: titulo: String, pesoGB: double.
■ Atributo protegido: consolasCompatibles: ArrayList<TipoConsola>
■ Constructor que reciba un título y un pesoGB.
■ Métodos getter para los atributos.
■ Método mostrarJuego(): String: retornar valores del objeto.
■ Método esCompatible(TipoConsola): Boolean : Devuelve true si es
compatible con la consola recibida.
 */
public class Juego {
    private String titulo;
    private double pesoGB;
    protected ArrayList<TipoConsola> consolasCompatibles;
    
    public Juego(String titulo, double pesoGB){
        this.titulo = titulo;
        this.pesoGB = pesoGB;
        this.consolasCompatibles = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPesoGB() {
        return pesoGB;
    }

    public ArrayList<TipoConsola> getConsolasCompatibles() {
        return consolasCompatibles;
    }
    
    public String mostrarJuego(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("Titulo: ").append(this.titulo);
        sb.append(System.lineSeparator());
        sb.append("PesoGb: ").append(this.pesoGB);
        sb.append(System.lineSeparator());
        sb.append("Consolas Compatibles: ");
        
        for (TipoConsola consolasCompatible : this.consolasCompatibles) {
            sb.append(consolasCompatible);
            sb.append(System.lineSeparator());
        }
        
        return sb.toString();
    }
    
    public boolean esCompatible(TipoConsola tipoConsola){
        return this.consolasCompatibles.contains(tipoConsola);
    }
}
