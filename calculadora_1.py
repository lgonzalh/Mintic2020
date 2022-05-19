#inicializamos nuestras variables de entrada
mas_operaciones = 's'
def menu ():
  '''
  me muestra un menu de las operaciones 
  que puedo realizar en mi calculadora
  '''

  resultado_0 = ("""
  Menu
  1.Sumar
  2.Restar
  3.Multiplicar
  4.Dividir
  5.Potenciacion
  6.Raiz cuadrada
  7.Modulo
  8.salir
  """)
  return resultado_0

def suma (primer_numero,segundo_numero):
  '''
  suma aritmatica entre dos valores
  Entrada:
    num01 -> int,float: primer numero a operar
    num02 -> int,float: segundo numero a operar
  Retorno : suma aritmetica
  '''
  resultado_1 =primer_numero + segundo_numero
  return resultado_1

def resta (primer_numero,segundo_numero):
  '''
  sustraccion entre dos valores
  Entrada:
    num01 -> int,float: primer numero a operar
    num02 -> int,float: segundo numero a operar
  Retorno : sustraccion
  '''
  resultado_2 =primer_numero - segundo_numero
  return resultado_2

def multiplicacion (primer_numero,segundo_numero):
  '''
  multiplicacion aritmetica entre dos valores
  Entrada:
    num01 -> int,float: primer numero a operar
    num02 -> int,float: segundo numero a operar
  Retorno : multiplicaion aritmetica
  '''
  resultado_3 =primer_numero * segundo_numero
  return resultado_3

def division (primer_numero,segundo_numero):
  '''
  division aritmetica entre dos valores
  Entrada:
    num01 -> int,float: primer numero a operar
    num02 -> int,float: segundo numero a operar
  Retorno : sustraccion
  '''
  resultado_4 =primer_numero / segundo_numero
  return resultado_4

def potenciacion (primer_numero,segundo_numero):
  '''
  sustraccionpotenciacion el primer valor es el netero a operar
  y el segundo es la potencia que se eleva
  Entrada:
    num01 -> int,float: primer numero a operar
    num02 -> int,float: segundo numero a operar
  Retorno : Potenciacion
  '''
  resultado_5 =primer_numero ** segundo_numero
  return resultado_5

def raiz_2 (primer_numero,segundo_numero):
  '''
  raiz cuadrada entre  la suma de dos valores
  Entrada:
    num01 -> int,float: primer numero a operar
    num02 -> int,float: segundo numero a operar
  Retorno : sustraccion
  '''
  resultado_6 =primer_numero + segundo_numero * 0.5
  return resultado_6

#def modulo (primer_numero,segundo_numero):
  #resultado_7 = (primer_numero + segundo_numero) %= 2
  #return resultado_7

#mostramos el menu al usuario
print(menu())

#inicializamos la opcion escogida por el usuario

#el flujo de las diferentes operaciones
while mas_operaciones == 's':
  opcion = eval(input('ingrese la opcion del menu deseada: '))
  primer_numero = eval  (input('digite el primer numero: '))

  segundo_numero =  eval (input('digite el segundo numero: '))
  if opcion == 1:
    print (suma(primer_numero,segundo_numero))
  elif opcion == 2:
    print (resta(primer_numero,segundo_numero))
  elif opcion == 3:
    print (multiplicacion(primer_numero,segundo_numero))
  elif opcion == 4:
    print (division(primer_numero,segundo_numero))
  elif opcion == 5:
    print (potenciacion(primer_numero,segundo_numero))
  elif opcion == 6:
    print (raiz_2(primer_numero,segundo_numero))
  elif opcion == 7:
    print (modulo(primer_numero,segundo_numero)) 
  mas_operaciones = input("desea realizar mas operaciones: ")
  if mas_operaciones == "n":
    print("Gracias por utilizar nuestra calculadora")
