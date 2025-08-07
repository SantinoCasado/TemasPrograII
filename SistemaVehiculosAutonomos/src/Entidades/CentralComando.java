package Entidades;

import java.util.ArrayList;

public class CentralComando {
private ArrayList<VehiculoAutonomo> listaVehiculos;

    public CentralComando(ArrayList<VehiculoAutonomo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public void moverVehiculos(VehiculoAutonomo tipo){
    
        for (VehiculoAutonomo vehiculo :this.listaVehiculos){
        if(vehiculo.getClass().equals(tipo.getClass())){
            vehiculo.moverse();
        }
        }
    }
    public void reportarEstado(VehiculoAutonomo tipo){
    for (VehiculoAutonomo vehiculo :this.listaVehiculos){
        if(vehiculo.getClass().equals(tipo.getClass())){
             
            System.out.println(vehiculo.reportarEstado());
        }
    }
    }
    
    
    public void detenerVehiculos(VehiculoAutonomo tipo){
    for (VehiculoAutonomo vehiculo :this.listaVehiculos){
        if(vehiculo.getClass().equals(tipo.getClass())){
             vehiculo.detenerse();
        }
        }
    }

    
}
