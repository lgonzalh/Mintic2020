import math #importa libreria math

def suma(a,b):
    return a + b

def resta(a,b):
    return a - b

def multiplica(a,b):
    return a * b

def divide(a,b):
    return a/b

def potencia(a,b):
    a2 = a * a
    b2 = b * b
    return a2,b2

def raiz(a):
    return math.sqrt(a)

def modulo(a,b):
    return a%b

def menu():
    print("1. Suma")
    print("2. Resta")
    print("3. Multiplica")
    print("4. Division")
    print("5. Potencia")
    print("6. Raiz Cuadrada")
    print("7. Modulo")

    op = input("--> ")
    a = float(input("Digite 1er. numero: "))
    b = float(input("Digite 2do. numero: "))

    if op == "1":
       total = suma(a,b)
    elif op == "2":
       total = resta(a,b)
    elif op == "3":
       total = multiplica(a,b)
    elif op == "4":
       total = divide(a,b)
    elif op == "5":
       total = potencia(a,b)
    elif op == "6":
       total = raiz(a)
    elif op == "7":
       total = modulo(a,b)
    return total

mi_total = menu()
print(mi_total)