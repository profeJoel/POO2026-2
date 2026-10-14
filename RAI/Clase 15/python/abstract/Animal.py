from abc import ABC, abstractmethod

class Animal(ABC):

    def __init__(self, especie, nombre):
        self.especie = especie
        self.nombre = nombre

    @abstractmethod
    def hace_sonido(self):
        pass

    def come(self, comida):
        print(self.nombre + " come " + comida)