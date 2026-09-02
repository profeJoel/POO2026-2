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