from typing import Protocol

class Vehiculo(Protocol):

    def acelerar(self) -> None:
        ...