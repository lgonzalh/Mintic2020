import math
def area(radio):
  '''
    1. La función calcula el área de un círculo
    2. Entrada:
          radio -> medida del radio del círculo
    3. Retorna la multiplicación de pi por el radio elevado al cuadrado, resultado que corresponde al área del círculo.
  '''
  a = m.pi * m.pow(radio, 2)
  return a

def volumen(altura, radio):
  '''
    1. La función calcula el volúmen de un cilindro respecto a la función anterior (area del círculo)
    2. Entrada:
          radio -> medida del radio del círculo
          altura -> medida de la altura del cilindro
    3. Retorna la multiplicación del área calculada en la función anterior por la áltura del cilindro.
  '''
  v = area(radio) * altura
  return v

print("CALCULADORA DEL ÁREA DE UN CÍRCULO")
radio = eval(input("Ingrese el valor del radio: "))
x = area(radio)
print("Área del triangulo: ", round(x, 2))

print()

print("CALCULADORA DEL VOLÚMEN DE UN CILÍNDRO")
altura = eval(input("Ingrese la altura del cilindro: "))
y = volumen(altura, radio)
print("Volúmen del cilindro: ", round(y, 2))