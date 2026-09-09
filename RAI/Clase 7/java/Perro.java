import java.time.LocalDate;

public class Perro extends Animal{
    //atributos
    private String raza;
    private boolean esMascota;

    //métodos
    public Perro(String especie, String sexo, String nombre, LocalDate fechaNacimiento, String raza, boolean esMascota){
        super(especie, sexo, nombre, fechaNacimiento); //<- se preocupa de inicializar el objeto con constructor de la superclase.
        this.raza = raza;
        this.esMascota = esMascota;
    }

    public String getRaza(){
        return this.raza;
    }
    public boolean getEsMascota(){
        return this.esMascota;
    }

    public void setRaza(String newRaza){
        this.raza = newRaza;
    }
    public void setEsMascota(boolean newEsMascota){
        this.esMascota = newEsMascota;
    }

    @Override
    public void haceSonido(){
        System.out.println(this.getNombre() + " hace guau...");
    }
}