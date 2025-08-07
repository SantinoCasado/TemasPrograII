package Clase_13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Path desktopPath = Paths.get(System.getProperty("user.home"), "Desktop");          Obtiene el home del usuario de cualquier pc y luego le agrega el /Desktop
//File archivoEntrada = new File(desktopPath, "mensaje.txt");                                       /C:/.../mensaje.txt

public class Archivos {
    public static void main(String[] args) {
        File archivoEntrada = new File("entrada.txt");             // Crea un objeto File que apunta al archivo "entrada.txt". No lo abre ni lo modifica, solo indica que ese archivo existe o debe existir.
        File archivoSalida = new File("salida.txt");                 // Hace lo mismo con "salida.txt", indicando que este será el archivo donde se guardará la información procesada.

        try (           // Este bloque try-with-resources asegura que los objetos BufferedReader y BufferedWriter se cierren automáticamente cuando termina la ejecución.

            BufferedReader lector = new BufferedReader(new FileReader(archivoEntrada));         // Crea un lector para leer el archivo de entrada.
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoSalida))                //  Crea un escritor para escribir en el archivo de salida.
        ) {
            String linea;
            while ((linea = lector.readLine()) != null) {               // Se lee el archivo línea por línea. Cuando readLine() devuelve null, significa que se llegó al final del archivo
                // Transformamos el texto (por ejemplo , a mayuscula)
                String procesada = linea.toUpperCase();         // Se convierte la línea a mayúsculas usando toUpperCase().
                escritor.write(procesada);                                 // La línea procesada se escribe en el archivo de salida y luego se agrega un salto de línea.
                escritor.newLine();
            }
            System.out.println("Archivo procesado con éxito");
        } catch (IOException e) {                                       // Si ocurre un error de lectura o escritura, se captura la excepción IOException y se muestra un mensaje de error en System.err.
            System.err.println("Error al leer o escribir: " + e.getMessage());
        }
    }
}
