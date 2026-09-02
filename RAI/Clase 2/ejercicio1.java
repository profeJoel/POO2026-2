//package RAI.Clase 2;
import java.util.Scanner;

public class ejercicio1 {

    static int potencia(int b, int e){
        int p = 1;
        for(int i=0; i<e; i++){
            p = p * b;
        }
        return p;
    }

    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int b, exp;
        do{
            System.out.println("Ingrese la base: ");
            b = lector.nextInt();
        }while(b<=0);
        do{
            System.out.println("Ingrese el exponente");
            exp = lector.nextInt();
        }while(exp<=0);
        int pot = potencia(b, exp);

        /*
        for(int i=0; i<exp; i++){
            potencia = potencia * b;
        }
        */

        System.out.println("El resultado de la potencia es " + pot);
    }
}
