
package Entidades;

import java.time.LocalDate;


public class Recepcionista extends Persona {
    private String legajo;

    public Recepcionista(String legajo) {
        this.legajo = legajo;
    }

    public Recepcionista(String legajo, String persona, String dni) {
        super(persona, dni);
        this.legajo = legajo;
    }

    @Override
    public void notificar(String notificacion) {
        super.agregarNotificaciones(notificacion);
    }

    public String getLegajo() {
        return legajo;
    }
    
    public void confirmarReserva(Reserva reserva,Hotel hotel){
        if (hotel.buscarHabitacionesDisponibles(reserva.getFechaInicio(), reserva.getFechaFin(), reserva.getHabitacion().getTipo()).isEmpty()){
            System.out.println("No Hay habitaciones disponibles" );
        }else if (!reserva.isConfirmada()){
        
        reserva.Confirmar();
        hotel.agregarReserva(reserva);
        this.notificar("Se realizo la reserva: " + reserva.toString());
        
        }else{
            System.out.println("no se puede confirmar la misma reserva dos veces ");
        }
        }
        
        
    
    
    
}
