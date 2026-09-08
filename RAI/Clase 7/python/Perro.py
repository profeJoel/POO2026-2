from Animal import Animal

class Perro(Animal):

    def __init__(self, especie, sexo, nombre, fecha_nacimiento, raza, es_mascota):
        super().__init__(especie, sexo, nombre, fecha_nacimiento)
        self.raza = raza
        self.es_mascota = es_mascota