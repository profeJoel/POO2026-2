//package RAI.Clase 7.java;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Animal a1 = new Animal("Lorous", "macho", "paco", LocalDate.of(2002, 12, 12));

        System.out.println("El animal es: " + a1.getNombre());
        a1.come();
        a1.haceSonido();

        Perro rocky = new Perro("Canino", "macho", "Rocky", LocalDate.of(2001, 6, 7), "Fox Terrier", true); 
        
        System.out.println("El Perro es: " + rocky.getNombre());
        rocky.come("carne");
        rocky.haceSonido();

        Gato mishi = new Gato("Felino", "hembra", "Mishi", LocalDate.of(2001, 6, 7), "Rizo Naranjo", true);

        System.out.println("La Gata es: " + mishi.getNombre());
        mishi.come("pescado");
        mishi.haceSonido();

        Vaca lola = new Vaca("Vacuno", "hembra", "Lola", LocalDate.of(2001, 9, 5), 1001, 12);
        
        System.out.println("La Vaca es: " + lola.getNombre());
        lola.come("pasto");
        lola.haceSonido();

        ArrayList<Animal> misAnimales = new ArrayList<Animal>();
        misAnimales.add(a1);
        misAnimales.add(rocky);
        misAnimales.add(mishi);
        misAnimales.add(lola);

        System.out.println("Mis animales son: ");
        for(Animal animal : misAnimales){
            System.out.println("- " + animal.getNombre());
        }

    }
    
}
