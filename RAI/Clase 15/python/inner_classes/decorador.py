from dataclasses import dataclass

@dataclass
class animal:
    #Los atributos
    especie: str
    nombre: str
    cant_patas: int

if __name__ == "__main__":
    perro = animal("canino", "firulais", 4)
    print(perro)