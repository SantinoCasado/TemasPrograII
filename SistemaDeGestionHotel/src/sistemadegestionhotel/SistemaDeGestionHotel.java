
package sistemadegestionhotel;
import Entidades.*;
import java.time.LocalDate;

public class SistemaDeGestionHotel {


    public static void main(String[] args) {
          // Crear hotel
        Hotel hotel = new Hotel("Hotel Central", "Av. Siempre Viva 123");

        // Agregar habitaciones
        Habitacion hab1 = new Habitacion(101, TipoHabitacion.SIMPLE, 100.0);
        Habitacion hab2 = new Habitacion(102, TipoHabitacion.DOBLE, 150.0);
        hotel.agregarHabitacion(hab1);
        hotel.agregarHabitacion(hab2);

        // Agregar recepcionistas
        Recepcionista recep1 = new Recepcionista("Ana", "11111111", "R001");
        Recepcionista recep2 = new Recepcionista("Luis", "22222222", "R002");
        hotel.agregarRecepcionistas(recep1);
        hotel.agregarRecepcionistas(recep2);

        // Crear clientes
        Cliente cli1 = new Cliente("Carlos", "33333333", "carlos@mail.com");
        Cliente cli2 = new Cliente("Laura", "44444444", "laura@mail.com");
        Cliente cli3 = new Cliente("Pedro", "55555555", "pedro@mail.com");
        Cliente cli4 = new Cliente("Sofía", "66666666", "sofia@mail.com");

        // Escenario A: Cliente 1 reserva válida, recepcionista 1 la confirma
        cli1.realizarReserva(hotel, hab1, LocalDate.of(2025, 6, 1), LocalDate.of(2025, 6, 5));
        if (!cli1.getReservas().isEmpty()) {
            recep1.confirmarReserva(cli1.getReservas().get(0), hotel);
        }

        // Escenario B: Cliente 2 reserva en fechas posteriores no solapadas, recepcionista 2 la confirma
        cli2.realizarReserva(hotel, hab1, LocalDate.of(2025, 6, 6), LocalDate.of(2025, 6, 10));
        if (!cli2.getReservas().isEmpty()) {
            recep2.confirmarReserva(cli2.getReservas().get(0), hotel);
        }

        // Escenario C: Cliente 3 intenta reservar con fechas que se solapan (1 al 4 de junio)
        cli3.realizarReserva(hotel, hab1, LocalDate.of(2025, 6, 4), LocalDate.of(2025, 6, 8));

        // Escenario D: Cliente 4 intenta reservar una habitación ocupada sin disponibilidad (3 al 5 de junio)
        cli4.realizarReserva(hotel, hab1, LocalDate.of(2025, 6, 3), LocalDate.of(2025, 6, 5));

        // Mostrar notificaciones de clientes
        System.out.println("\n--- Notificaciones de Clientes ---");
        System.out.println(cli1.getNombre() + ": " + cli1.getNotificaciones());
        System.out.println(cli2.getNombre() + ": " + cli2.getNotificaciones());
        System.out.println(cli3.getNombre() + ": " + cli3.getNotificaciones());
        System.out.println(cli4.getNombre() + ": " + cli4.getNotificaciones());

        // Mostrar notificaciones de recepcionistas
        System.out.println("\n--- Notificaciones de Recepcionistas ---");
        System.out.println(recep1.getNombre() + ": " + recep1.getNotificaciones());
        System.out.println(recep2.getNombre() + ": " + recep2.getNotificaciones());

        // Mostrar reservas confirmadas
        System.out.println("\n--- Reservas Confirmadas ---");
        for (Reserva r : hotel.getReservas()) {
            System.out.println(r);
        }
    }
        }
    
    

