package models;

import interfaces.ISerializableCsv;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CSVUtilsGeneric<T extends ISerializableCsv> {  // Una clase genérica CSVUtilsGeneric que trabaja con cualquier tipo T que implemente la interfaz ISerializableCsv.
    
    public void escribirCSV(ArrayList<T> lista)
    {
        String archivoCsv = "datos.csv";        //-Se define el nombre del archivo de salida, en este caso "datos.csv"
        
         /*
        Se crea un BufferedWriter que envuelve un FileWriter, lo que permite escribir texto de forma más eficiente en el archivo.
        El uso de try con recursos (try (...)) garantiza que el BufferedWriter se cierra automáticamente al finalizar, incluso si ocurre una excepción.
        */
         
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoCsv))) {
            //  El tipo T tiene un método toCSV() que devuelve su representación como línea CSV.
            for (T item : lista) {
                bw.write(item.toCSV());     // Escribe la línea CSV de cada objeto en el archivo, sin salto de línea automático.
                bw.newLine();                   // Agrega un salto de línea después de cada objeto, para que cada uno ocupe una línea en el archivo.
            }
            
        } catch (IOException e) {
            System.err.println("Error al escribir el CSV: " + e.getMessage());
        }
    }

    public ArrayList<String> leerCSV(String ruta){
        // Leer el CSV
        ArrayList<String> lista = new ArrayList<>(); 

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {       // Abre un archivo CSV ubicado en la ruta que le pasás como parámetro (ruta).
            String linea;
            while ((linea = br.readLine()) != null) {
                lista.add(linea);       // Cada línea leída (que representa una fila del CSV) se agrega a una lista de tipo ArrayList<String>.
            }
        } catch (IOException e) {
            System.err.println("Error al leer el CSV: " + e.getMessage());      // Si ocurre un error al leer el archivo, lo captura y muestra un mensaje de error.
        }
        return lista;
    }
    
}

