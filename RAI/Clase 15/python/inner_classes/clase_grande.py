class clase_grande:

    class clase_chica:
        def __init__(self, mensaje):
            self.mensaje = mensaje

    def __init__(self, color):
        self.color = color

    def crear_clase_chica(self, mensaje):
        objeto_chico = self.clase_chica(mensaje)
        return objeto_chico