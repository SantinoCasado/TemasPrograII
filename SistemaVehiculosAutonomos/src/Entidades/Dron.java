/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author borda
 */
public class Dron extends VehiculoAutonomo{
    private String estado ;

    public Dron(String marca, String modelo) {
        super(marca, modelo);
        this.estado = "Sin activar";
    }
    
    
    @Override 
    public void moverse(){
//    if ("Activo".equals(this.estado)){
//    this.estado = "Moviendose";
//    }else{
//        System.out.println("Primero active el dron para volar ");
//    }
    this.estado="Moviendose";
    };
    @Override
    public void detenerse(){
//    if ("Moviendose".equals(this.estado)||"Detenido".equals(this.estado)){
//        System.out.println("Deteniendo el dron");
//        this.estado ="Detenido";
//    }else{
//        System.out.println("El dron ya esta detenido ");
//    }
    this.estado="Detenido";
    };
    @Override
    public String reportarEstado(){
    return this.marca+" " + this.modelo +" "+this.estado;
    };
    
    public void especificoVolar(){
    this.estado = "Activo Volando";
    }
    
}
