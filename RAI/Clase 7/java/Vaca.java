import java.time.LocalDate;

public class Vaca extends Animal{
    //atributos
    private int identificador;
    private int cantidadLeche;

    //Método
    public Vaca(String especie, String sexo, String nombre, LocalDate fechaNacimiento, int identificador, int cantidadLeche){
        super(especie, sexo, nombre, fechaNacimiento);
        this.identificador = identificador;
        this.cantidadLeche = cantidadLeche;
    }

    public int getIdentificador(){
        return this.identificador;
    }
    public int getCantidadLeche(){
        return this.cantidadLeche;
    }

    public void setIdentificador(int newIdentificador){
        this.identificador = newIdentificador;
    }

    public void setCantidadLeche(int newCantidadLeche){
        this.cantidadLeche = newCantidadLeche;
    }
    @Override
    public void haceSonido(){
        System.out.println(this.getNombre() + " hace muuu...");
    }
}
