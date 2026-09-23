

public class Habitacion{
    //atributos
    private int numHabitacion;
    private String nombre;
    private String tipo;
    private int cantCamas;
    private int cantHabitaciones;
    private int cantBanhos;
    private double montoPorNoche;
    private int capacidadRecomendada;
    private int capacidadMaxima;
    private String descripcion;

    public Habitacion(int numHabitacion, String nombre, String tipo, int cantCamas, int cantHabitaciones, int cantBanhos, double montoPorNoche, int capacidadRecomendada, int capacidadMaxima, String descripcion){
        this.numHabitacion = numHabitacion;
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantCamas = cantCamas;
        this.cantHabitaciones = cantHabitaciones;
        this.cantBanhos = cantBanhos;
        this.montoPorNoche = montoPorNoche;
        this.capacidadRecomendada = capacidadRecomendada;
        this.capacidadMaxima = capacidadMaxima;
        this.descripcion = descripcion;
    }

    public double getMontoPorNoche(){
        return this.montoPorNoche;
    }
}