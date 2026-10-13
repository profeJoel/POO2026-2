public class ClaseGrande{
    //Atributos

    private String color;

    class ClaseChica{
        //atributo
        String mensaje;

        //Constructor
        public ClaseChica(String mensaje){
            this.mensaje = mensaje;
        }
    }

    public ClaseGrande(String color){
        this.color = color;
    }

    public ClaseChica crearClaseChica(String mensaje){
        ClaseChica objetoChico = new ClaseChica(mensaje);
        return objetoChico;
    }
}