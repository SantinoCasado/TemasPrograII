
package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;


public class Cliente extends Persona{
    private String mail;
    private ArrayList<Reserva> reservas;


    public Cliente( String persona, String dni,String mail) {
        super(persona, dni);
        this.mail = mail;
        this.reservas = new ArrayList<>();

    }

    @Override
    public void notificar(String notificacion) {
    super.agregarNotificaciones(notificacion);
    }

    public String getMail() {
        return mail;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
    
    public void realizarReserva(Hotel hotel,Habitacion habitacion,LocalDate inicio, LocalDate fin){
     ArrayList<Habitacion> hab_disp = new ArrayList();   
     hab_disp = hotel.buscarHabitacionesDisponibles(inicio, fin, habitacion.getTipo());
        System.out.println(hab_disp);
     if(hab_disp.contains(habitacion)){
       Reserva r = new Reserva(this,habitacion,inicio,fin);
       this.reservas.add(r);
       this.notificar("Reserva realizada por el cliente : "+this.getNombre()+this.getDni()+ " en Habitacion " + r.toString());
        System.out.println("se realizo la reserva " );
     }else{
         System.out.println("No esta disponible la habitacion " );
     }
     
    }
    }
    
    
    
    
    
    
    

