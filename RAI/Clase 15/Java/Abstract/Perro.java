public class Perro extends Animal{

    private String pelaje;

    public Perro(String especie, String nombre, String pelaje){
        super(especie, nombre);
        this.pelaje = pelaje;
    }

    @Override 
    void haceSonido(){
        System.out.println(this.nombre + " hace guau...");
    }
    
}
