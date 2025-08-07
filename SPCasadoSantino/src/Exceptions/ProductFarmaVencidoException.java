package Exceptions;


public class ProductFarmaVencidoException extends RuntimeException{
    public ProductFarmaVencidoException(String mensaje) {
        super(mensaje);
    }
}
