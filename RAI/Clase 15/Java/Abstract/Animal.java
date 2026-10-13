
abstract class Animal {
    //atributos
    protected String especie;
    protected String nombre;

    //constructor
    public Animal(String especie, String nombre){
        this.especie = especie;
        this.nombre = nombre;
    }

    abstract void haceSonido();

    public void come(String comida){
        System.out.println(this.nombre + " come " + comida);
    }
}
