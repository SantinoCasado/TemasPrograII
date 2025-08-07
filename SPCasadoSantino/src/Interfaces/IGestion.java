package Interfaces;

import java.util.ArrayList;
import models.ProductoFarmaceutico;

public interface IGestion <T extends ProductoFarmaceutico> {           //Puedo simplemente poner generic pero habria que castear despues por el tipo de objeto
    void Agregar( T elemento);
    void Eliminar( T elemento);
    void Modificar(T elemento, int indice);
    ArrayList<T> Listar();
}
