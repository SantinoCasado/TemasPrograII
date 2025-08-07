/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;


public class Taladro extends Herramienta{
    private int RPM;
    private Boolean inalambrico;

    public Taladro(String marca, int peso,int RPM, Boolean inlamabrico) {
        super(marca,peso);
        this.RPM = RPM;
        this.inalambrico = inlamabrico;
    }
    
    public String mostrarTaladro(){
    StringBuilder sb = new StringBuilder(super.mostrarHerramienta());
    sb.append("RPM : ").append(this.RPM).append("\n");
     sb.append(this.inalambrico ? "Si" : "No").append("\n");
    
    return sb.toString();
            }
    
    
}
