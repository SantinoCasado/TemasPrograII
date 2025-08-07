package Entidades;

import java.util.Objects;
import java.util.Random;


public abstract class ObraArte implements Comparable<ObraArte>{
    protected Artista artista;
    protected int cantidadDeElementos;
    protected String titulo;
    protected Double valor;
    protected static Random generadorDeElementos;

  static {
        generadorDeElementos = new Random();
  
  }

    public ObraArte(Artista artista, String titulo, Double valor) {
        this.artista = artista;
        this.titulo = titulo;
        this.valor = valor;
        this.cantidadDeElementos = 0;
    }

   

    public ObraArte(String titulo, double valor, String nombre, String apellido) {
        this(new Artista(nombre,apellido),titulo,valor);
    }
    
    

    public int getCantidadDeElementos() {
        if (this.cantidadDeElementos == 0 ){
        return this.cantidadDeElementos= generadorDeElementos.nextInt(1,10);
        }else{
        return this.cantidadDeElementos;
        }
    }
    
    private static String mostar(ObraArte obra){
        return obra.toString();
    }
    
    public static boolean sonIguales(ObraArte obra , ObraArte obra2){
     return obra.titulo.equals(obra2.titulo) && Artista.sonIguales(obra.artista,obra2.artista);
    }
    
  @Override
    public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if (getClass() != obj.getClass()) {
        return false;
    }
    final ObraArte other = (ObraArte) obj;
    return ObraArte.sonIguales(other,this);
}
    
    @Override
    public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("artista").append(this.artista.getNombreyApellido());
    sb.append("titulo").append(this.titulo).append("\n");
    sb.append("cantidad elementos ").append(this.getCantidadDeElementos()).append("\n");
    
    return sb.toString();
    }

    @Override
    public int compareTo(ObraArte obra) {
            return this.titulo.compareTo(obra.titulo);
    }

  
    
    
}
