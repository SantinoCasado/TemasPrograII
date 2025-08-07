package CSV;

public class csv {
    /**
    public static void recomendadaCSV()
    {
        String archivoCsv = "datos.csv";

        // Escribir encabezado + datos
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoCsv))) {
            bw.write("Nombre,Edad,Email");
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error al escribir el CSV: " + e.getMessage());
        }

        // Leer el CSV
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCsv))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] columnas = linea.split(",");
                System.out.println("Nombre: " + columnas[0] + ", Edad: " + columnas[1] + ", Email: " + columnas[2]);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el CSV: " + e.getMessage());
        }
    }
 */
}
