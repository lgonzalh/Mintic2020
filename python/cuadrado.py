import numpy as np

def cuadrado(ancho,alto):
    rectangulo = ancho * alto
    division = rectangulo / ancho

    contador = 0

    print(f'Anchura del rectangulo: {ancho}')
    print(f'Altura del rectangulo: {alto}')

    while contador < division:
        array_alto = np.arange(ancho)
        print(array_alto)
        contador = contador + 1

cuadrado(10,10)