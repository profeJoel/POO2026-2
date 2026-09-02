#from <nombre de archivo> import <nombre de clase>
from Gato import Gato

if __name__ == "__main__":
    #<nombre de objeto> = <nombre de clase>(atributos)
    oscar = Gato("Óscar", "macho", 3,7, "marrón", "rayado")
    #print("El nuevo gato es: " + oscar.__name)

    luna = Gato("Luna", "hembra", 2,5,"gris", "lisa")

    #print("El nuevo gato es: " + luna.__name)

    oscar.eat()
    luna.move()
    oscar.meow()
    luna.purr()
    oscar.hunt_mice()

    print(luna)

    #luna.__color = "rosado"

    #print("La gata " + luna.__name + " es " + luna.__color)