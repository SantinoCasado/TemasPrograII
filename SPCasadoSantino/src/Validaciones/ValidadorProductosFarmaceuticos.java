package Validaciones;


import Exceptions.*;
import java.time.LocalDate;


public class ValidadorProductosFarmaceuticos {
    public static void validarNombre(String nombre){
        if (nombre == null || nombre.isBlank()) {
            throw new DatoErroneoException("El nombre no puede estar vacío.");
        }
    }
     public static void validarDosis(String dosis){
        if (dosis == null || dosis.isBlank()) {
            throw new DatoErroneoException("La dosis no puede estar vacía.");
        }
      }
      
    public static void ValidarFechaVencimiento(LocalDate fechaVencimiento){
        if (fechaVencimiento == null) {
            throw new DatoErroneoException("La fecha de vencimiento no puede ser anterior a hoy.");
        }
        if (fechaVencimiento.isBefore(LocalDate.now())) {
            throw new ProductFarmaVencidoException("No se puede agregar productos vencidos!!");
        }
    }

    public static void validarObjetivo(String objetivo){
        if (objetivo == null || objetivo.isBlank()) {
            throw new DatoErroneoException("El campo 'Objetivo' no puede estar vacío.");
        }
    }
}

