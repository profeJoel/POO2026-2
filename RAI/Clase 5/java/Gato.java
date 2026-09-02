//package RAI.Clase 5.java;

public class Gato {
    //Atributos
    private String name;
    private String sex;
    private int age;
    private int weight;
    private String color;
    private String texture;

    //Métodos
    //Método Constructor
    Gato(String name, String sex, int age, int weight, String color, String texture){
        //Palabra reservada para referirse a si mismo. -> this
        //this.name
        //asignación entre los valores externos(parametros) y los valores internos del objeto a través de this.
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.texture = texture;
    }

    void eat(){
        System.out.println(this.name + " está comiendo...");
    }

    void move(){
        System.out.println(this.name + " se está moviendo...");
    }

    void meow(){
        System.out.println(this.name + " hace meowww!!!...");
    }

    void purr(){
        System.out.println(this.name + " hace purrr!!!...");
    }

    void huntMice(){
        System.out.println(this.name + " cazó a Mickey!...");
    }

    public String toString(){
        //Devuelve los valores en formato String
        return "Mi nombre es " + this.name + " y soy " + this.sex + " y tengo " + this.age + " años.";
    }
}
