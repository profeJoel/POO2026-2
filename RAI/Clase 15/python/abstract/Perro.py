from Animal import Animal

class Perro(Animal):

    def __init__(self, especie, nombre, pelaje):
        super().__init__(especie, nombre)
        self.pelaje = pelaje

    def hace_sonido(self):
        print(self.nombre + " ladra...")