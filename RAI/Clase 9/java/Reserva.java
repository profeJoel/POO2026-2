import java.time.LocalDate;
import java.util.ArrayList;

public class Reserva{
    //atributos
    private Habitacion habitacion;
    private Cliente cliente;
    private ArrayList<Pasajero> pasajeros;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;

    public Reserva(Habitacion habitacion, Cliente cliente){
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.pasajeros = ArrayList<Pasajero>();
    }

    public void agregarPasajero(Pasajero pasajero){
        this.pasajeros.add(pasajero);
    }

    public void iniciarEstadia(int numPulsera){
        this.fechaInicio = LocalDate.now();
        this.cliente.setPulsera(numPulsera);

        int i = 1;
        for(Pasajero p : this.pasajeros){
            p.setPulsera(numPulsera + i);
            i++;
        }
    }

    public void finalEstadia(){
        this.fechaFinal = LocalDate.now();
    }

    public double calcularMontoTotal(){
        int noches = this.fechaFinal - this.fechaInicio;
        double total = this.habitacion.getMontoPorNoche() * noches;
    }
}