from Animal import Animal
from Perro import Perro

import datetime

if __name__ == "__main__":
    a1 = Animal("Lorous", "macho", "paco", datetime.datetime(2002,12,12))
    print(f"El animal es {a1.get_nombre()}")
    a1.come("semillas")
    a1.hace_sonido()

    rocky = Perro("Canino", "macho", "Rocky", datetime.datetime(2001,6,7), "Fox Terrier", True)

    print(f"El Perro es {rocky.get_nombre()}")
    rocky.come("semillas")
    rocky.hace_sonido()

