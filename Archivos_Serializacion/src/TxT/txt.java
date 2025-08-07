package TxT;

public class txt {
    /**
    public static void recomendadaTXT()
    {
        File archivoEntrada = new File("entrada.txt");
        File archivoSalida = new File("salida.txt");


        try (
            BufferedReader lector = new BufferedReader(new FileReader(archivoEntrada));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoSalida))
        ) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                // Transformamos el texto (por ejemplo, a mayúsculas)
                String procesada = linea.toUpperCase();
                escritor.write(procesada);
                escritor.newLine(); // Añade salto de línea
            }
            System.out.println("Archivo procesado con éxito.");
        } catch (IOException e) {
            System.err.println("Error al leer o escribir: " + e.getMessage());
        }
    }
    
    public static void guardarEnEscritorio()
    {
        // Obtener ruta del escritorio
        String desktopPath = System.getProperty("user.home") + File.separator + "Desktop";
        Path desktopPath2 = Paths.get(System.getProperty("user.home"), "Desktop");

        // Crear el archivo en esa ruta
        File archivo = new File("mensaje.txt");
        File archivo2 = new File("mensaje2.txt");

        // Escribir en el archivo con FileWriter y BufferedWriter
        try (FileWriter fw = new FileWriter(archivo);
                FileWriter fw2 = new FileWriter(archivo2);
             BufferedWriter bw = new BufferedWriter(fw);
                BufferedWriter bw2 = new BufferedWriter(fw2)) {

            bw.write("Este archivo fue generado desde Java");
            bw.newLine();
            bw.write("Funciona perfectamente");
            
            bw2.write("Este archivo fue generado desde Java");
            bw2.newLine();
            bw2.write("Funciona perfectamente");
            System.out.println("Archivo guardado en: " + archivo.getAbsolutePath());
            System.out.println("Archivo2 guardado en: " + archivo2.getAbsolutePath());

        } catch (IOException e) {
            System.err.println("Ocurrió un error al escribir el archivo: " + e.getMessage());
        }
    }
    
    */
}
