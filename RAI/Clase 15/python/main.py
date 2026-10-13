from clase_grande import clase_grande
#from clase_grande.clase_grande import clase_chica


if __name__ == "__main__":
    objeto_grande = clase_grande("verde")
    objeto_chico = objeto_grande.crear_clase_chica("Hola")
    print("Fin")