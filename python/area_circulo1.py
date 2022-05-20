#TOMA DE DATOS
r = float(input('Ingrese el radio del circulo: '))
h = float(input('Inhrese la altura del cilindro: '))
pi = float(3.14)


#FUNCIÓN AREA DEL CIRCULO
def circulo ():
    a = pi * r**2
    return a

#FUNCIÓN VOLUMEN DEL CILINDRO
def cilindro():
    v = circulo() * h
    return v

#IMPRIME EL AREA DE UN CIRCULO Y EL VOLUMEN DE UN CILINDRO
print(f'El area del circulo es: {circulo()} el volumen del cilindro es: {cilindro()}')