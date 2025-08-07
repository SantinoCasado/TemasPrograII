package Entidades;


public class CuentaCorriente extends ProductoFinanciero {

    public CuentaCorriente(Double saldo, String titular) {
        super(saldo, titular);
    }

    @Override
    public double calcularIntereses() {
             Double intereses = this.saldo*0.05;
            
    return intereses;
        
    }

    @Override
    public String resumenMensual() {
         StringBuilder sb = new StringBuilder();
        sb.append("Titular: ").append(this.titular);
        sb.append("\n");
        sb.append("Saldo: ").append(this.saldo);
        sb.append("\n");
        sb.append("Intereses: ").append(calcularIntereses());
        
        return sb.toString();
    }
    
}
