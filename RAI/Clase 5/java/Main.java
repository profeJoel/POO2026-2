
public class Main {
    public static void main(String[] args){
        //Creación de objetos
        //[Clase] [nombre del objeto]
        Gato oscar;
        
        //Instanciación
        //[nombre del objeto] = new [Clase](valores del objeto)
        oscar = new Gato("Óscar", "macho", 3, 7, "marrón", "rayado");

        System.out.println("El nuevo gato es: " + oscar.getName());

        Gato luna = new Gato("Luna", "hembra", 2, 5, "gris", "lisa");

        System.out.println("El nuevo gato es: " + luna.getName());

        oscar.eat();
        luna.move();
        oscar.meow();
        luna.purr();
        oscar.huntMice();

        System.out.println(luna.toString());

        //luna.color = "rosado";
        luna.changeColor("blanco");
        System.out.println("La gata " + luna.getName() + " es " + luna.getColor());
    }
}
