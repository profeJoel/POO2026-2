//package RAI.Clase 7.java;

import java.time.LocalDate;

public class Animal {
    //Atributos
    private String especie;
    private String sexo;
    private String nombre;
    private LocalDate fechaNacimiento;

    //Métodos
    public Animal(String especie, String sexo, String nombre, LocalDate fechaNacimiento){
        this.especie = especie;
        this.sexo = sexo;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Animal(String nombre){
        this.nombre = nombre;
    }

    public String getEspecie(){
        return this.especie;
    }

    public String getSexo(){
        return this.sexo;
    }

    public String getNombre(){
        return this.nombre;
    }

    public LocalDate getFechaNacimiento(){
        return this.fechaNacimiento;
    }

    public void setEspecie(String newEspecie){
        this.especie = newEspecie;
    }

    public void setSexo(String newSexo){
        this.sexo = newSexo;
    }

    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }

    public void setFechaNacimiento(LocalDate newFechaNacimiento){
        this.fechaNacimiento = newFechaNacimiento;
    }

    //comportamiento
    public void come(String cosa){
        System.out.println(this.nombre + " está comiendo " + cosa);
    }

    public void come(){
        System.out.println(this.nombre + " está comiendo algo");
    }

    public void haceSonido(){
        System.out.println(this.nombre + " hace un sonido...");
    }
}
