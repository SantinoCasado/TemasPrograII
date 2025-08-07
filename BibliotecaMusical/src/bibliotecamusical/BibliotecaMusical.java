
package bibliotecamusical;

import Entidades.Album;
import Entidades.Artista;
import Entidades.Cancion;
import Entidades.EstiloMusical;
import Entidades.Gestor;
import Entidades.ListaDeReproduccion;
import Entidades.SerializadoraJson;
import java.util.ArrayList;


public class BibliotecaMusical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String biblioteca = "biblioteca.json";
        String favoritos = "favoritos.json";
       String albunes = "albunes.json";
        
        Gestor<Cancion> gc = new Gestor();
        Artista a1 = new Artista("MJ",EstiloMusical.COUNTRY);
        
        Cancion c1 = new Cancion("billie Jean",3.45,1982);
        Cancion c2 = new Cancion("Thriller",3.45,1982);
        Cancion c3 = new Cancion("La vida es bella ",3.45,1999);
        ArrayList<Cancion> canciones = new ArrayList(); 
        canciones.add(c2);
        canciones.add(c1);
        Album al = new Album("thriller", 1982,a1,canciones);
        
        ArrayList<Cancion> can2= new ArrayList();
        
        SerializadoraJson.guardar(canciones, favoritos);
                
        can2 = SerializadoraJson.leer(favoritos,Cancion.class);
//        for (Cancion cancion : can2) {
//            System.out.println(cancion.toString());
//        }
//        
        gc.agregar(c1);
        gc.agregar(c2);
        for (Cancion obtenerTodo : gc.obtenerTodos()) {
            System.out.println(obtenerTodo.toString());
        }
        gc.actualizar(c2, c3);
         for (Cancion obtenerTodo : gc.obtenerTodos()) {
            System.out.println(obtenerTodo.toString());
        }
        
        
        
        
        
    }
    
}
