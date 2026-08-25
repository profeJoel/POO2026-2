"""Retorna True si es perfecto, sino False"""
def es_perfecto(n):
    suma_div = 0
    i=1
    while i<n:
        if n%i == 0:
            suma_div += i
        i += 1
    return suma_div == n

if __name__ == "__main__":
    vector = []
    cant = 5
    print("Hola Mundo")

    for numero in range(cant):
        x = int(input("Ingrese un valor"))
        vector.append(0 if es_perfecto(x) else x)

    for numero in vector:
        print(f"Valor: {numero}")

    
