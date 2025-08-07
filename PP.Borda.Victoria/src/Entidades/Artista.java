
package Entidades;

/**
 *Posee todos sus atributos privados nombre: String y apellido: String.
Un único constructor que inicializa dichos atributos y métodos:
● sonIguales(Artista , Artista): Retornará true, si los nombres y los apellidos son iguales, false,
caso contrario. Este método será público y estático.
● getNombreApellido(): Este método público y de instancia, retornará una cadena de caracteres
que contenga el nombre y apellido del artista, separados por guiones medios. Ej.: Pablo - Picasso.
 */
public class Artista {
    private String nombre;
    private String apellido;

    public Artista(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String getNombreyApellido(){
    StringBuilder sb = new StringBuilder();
    sb.append(this.nombre);
    sb.append("-");
    sb.append(this.apellido);
    
    return sb.toString();
    }
    
    public static boolean sonIguales(Artista art , Artista art2){
    if (art.nombre.equals(art2.nombre) & art.apellido.equals(art2.apellido)){
        return true;
    }
    return false;
    }
}
