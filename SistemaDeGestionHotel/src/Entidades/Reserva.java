
package Entidades;

import java.time.LocalDate;

public class Reserva {
    private Cliente cliente;
    private Habitacion habitacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Boolean confirmada;

    public Reserva(Cliente cliente, Habitacion habitacion, LocalDate fechaInicio, LocalDate fechaFin) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.confirmada=false;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public Boolean isConfirmada() {
        return confirmada;
    }
    
    public void Confirmar(){
    this.confirmada= true;
    }
    
    public Double calcularTotal(){
        long total = this.fechaFin.toEpochDay()-this.fechaInicio.toEpochDay();
        return total*this.habitacion.getPrecioPorNoche();
    }

    @Override
    public String toString() {
        return "cliente=" + cliente + ", habitacion=" + habitacion + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", confirmada=" + confirmada ;
    }
    
    
    
    
}
