package Entidades;

import java.util.ArrayList;

public class Taller {
 private ArrayList<Herramienta> coleccionDeHerramientaS;
 private int cantidadMaxima;

    public Taller( int cantidadMaxima) {
        this.coleccionDeHerramientaS = new ArrayList();
        this.cantidadMaxima = cantidadMaxima;
    }
    
    public Boolean agregarHerramientas(Herramienta herramienta){
    Boolean flag = false;
    if (this.coleccionDeHerramientaS.size()<this.cantidadMaxima){
        flag= true;
        this.coleccionDeHerramientaS.add(herramienta);
    }     
                    
     return flag ;
    }
    
    public int getCantidadHerramientas(){
    
        return this.coleccionDeHerramientaS.size();
    }
    
    public String mostrarHerramientas(){
    StringBuilder sb = new StringBuilder();
    for (Herramienta herramienta : coleccionDeHerramientaS){
        sb.append(herramienta instanceof Taladro
                ? ((Taladro) herramienta).mostrarTaladro()
                : ((LlaveInglesa) herramienta).mostrarLlaveInglesa());
    }
    
    return sb.toString();
    }
}
