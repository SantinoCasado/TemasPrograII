package Utilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TxTSave {

    public static void guardarEnEscritorio(List<String> lineas) {
        String desktopPath = System.getProperty("user.home") + File.separator + "Desktop";
        File archivo = new File(desktopPath + File.separator + "medicamentos_proximos_a_vencer.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (String linea : lineas) {
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Archivo guardado en: " + archivo.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Ocurrió un error al escribir el archivo: " + e.getMessage());
        }
    }
}