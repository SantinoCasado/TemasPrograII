package XML;

public class xml {
    /**
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
        
        //DESERIALIZACION
         try {
            JAXBContext context = JAXBContext.newInstance(PersonaXML.class);
            
            Unmarshaller unmarshaller = context.createUnmarshaller();
            
            PersonaXML personaDeseXML = (PersonaXML) unmarshaller.unmarshal(new File("persona.xml"));
            
            System.out.println(personaDeseXML);
            System.out.println("");
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error al deserializar XML: " + e.getMessage());
            System.out.println("");
        }
 */
}
