package Clase_11;

// Extiendo como padre la excepcion Runtime para poder acceder a sus atributos y metodos
public class Excepcion_Propia extends RuntimeException {
    // En el mismo constructori modifico el mensaje por determinado que tiene la excepcion
    public Excepcion_Propia(String mensaje){
        super(mensaje);
    }
}
