class Gato:
    #No es necesario inicializar o declarar los atributos

    #Metodos
    #Método Constructor
    # la palabra reservada para indicar a si mismo -> self
    def __init__(self, name, sex, age, weight, color, texture):
        self.__name = name
        self.__sex = sex
        self.__age = age
        self.__weight = weight
        self.__color = color
        self.__texture = texture

    def eat(self):
        print(self.__name + " está comiendo...")

    def move(self):
        print(self.__name + " se está moviendo...")

    def meow(self):
        print(self.__name + " hace meoww!!!...")

    def purr(self):
        print(self.__name + " hace purrr!!!...")

    def hunt_mice(self):
        print(self.__name + " cazó a Mickey!...")

    def __str__(self):
        return "Mi nombre es " + self.__name + " y soy " + self.__sex + " y tengo " + str(self.__age) + " años."

    #Getters

    def get_name(self):
        return self.__name

    def get_sex(self):
        return self.__sex

    def get_age(self):
        return self.__age

    def get_weight(self):
        return self.__weight

    def get_color(self):
        return self.__color

    def get_texture(self):
        return self.__texture

    # Setters

    def set_name(self, new_name):
        self.__name = new_name

    def set_sex(self, new_sex):
        self.__sex = new_sex

    def set_age(self, new_age):
        self.__age = new_age

    def set_weight(self, new_weight):
        self.__weight = new_weight

    def set_color(self, new_color):
        self.__color = new_color

    def set_texture(self, new_texture):
        self.__texture = new_texture

    def change_color(self, new_color):
        if new_color == "blanco" or new_color == "gris" or new_color == "naranjo":
            self.set_color(new_color)
        else:
            print("Color: " + new_color + " está prohibido...")