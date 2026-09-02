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

    //getters
    //[visibilidad] [tipo de datos] get[Nombre atributo]()
    public String getName(){
        return this.name;
    }

    public String getSex(){
        return this.sex;
    }

    public int getAge(){
        return this.age;
    }

    public int getWeight(){
        return this.weight;
    }

    public String getColor(){
        return this.color;
    }

    public String getTexture(){
        return this.texture;
    }

    // Setter
    // public [void] set[nombre Atributo]([tipo argumento] newArgumento)
    public void setName(String newName){
        this.name = newName;
    }

    public void setSex(String newSex){
        this.sex = newSex;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public void setWeight(int newWeight){
        this.weight = newWeight;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    public void setTexture(String newTexture){
        this.texture = newTexture;
    }

    public void changeColor(String newColor){
        if(newColor == "blanco" || newColor == "gris" || newColor == "naranjo"){
            this.setColor(newColor);
        }
        else{
            System.out.println("Color: " + newColor + " está prohibido...");
        }
    }
}
