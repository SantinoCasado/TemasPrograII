package Archivo;


public class archivo {
 /*
     //SERIALIZACION BINARIA Y ARCHIVO
        Persona persona = new Persona("Juan", 30);
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream("persona.dat")))) {
            
            oos.writeObject(persona);
            
            System.out.println("Objeto serializado en binario.");
            System.out.println("");
            
        } catch (IOException e) {
            System.out.println("Ocurrio un error al serializar BINARIO: " + e.getMessage());
            System.out.println("");
        }
    
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
    
         //SERIALIZACION XML Y ARCHIVO
        PersonaXML personaXML = new PersonaXML("Lucía", 28);
        
        try {
            JAXBContext context = JAXBContext.newInstance(PersonaXML.class);
            
            Marshaller marshaller = context.createMarshaller();
            
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Serializa directamente con BufferedWriter
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("persona.xml"))) {
                marshaller.marshal(personaXML, writer);
            }

            System.out.println("Objeto guardado como XML.");
            System.out.println("");
        } catch (Exception e) {
            
            System.out.println("Ocurrio un error al serializar XML: " + e.getMessage());
            System.out.println("");
        }
        
 */
}
