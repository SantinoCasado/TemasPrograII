package Json;


public class json {
    /*
     //SERIALIZACION JSON Y ARCHIVO
        PersonaJSON personaJSON = new PersonaJSON("Carlos", 35);

        Gson gson = new GsonBuilder().setPrettyPrinting().create(); // JSON bien formateado
        
        String json = gson.toJson(personaJSON); // Convertir objeto a JSON

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("persona.json"))) {
            
            writer.write(json);
            
            System.out.println("Objeto serializado a JSON con Gson.");
            System.out.println("");
            
        } catch (IOException e) {
            
            System.out.println("Ocurrio un error al serializar JSON: " + e.getMessage());
            System.out.println("");
        }
        
        //DESERIALIZACION JSON
        try (BufferedReader br = new BufferedReader(new FileReader("persona.json"))) {
            
            Gson gsonReader = new Gson();
            
            PersonaJSON personaDeserializa = gsonReader.fromJson(br, PersonaJSON.class);
            
            System.out.println(personaDeserializa.getNombre());
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Ocurrio un error al deserializar JSON: " + e.getMessage());
            System.out.println("");
        }
        
        
        //SERIALIZAR LISTA JSON
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Ana", 30));
        personas.add(new Persona("Luis", 25));

        Gson gson2 = new GsonBuilder().setPrettyPrinting().create(); // JSON bien formateado
        
        String json2 = gson2.toJson(personas); // Convertir objeto a JSON

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("personas.json"))) {
            
            writer.write(json2);
            
            System.out.println("Lista serializada a JSON con Gson.");
            System.out.println("");
            
        } catch (IOException e) {
            
            System.out.println("Ocurrio un error al serializar la lista JSON: " + e.getMessage());
            System.out.println("");
        }
        
        
        //DESERIALIZACION LISTA JSON
        try (BufferedReader br = new BufferedReader(new FileReader("personas.json"))) {
            
            java.lang.reflect.Type listType = new TypeToken<List<PersonaJSON>>() {}.getType();

            List<PersonaJSON> personasLista = gson2.fromJson(br, listType);

            for (PersonaJSON p : personasLista) {
                System.out.println("Nombre: " + p.getNombre() + ", Edad: " + p.getEdad());
            }
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Ocurrió un error al deserializar JSON: " + e.getMessage());
            System.out.println("");
        }
        // </editor-fold>
*/
}
