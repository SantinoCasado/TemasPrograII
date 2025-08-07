
package Entidades;


public abstract class ProductoFinanciero {
    protected Double saldo;
    protected String titular;

    public ProductoFinanciero(Double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public abstract double calcularIntereses();
    public abstract String resumenMensual();
    
    
}
