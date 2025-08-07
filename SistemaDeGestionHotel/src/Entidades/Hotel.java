
package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {
    private String nombre,direccion;
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Recepcionista> recepcionistas;
    private ArrayList<Reserva> reservas;
    
    public Hotel(){
    this.habitaciones = new ArrayList<>();
    this.recepcionistas = new ArrayList<>();
    this.reservas = new ArrayList<>();
    }

    public Hotel(String nombre, String direccion) {
        this();
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public ArrayList<Recepcionista> getRecepcionistas() {
        return recepcionistas;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
    
    
    public void agregarHabitacion(Habitacion e){
    this.habitaciones.add(e);
    }
    
    public void agregarRecepcionistas(Recepcionista r){
    this.recepcionistas.add(r);
    }
    
    public void agregarReserva(Reserva r){
    if(r.isConfirmada()){
    this.reservas.add(r);
        System.out.println("Reserva agregada" );
    }else{
        System.out.println("no se agrego ,verfique disponibilidad " );
    }
    }
    

public ArrayList<Habitacion> buscarHabitacionesDisponibles(LocalDate inicio, LocalDate fin, TipoHabitacion tipo) {
    ArrayList<Habitacion> disponibles = new ArrayList<>();

    for (Habitacion h : habitaciones) {
        if (h.getTipo() == tipo) {
            boolean estaOcupada = false;

            for (Reserva r : reservas) {
                if (r.getHabitacion().equals(h)) {
                    boolean seSolapan = !(r.getFechaFin().isBefore(inicio) || r.getFechaInicio().isAfter(fin));
                    if (seSolapan) {
                        estaOcupada = true;
                        break;
                    }
                }
            }

            if (!estaOcupada) {
                disponibles.add(h);
            }
        }
    }

    return disponibles;
}
}  
//    public ArrayList<Habitacion> buscarHabitacionesDisponibles(LocalDate inicio,LocalDate fin , TipoHabitacion thabitacion){
//       ArrayList<Habitacion> hab_disp = new ArrayList();
//       for(Habitacion habitacion : this.habitaciones){
//           boolean flag = true;
//           if(habitacion.getTipo() == thabitacion){
//               if(this.reservas.isEmpty() && flag == true){
//                hab_disp.add(habitacion);
//                flag = false;
//               }
//                if(this.recorrerReservas(habitacion, inicio, fin))  {
//                hab_disp.add(habitacion);
//            
//                }
//             
//          }
//        
//       }
//        return hab_disp;
//    
//    }
//
//    
//    private boolean recorrerReservas( Habitacion habitacion,LocalDate inicio, LocalDate fin){
//       boolean flag = false;
//        for(Reserva reservasrealizadas : this.reservas){
//            if(reservasrealizadas.getHabitacion().equals(habitacion)){
//                   if (!(reservasrealizadas.getFechaFin().isBefore(inicio) || reservasrealizadas.getFechaInicio().isAfter(fin))) {
//                        flag = true;
//                    }
//             }
//        }
//        return flag;
//     }



