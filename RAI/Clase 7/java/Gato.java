import java.time.LocalDate;

public class Gato extends Animal{
    //Atributos
    private String pelaje;
    private boolean tieneGarrasFilosas;

    //Métodos
    public Gato(String especie, String sexo, String nombre, LocalDate fechaNacimiento, String pelaje, boolean tieneGarrasFilosas){
        super(especie, sexo, nombre, fechaNacimiento);
        this.pelaje = pelaje;
        this.tieneGarrasFilosas = tieneGarrasFilosas;
    }

    public String getPelaje(){
        return this.pelaje;
    }

    public boolean getTieneGarrasFilosas(){
        return this.tieneGarrasFilosas;
    }

    public void setPelaje(String newPelaje){
        this.pelaje = newPelaje;
    }

    public void setTieneGarrasFilosas(boolean newTieneGarrasFilosas){
        this.tieneGarrasFilosas = newTieneGarrasFilosas;
    }

    @Override
    public void haceSonido(){
        System.out.println(this.getNombre() + " hace miau...");
    }
}
