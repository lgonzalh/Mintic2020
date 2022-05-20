 #importar para usar math para el valor de PI
import math
#tomar el radio de la base de un cilindro del usuario
r=float(input("Ingrese r de un cilindro: "))
#tomar la altura de la superficie curva de un cilindro del usuario
h=float(input("Ingrese la altura de un cilindro: "))
#calcular el area de la superficie del cilindro
s_area=2*math.pi*pow(r,2)*h
#calcular el volumen del cilindro
volumen=math.pi*pow(r,2)*h
print("El área de la superficie de un cilindro será %.2f" %s_area)
print("el volumen de un cilindro será %.2f" %volumen)