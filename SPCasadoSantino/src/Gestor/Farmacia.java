package Gestor;

import Exceptions.ProductoFarmaceuticoRepetidoException;
import Interfaces.IGestion;
import Validaciones.ValidadorProductosFarmaceuticos;
import java.time.LocalDate;
import java.util.ArrayList;
import models.ProductoFarmaceutico;

public class Farmacia implements IGestion{ 
    private ArrayList<ProductoFarmaceutico> productosFarmaceuticos;

    public Farmacia() {
        this.productosFarmaceuticos = new ArrayList<>();
    }
    
    @Override
    public void Agregar(ProductoFarmaceutico producto){
        if (this.productosFarmaceuticos.contains(producto)){
           throw new ProductoFarmaceuticoRepetidoException("El medicamento ya se encuentra cargado!");          //Agrege el equals y la validacion de la fecha en ProductoFarmaceutico
       }
       this.productosFarmaceuticos.add(producto);
       //System.out.println("medicamento Agregado");              //Evitar uso de println solo para uso propio despues eliminar
    }
    
    @Override
    public void Eliminar(ProductoFarmaceutico producto){
        this.productosFarmaceuticos.remove(producto);
    }
    
    @Override
    public void Modificar(ProductoFarmaceutico productoModificado, int indice){         //Agrego el modificar
        //Verifico que el modificado tenga los mismo atributos que otro producto ya creado
        if (this.productosFarmaceuticos.contains(productoModificado)){
           throw new ProductoFarmaceuticoRepetidoException("El medicamento ya se encuentra cargado!");          
       }
        
        productosFarmaceuticos.set(indice, productoModificado);
    }
    
    public ArrayList<ProductoFarmaceutico> FiltrarProductoFarmaceutico(int limiteDiasVencimiento){                //Agrego el filtrado
        LocalDate fechaLimite = LocalDate.now().plusDays(limiteDiasVencimiento);        //Tratar de usar solo plusDays
        ArrayList productosFiltrados = new ArrayList<>();
        
        for (ProductoFarmaceutico producto : productosFarmaceuticos) {
            //Verifico que este entre las fechas
            if (producto.getFechaVencimiento().isAfter(LocalDate.now()) && producto.getFechaVencimiento().isBefore(fechaLimite)) {
                productosFiltrados.add(producto);
            }
        }
        
        return productosFiltrados;
    }
    
    @Override
    public ArrayList<ProductoFarmaceutico> Listar(){
        return this.productosFarmaceuticos;
    }

}
