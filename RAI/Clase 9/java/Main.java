import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Habitacion penthouse = new Habitacion(1, "Penthouse Volcanes", "Penthouse", 2, 2, 2, 500000, 2, 4, "Vista a los Volcanes orientación NE");

        Cliente pedro = new Cliente("123456789-1", "Pedro", "Pedreros", "Pedriza", LocalDate.of(1990, 5, 15), 1234123412341234);

        Pasajero fedra = new Pasajero("87654321-0", "Fedra", "Piñera", "Kast", LocalDate.of(1998, 8, 8), 4321432143214321);

        Reserva reserva = pedro.crearReserva(penthouse);
        reserva.agregarPasajero(fedra);
        
        reserva.iniciarEstadia();
        reserva.finalEstadia();
        reserva.calcularMontoTotal();
    }
}
