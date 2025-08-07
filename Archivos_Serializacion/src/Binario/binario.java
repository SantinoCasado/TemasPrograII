package Binario;


public class binario {
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
        
        //DESERIALIZACION BINARIA
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.dat"))) {
            
            Persona personaBinaria = (Persona) ois.readObject();
            
            System.out.println(persona);
            
            System.out.println("");
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error al deserializar BINARIO: " + e.getMessage());
            System.out.println("");
        }
        
        //SERIALIZAR LISTA BINARIO
        List<Persona> personasBinario = new ArrayList<>();
        
        personasBinario.add(new Persona("Jose", 30));
        personasBinario.add(new Persona("Federico", 25));
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personas.dat"))) {
            
            oos.writeObject(personasBinario); // la lista debe ser Serializable y los objetos también
            
            System.out.println("Lista binaria serializada con exito");
            System.out.println("");
            
        } catch (IOException e) {
            
            System.out.println("Ocurrio un error al serializar lista BINARIO: " + e.getMessage());
            System.out.println("");
        }
        
        //DESERIALIZAR LISTA BINARIO
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personas.dat"))) {
            
            List<Persona> personas = (List<Persona>) ois.readObject();
            personas.forEach(System.out::println);
            System.out.println("");
            
        } catch (IOException | ClassNotFoundException e) {
             System.out.println("Ocurrio un error al deserializar lista BINARIO: " + e.getMessage());
             System.out.println("");
        }
    */
}
