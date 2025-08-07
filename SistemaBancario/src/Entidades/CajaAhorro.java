/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author borda
 */
public class CajaAhorro extends ProductoFinanciero{

    public CajaAhorro(Double saldo, String titular) {
        super(saldo, titular);
    }

    @Override
    public double calcularIntereses() {
        Double intereses = this.saldo*0.02;
            
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
