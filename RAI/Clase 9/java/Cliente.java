import java.time.LocalDate;

public class Cliente{
    //atributos
    private String rut;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private LocalDate fechaNacimiento;
    private double tarjetaCredito;
    private int pulseraHotel;

    public Cliente(String rut, String nombre, String apPaterno, String apMaterno, LocalDate fechaNacimiento, int tarjetaCredito){
        this.rut = rut;
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.tarjetaCredito = tarjetaCredito;
        //this.pulseraHotel = pulseraHotel;
    }

    public Reserva crearReserva(Habitacion habitacion){
        Reserva reserva = new Reserva(habitacion, this);
        return reserva;
    }

    public void setPulsera(int numPulsera){
        this.pulseraHotel = numPulsera;
    }
}