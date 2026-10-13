

public class Main {
    
    public static void main(String[] args){
        ClaseGrande objetoGrande = new ClaseGrande("rojo");
        //ClaseChica objetoChico = new ClaseChica("Hola");

        //Opcion 1: utilizar un objeto mayor
        //ClaseGrande.ClaseChica objetoChico = objetoGrande.ClaseChica();

        //Opcion 2: Utilizar encapsulamiento
        ClaseGrande.ClaseChica objetoChico = objetoGrande.crearClaseChica("Hola");
    }
}
