class Animal:
    def __init__(self, especie, sexo, nombre, fecha_nacimiento=None):
        self.especie = especie
        self.sexo = sexo
        self.nombre = nombre
        self.fecha_namiciento = fecha_nacimiento

    def get_especie(self):
        return self.especie

    def get_sexo(self):
        return self.sexo

    def get_nombre(self):
        return self.nombre
    
    def get_fecha_nacimiento(self):
        return self.fecha_namiciento

    def set_especie(self, new_especie):
        self.especie = new_especie

    def set_sexo(self, new_sexo):
        self.sexo = new_sexo

    def set_nombre(self, new_nombre):
        self.nombre = new_nombre

    def set_fecha_nacimiento(self, new_fecha_nacimiento):
        self.fecha_nacimiento = new_fecha_nacimiento

    # comportamiento

    def come(self, cosa=None):
        if cosa == None:
            print(f"{self.nombre} come algo")
        else:
            print(f"{self.nombre} come {cosa}")

    def hace_sonido(self):
        print(f"{self.nombre} hace un sonido...")